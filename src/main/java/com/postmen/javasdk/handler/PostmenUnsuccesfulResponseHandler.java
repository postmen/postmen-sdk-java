package com.postmen.javasdk.handler;

import java.io.IOException;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.util.BackOff;
import com.google.api.client.util.BackOffUtils;
import com.google.api.client.util.Sleeper;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.postmen.javasdk.model.Response;

public class PostmenUnsuccesfulResponseHandler {
	
	private int retriesLeft;
	private Sleeper sleeper;
	private BackOff expBackOff;
	
	public PostmenUnsuccesfulResponseHandler(Sleeper sleeper, ExpBackOff expBackOff, int retriesLeft) {
		this.sleeper = sleeper;
		this.expBackOff = expBackOff;
		this.retriesLeft = retriesLeft;
	}
	
	public <T extends Response> boolean handleResponse(HttpRequest request, T response, boolean shouldRetry) {
		Boolean retry = true;
		try {
			if (retriesLeft > 0 && shouldRetry) {
				Boolean retryable = response.getMeta().isRetryable();
				if (retryable == null) {
					retryable = false;
				}
				if(retryable) {
					BackOffUtils.next(sleeper, expBackOff);
					retriesLeft--;
				} else {
					retry = false;
					
				}
			} else {
				retry = false;
			}
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retry;
	}
}
