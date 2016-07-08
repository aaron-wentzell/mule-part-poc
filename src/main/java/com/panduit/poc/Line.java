package com.panduit.poc;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect
public class Line {
	private String _document_number;
	
	private String partTypeDisplay_line;
	private String _part_number;
	private String qty_line;
	
	private String pricelistName_line;
	private String bomString_line;
	
	private String price;
	private String uom;
	private String priceModifier;
	private String currencyCode;
	private String errorMessage;
	
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public String getPriceModifier() {
		return priceModifier;
	}
	public void setPriceModifier(String priceModifier) {
		this.priceModifier = priceModifier;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String get_document_number() {
		return _document_number;
	}
	public void set_document_number(String _document_number) {
		this._document_number = _document_number;
	}
	public String getPartTypeDisplay_line() {
		return partTypeDisplay_line;
	}
	public void setPartTypeDisplay_line(String partTypeDisplay_line) {
		this.partTypeDisplay_line = partTypeDisplay_line;
	}
	public String get_part_number() {
		return _part_number;
	}
	public void set_part_number(String _part_number) {
		this._part_number = _part_number;
	}
	public String getQty_line() {
		return qty_line;
	}
	public void setQty_line(String qty_line) {
		this.qty_line = qty_line;
	}
	public String getPricelistName_line() {
		return pricelistName_line;
	}
	public void setPricelistName_line(String priceListName_line) {
		this.pricelistName_line = priceListName_line;
	}
	public String getBomString_line() {
		return bomString_line;
	}
	public void setBomString_line(String bomString_line) {
		this.bomString_line = bomString_line;
	}
	
	
	
}
