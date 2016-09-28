package com.postmen.javasdk.model;

import com.google.api.client.util.Key;

public class Files {
	 
	@Key
	private File invoice;
	@Key("customs_declaration")
	private File customsDeclaration;
	@Key
	private File certificate;
	@Key
	private File manifest;
	@Key
	private File label;
	public File getInvoice() {
		return invoice;
	}
	public void setInvoice(File invoice) {
		this.invoice = invoice;
	}
	public File getCustomsDeclaration() {
		return customsDeclaration;
	}
	public void setCustomsDeclaration(File customsDeclaration) {
		this.customsDeclaration = customsDeclaration;
	}
	public File getCertificate() {
		return certificate;
	}
	public void setCertificate(File certificate) {
		this.certificate = certificate;
	}
	public File getManifest() {
		return manifest;
	}
	public void setManifest(File manifest) {
		this.manifest = manifest;
	}
	public File getLabel() {
		return label;
	}
	public void setLabel(File label) {
		this.label = label;
	}
}
