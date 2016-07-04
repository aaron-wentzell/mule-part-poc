package com.panduit.poc;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect
public class GetStandardLeadTime {
	private QuoteProcess quote_process;

	public QuoteProcess getQuote_process() {
		return quote_process;
	}

	public void setQuote_process(QuoteProcess quote_process) {
		this.quote_process = quote_process;
	}
	
	

}
