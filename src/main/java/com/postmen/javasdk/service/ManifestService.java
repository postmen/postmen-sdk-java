package com.postmen.javasdk.service;

import java.io.IOException;
import java.util.Map;

import com.postmen.javasdk.config.Config;
import com.postmen.javasdk.handler.Handler;
import com.postmen.javasdk.model.ManifestRequest;
import com.postmen.javasdk.model.ManifestResponse;
import com.postmen.javasdk.model.ManifestsResponse;
import com.postmen.javasdk.util.PostmenUrl;

public class ManifestService extends Service {
	
	/**
	 * Instantiates an Object that manipulates Manifests
	 * @param config Configuration built by ConfigBuilder
	 */
	public ManifestService(Config config) {
		super(config, "manifests");
	}
	
	/**
	 * Creates a manifest
	 * @param req Manifest request object
	 * @return Manifest response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public ManifestResponse create(ManifestRequest req) throws IOException {
		PostmenUrl url = getUrl();
		ManifestResponse response = post(getHandler(), url, req, ManifestResponse.class);
		return response;
	}
	
	/**
	 * Creates a manifest with custom configuration
	 * @param req Manifest request object
	 * @param config Custom configuration for this request
	 * @return Manifest response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public ManifestResponse create(ManifestRequest req, Config config) throws IOException {
		PostmenUrl url = getUrl(config);
		ManifestResponse response = post(new Handler(config), url, req, ManifestResponse.class);
		return response;
	}
	
	/**
	 * Gets all Manifests you have
	 * @return Manifest response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public ManifestsResponse get() throws IOException {
		PostmenUrl url = getUrl();
		ManifestsResponse response = get(getHandler(), url, ManifestsResponse.class);
		return response;
	}
	
	/**
	 * Gets all Manifests you have with custom configuration
	 * @param config Custom configuration for this request
	 * @return Manifest response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public ManifestsResponse get(Config config) throws IOException {
		PostmenUrl url = getUrl(config);
		ManifestsResponse response = get(new Handler(config), url, ManifestsResponse.class);
		return response;
	}
	
	/**
	 * Get Manifests with query parameters
	 * @param query Query parameters in Map
	 * @return Manifest response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public ManifestsResponse getWithParam(Map<String, String> query) throws IOException {
		PostmenUrl url = getUrl().addQueries(query);
		ManifestsResponse response = get(getHandler(), url, ManifestsResponse.class);
		return response;
	}
	
	/**
	 * Get Manifests with query parameters and custom configuration
	 * @param query Query parameters in Map
	 * @param config Custom configuration for this request
	 * @return Manifest response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public ManifestsResponse getWithParam(Map<String, String> query, Config config) throws IOException {
		PostmenUrl url = getUrl(config).addQueries(query);
		ManifestsResponse response = get(new Handler(config), url, ManifestsResponse.class);
		return response;
	}
	
	/**
	 * Get Manifests with query parameters
	 * @param query Query parameters in a String beginning with ?
	 * @return Manifest response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public ManifestsResponse getWithParam(String query) throws IOException {
		PostmenUrl url = getUrl().appendPath(query);
		ManifestsResponse response = get(getHandler(), url, ManifestsResponse.class);
		return response;
	}
	
	/**
	 * Get Manifests with query parameters and custom configuration
	 * @param query Query parameters in a String beginning with ?
	 * @param config Custom configuration for this request
	 * @return Manifest response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public ManifestsResponse getWithParam(String query, Config config) throws IOException {
		PostmenUrl url = getUrl(config).appendPath(query);
		ManifestsResponse response = get(new Handler(config), url, ManifestsResponse.class);
		return response;
	}
	
	/**
	 * Get a Manifest using id
	 * @param id Id of the Manifest
	 * @return Manifest response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public ManifestResponse getById(String id) throws IOException {
		PostmenUrl url = getUrl().appendPath(id);
		ManifestResponse response = get(getHandler(), url, ManifestResponse.class);
		return response;
	}
	
	/**
	 * Get a Manifest using id and custom configuration
	 * @param id Id of the Manifest
	 * @param config Custom configuration for this request
	 * @return Manifest response object
	 * @throws IOException Signals that an I/O exception of some sort has occurred
	 */
	public ManifestResponse getById(String id, Config config) throws IOException {
		PostmenUrl url = getUrl(config).appendPath(id);
		ManifestResponse response = get(new Handler(config), url, ManifestResponse.class);
		return response;
	}
}
