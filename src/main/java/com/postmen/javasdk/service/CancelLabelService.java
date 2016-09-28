package com.postmen.javasdk.service;

import java.io.IOException;
import java.util.Map;

import com.postmen.javasdk.config.Config;
import com.postmen.javasdk.handler.Handler;
import com.postmen.javasdk.model.CancelLabelRequest;
import com.postmen.javasdk.model.CancelLabelResponse;
import com.postmen.javasdk.model.CancelLabelsResponse;
import com.postmen.javasdk.util.PostmenUrl;

public class CancelLabelService extends Service {
	
	/**
	 * Instantiates a Service that manipulates cancel labels
	 * @param config Configuration built by ConfigBuilder
	 */
	public CancelLabelService(Config config) {
		super(config, "cancel-labels");
	}
	
	/**
	 * Cancels a label
	 * @param req Cancel Label Request Object
	 * @return Cancel label response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public CancelLabelResponse create(CancelLabelRequest req) throws IOException {
		PostmenUrl url = getUrl();
		CancelLabelResponse response = post(getHandler(), url, req, CancelLabelResponse.class);
		return response;
	}
	
	/**
	 * Cancels a label with custom configuration
	 * @param req Cancel Label Request Object
	 * @param config Custom configuration for this request
	 * @return Cancel label response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public CancelLabelResponse create(CancelLabelRequest req, Config config) throws IOException {
		PostmenUrl url = getUrl(config);
		CancelLabelResponse response = post(new Handler(config), url, req, CancelLabelResponse.class);
		return response;
	}
	
	/**
	 * Get all Cancel Labels you have
	 * @return Cancel label response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public CancelLabelsResponse get() throws IOException {
		PostmenUrl url = getUrl();
		CancelLabelsResponse response = get(getHandler(), url, CancelLabelsResponse.class);
		return response;
	}
	
	/**
	 * Get all Cancel Labels you have with custom configuration
	 * @param config Custom configuration for this request
	 * @return Cancel label response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public CancelLabelsResponse get(Config config) throws IOException {
		PostmenUrl url = getUrl(config);
		CancelLabelsResponse response = get(new Handler(config), url, CancelLabelsResponse.class);
		return response;
	}
	
	/**
	 * Get Cancel Labels with query parameters
	 * @param query Query parameters in a Map
	 * @return Cancel label response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public CancelLabelsResponse getWithParam(Map<String, String> query) throws IOException {
		PostmenUrl url = getUrl().addQueries(query);
		CancelLabelsResponse response = get(getHandler(), url, CancelLabelsResponse.class);
		return response;
	}
	
	/**
	 * Get Cancel Labels with query parameters and custom configuration
	 * @param query Query parameters in a Map
	 * @param config Custom configuration for this request
	 * @return Cancel label response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public CancelLabelsResponse getWithParam(Map<String, String> query, Config config) throws IOException {
		PostmenUrl url = getUrl(config).addQueries(query);
		CancelLabelsResponse response = get(getHandler(), url, CancelLabelsResponse.class);
		return response;
	}
	
	/**
	 * Get Cancel Labels with query parameters
	 * @param query Query parameters in String format beginning with ?
	 * @return Cancel label response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public CancelLabelsResponse getWithParam(String query) throws IOException {
		PostmenUrl url = getUrl().appendPath(query);
		CancelLabelsResponse response = get(getHandler(), url, CancelLabelsResponse.class);
		return response;
	}
	
	/**
	 * Get Cancel Labels with query parameters
	 * @param query Query parameters in String format beginning with ?
	 * @param config Custom configuration for this request
	 * @return Cancel label response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public CancelLabelsResponse getWithParam(String query, Config config) throws IOException {
		PostmenUrl url = getUrl(config).appendPath(query);
		CancelLabelsResponse response = get(getHandler(), url, CancelLabelsResponse.class);
		return response;
	}
	
	/**
	 * Get a certain Cancel Label using id
	 * @param id Id of the Cancel Label
	 * @return Cancel label response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public CancelLabelResponse getById(String id) throws IOException {
		PostmenUrl url = getUrl().appendPath(id);
		CancelLabelResponse response = get(getHandler(), url, CancelLabelResponse.class);
		return response;
	}
	
	/**
	 * Get a certain Cancel Label using id and custom configuration
	 * @param id Id of the Cancel Label
	 * @param config Custom configuration for this request
	 * @return Cancel label response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public CancelLabelResponse getById(String id, Config config) throws IOException {
		PostmenUrl url = getUrl(config).appendPath(id);
		CancelLabelResponse response = get(new Handler(config), url, CancelLabelResponse.class);
		return response;
	}
}
