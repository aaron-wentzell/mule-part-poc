package com.panduit.poc;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect
public class QuoteProcess {
	private String bs_id;
	private String buyer_company_name;
	private String supplier_company_name;
	private String _customer_id;
	private String transactionID_quote;
	
	@JsonProperty("_shipTo_country")
	private String _shipTo_county;
	private String qpq_quote_number;
	private LineProcess line_process;
	
	private String configPricelist_quote;
	private String associatedPricelist_quote;
	
	
	public String getConfigPricelist_quote() {
		return configPricelist_quote;
	}
	public void setConfigPricelist_quote(String configPricelist_quote) {
		this.configPricelist_quote = configPricelist_quote;
	}
	public String getAssociatedPricelist_quote() {
		return associatedPricelist_quote;
	}
	public void setAssociatedPricelist_quote(String associatedPricelist_quote) {
		this.associatedPricelist_quote = associatedPricelist_quote;
	}
	public String getBs_id() {
		return bs_id;
	}
	public void setBs_id(String bs_id) {
		this.bs_id = bs_id;
	}
	public String getBuyer_company_name() {
		return buyer_company_name;
	}
	public void setBuyer_company_name(String buyer_company_name) {
		this.buyer_company_name = buyer_company_name;
	}
	public String getSupplier_company_name() {
		return supplier_company_name;
	}
	public void setSupplier_company_name(String supplier_company_name) {
		this.supplier_company_name = supplier_company_name;
	}
	public String get_customer_id() {
		return _customer_id;
	}
	public void set_customer_id(String _customer_id) {
		this._customer_id = _customer_id;
	}
	public String getTransactionID_quote() {
		return transactionID_quote;
	}
	public void setTransactionID_quote(String transactionID_quote) {
		this.transactionID_quote = transactionID_quote;
	}
	public String get_shipTo_county() {
		return _shipTo_county;
	}
	public void set_shipTo_county(String _shipTo_county) {
		this._shipTo_county = _shipTo_county;
	}
	public String getQpq_quote_number() {
		return qpq_quote_number;
	}
	public void setQpq_quote_number(String qpq_quote_number) {
		this.qpq_quote_number = qpq_quote_number;
	}
	public LineProcess getLine_process() {
		return line_process;
	}
	public void setLine_process(LineProcess line_process) {
		this.line_process = line_process;
	}
	
	
}
