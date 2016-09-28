package com.postmen.javasdk.service;

import java.io.IOException;
import java.util.Map;

import com.postmen.javasdk.config.Config;
import com.postmen.javasdk.handler.Handler;
import com.postmen.javasdk.model.RateRequest;
import com.postmen.javasdk.model.RateResponse;
import com.postmen.javasdk.model.RatesResponse;
import com.postmen.javasdk.util.PostmenUrl;

public class RateService extends Service{
	
	/**
	 * Instantiates a service to manipulate rates
	 * @param config Configuration built by ConfigBuilder
	 */
	public RateService(Config config) {
		super(config, "rates");
	}
	
	/**
	 * Creates a rate
	 * @param req Rate request object
	 * @return Rate response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public RateResponse create(RateRequest req) throws IOException {
		PostmenUrl url = getUrl();
		RateResponse response = post(getHandler(), url, req, RateResponse.class);
		return response;
	}
	
	/**
	 * Creates a rate with custom configuration
	 * @param req Rate request object
	 * @param config Custom configuration for this request
	 * @return Rate response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public RateResponse create(RateRequest req, Config config) throws IOException {
		PostmenUrl url = getUrl(config);
		RateResponse response = post(new Handler(config), url, req, RateResponse.class);
		return response;
	}
	
	/**
	 * Gets all rate objects you have
	 * @return Rates response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public RatesResponse get() throws IOException {
		PostmenUrl url = getUrl();
		RatesResponse response = get(getHandler(), url, RatesResponse.class);
		return response;
	}
	
	/**
	 * Gets all rate objects you have with custom configuration
	 * @param config Custom configuration for this request
	 * @return Rates response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public RatesResponse get(Config config) throws IOException {
		PostmenUrl url = getUrl(config);
		RatesResponse response = get(new Handler(config), url, RatesResponse.class);
		return response;
	}
	
	/**
	 * Get rates with query parameters
	 * @param query Query parameters in a Map
	 * @return Rates response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public RatesResponse getWithParam(Map<String, String> query) throws IOException {
		PostmenUrl url = getUrl().addQueries(query);
		RatesResponse ratesResponse = get(getHandler(), url, RatesResponse.class);
		return ratesResponse;
	}
	
	/**
	 * Get rates with query parameters
	 * @param query Query parameters in a Map
	 * @param config Custom configuration for this request
	 * @return Rates response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public RatesResponse getWithParam(Map<String, String> query, Config config) throws IOException {
		PostmenUrl url = getUrl(config).addQueries(query);
		RatesResponse ratesResponse = get(new Handler(config), url, RatesResponse.class);
		return ratesResponse;
	}
	
	/**
	 * Get rates with query parameters in String
	 * @param query Query parameters in a String beginning with ?
	 * @return Rates response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public RatesResponse getWithParam(String query) throws IOException {
		PostmenUrl url = getUrl().appendPath(query);
		RatesResponse ratesResponse = get(getHandler(), url, RatesResponse.class);
		return ratesResponse;
	}
	
	/**
	 * Get rates with query parameters
	 * @param query Query parameters in a String beginning with ?
	 * @param config Custom configuration for this request
	 * @return Rates response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public RatesResponse getWithParam(String query, Config config) throws IOException {
		PostmenUrl url = getUrl(config).appendPath(query);
		RatesResponse ratesResponse = get(new Handler(config), url, RatesResponse.class);
		return ratesResponse;
	}
	
	/**
	 * Get rate with rate id
	 * @param id Id of the rate object
	 * @return Rate response
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public RateResponse getById(String id) throws IOException {
		PostmenUrl url = getUrl().appendPath(id);
		RateResponse response = get(getHandler(), url, RateResponse.class);
		return response;
	}
	
	/**
	 * Get rate with rate id and custom configuration
	 * @param id Id of the rate object
	 * @param config Custom configuration for this request
	 * @return Rate response
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public RateResponse getById(String id, Config config) throws IOException {
		PostmenUrl url = getUrl(config).appendPath(id);
		RateResponse response = get(new Handler(config), url, RateResponse.class);
		return response;
	}
}
