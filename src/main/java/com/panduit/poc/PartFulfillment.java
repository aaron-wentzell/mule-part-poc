package com.panduit.poc;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect
public class PartFulfillment {
	private ServiceParameters serviceParameters;
	private GetPricingInfo getPricingInfo;
	private CreateItemInEBS createItemInEBS;
	private GetStandardLeadTime getStandardLeadTime;
	
	
	public ServiceParameters getServiceParameters() {
		return serviceParameters;
	}
	public void setServiceParameters(ServiceParameters serviceParameters) {
		this.serviceParameters = serviceParameters;
	}
	public GetPricingInfo getGetPricingInfo() {
		return getPricingInfo;
	}
	public void setGetPricingInfo(GetPricingInfo getPricingInfo) {
		this.getPricingInfo = getPricingInfo;
	}
	public CreateItemInEBS getCreateItemInEBS() {
		return createItemInEBS;
	}
	public void setCreateItemInEBS(CreateItemInEBS createItemInEBS) {
		this.createItemInEBS = createItemInEBS;
	}
	public GetStandardLeadTime getGetStandardLeadTime() {
		return getStandardLeadTime;
	}
	public void setGetStandardLeadTime(GetStandardLeadTime getStandardLeadTime) {
		this.getStandardLeadTime = getStandardLeadTime;
	}
	
	
}
