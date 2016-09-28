package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class File {
	
	@Key("paper_size")
	private String paperSize;
	@Key
	private String url;
	@Key("file_type")
	private String fileType;
	
	public String getPaperSize() {
		return paperSize;
	}
	public void setPaperSize(String paperSize) {
		this.paperSize = paperSize;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
}
