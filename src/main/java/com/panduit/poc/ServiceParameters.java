package com.panduit.poc;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect
public class ServiceParameters {
	private String transactionID;
	private String serviceDataAttribute;
	private String serviceMessageAttribute;
	private String quoteActionToPerform;
	private String serverURL;
	private String serverSystemDate;
	
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	public String getServiceDataAttribute() {
		return serviceDataAttribute;
	}
	public void setServiceDataAttribute(String serviceDataAttribute) {
		this.serviceDataAttribute = serviceDataAttribute;
	}
	public String getServiceMessageAttribute() {
		return serviceMessageAttribute;
	}
	public void setServiceMessageAttribute(String serviceMessageAttribute) {
		this.serviceMessageAttribute = serviceMessageAttribute;
	}
	public String getQuoteActionToPerform() {
		return quoteActionToPerform;
	}
	public void setQuoteActionToPerform(String quoteActionToPerform) {
		this.quoteActionToPerform = quoteActionToPerform;
	}
	public String getServerURL() {
		return serverURL;
	}
	public void setServerURL(String serverURL) {
		this.serverURL = serverURL;
	}
	public String getServerSystemDate() {
		return serverSystemDate;
	}
	public void setServerSystemDate(String serverSystemDate) {
		this.serverSystemDate = serverSystemDate;
	}
}
