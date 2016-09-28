package com.postmen.javasdk.service;

import java.io.IOException;
import java.util.Map;

import com.postmen.javasdk.config.Config;
import com.postmen.javasdk.handler.Handler;
import com.postmen.javasdk.model.LabelRequest;
import com.postmen.javasdk.model.LabelResponse;
import com.postmen.javasdk.model.LabelsResponse;
import com.postmen.javasdk.util.PostmenUrl;

public class LabelService extends Service {
	
	/**
	 * Instantiates a Service that manipulates labels
	 * @param config Configuration built by ConfigBuilder
	 */
	public LabelService(Config config) {
		super(config, "labels");
	}
	
	/**
	 * Create a label using a Label Request Object
	 * @param req Label Request Object
	 * @return		Label Response Object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public LabelResponse create(LabelRequest req) throws IOException {
		PostmenUrl url = getUrl();
		LabelResponse labelResponse = post(getHandler(), url, req, LabelResponse.class);
		return labelResponse;
	}
	
	/**
	 * Create a label using a Label Request Object
	 * @param req Label Request Object
	 * @param config custom configuration for this certain request
	 * @return Label Response Object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public LabelResponse create(LabelRequest req, Config config) throws IOException {
		PostmenUrl url = getUrl(config);
		LabelResponse labelResponse = post(new Handler(config), url, req, LabelResponse.class);
		return labelResponse;
	}
	
	/**
	 * Get a list of labels you have
	 * @return Label Response Object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public LabelsResponse get() throws IOException {
		PostmenUrl url = getUrl();
		LabelsResponse labelsResponse = get(getHandler(), url, LabelsResponse.class);
		return labelsResponse;
	}
	
	/**
	 * Get a list of labels you have
	 * @param config custom configuration for this request
	 * @return Label Response Object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public LabelsResponse get(Config config) throws IOException {
		PostmenUrl url = getUrl(config);
		LabelsResponse labelsResponse = get(new Handler(config), url, LabelsResponse.class);
		return labelsResponse;
	}
	
	/**
	 * Get request with query parameters
	 * @param map query parameters in a Map
	 * @return Label Response Object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public LabelsResponse getWithParam(Map<String, String> map) throws IOException {
		PostmenUrl url = getUrl().addQueries(map);
		LabelsResponse labelsResponse = get(getHandler(), url, LabelsResponse.class);
		return labelsResponse;
	}
	
	/**
	 * Get request with query parameters and custom configuration
	 * @param map query parameters in a Map
	 * @param config custom configuration for this request
	 * @return Label Response Object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public LabelsResponse getWithParam(Map<String, String> map, Config config) throws IOException {
		PostmenUrl url = getUrl(config).addQueries(map);
		LabelsResponse labelsResponse = get(new Handler(config), url, LabelsResponse.class);
		return labelsResponse;
	}
	
	/**
	 * Get request with string query parameters and custom configuration
	 * @param param string query parameters starting with ?
	 * @return Label Response Object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public LabelsResponse getWithParam(String param) throws IOException {
		PostmenUrl url = getUrl().appendPath(param);
		LabelsResponse labelsResponse = get(getHandler(), url, LabelsResponse.class);
		return labelsResponse;
	}
	
	/**
	 * Get request with query parameters and custom configuration
	 * @param param string query parameters starting with ?
	 * @param config custom configuration for this request
	 * @return Label Response Object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public LabelsResponse getWithParam(String param, Config config) throws IOException {
		PostmenUrl url = getUrl(config).appendPath(param);
		LabelsResponse labelsResponse = get(new Handler(config), url, LabelsResponse.class);
		return labelsResponse;
	}
	
	/**
	 * Get a certain label using id as parameter
	 * @param id id of label
	 * @return Label Response Object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public LabelResponse getById(String id) throws IOException {
		PostmenUrl url = getUrl().appendPath(id);
		LabelResponse labelResponse = get(getHandler(), url, LabelResponse.class);
		return labelResponse;
	}
	
	/**
	 * Get a certain label using id as parameter with custom configuration
	 * @param id id of label
	 * @param config custom configuration for this request
	 * @return Label Response Object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public LabelResponse getById(String id, Config config) throws IOException {
		PostmenUrl url = getUrl(config).appendPath(id);
		LabelResponse labelResponse = get(new Handler(config), url, LabelResponse.class);
		return labelResponse;
	}
	
	
}
