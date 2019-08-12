package com.ids_api_bank_api_logs.simulator.sianyu.model;

public class ResponseBodyModel {	
	String rc;	
	String DataBilling;
	String trxcode;	
	String reffpayment;
	String kdproduk;
	String nominal;
	String clientid;
	
	public String getTrxcode() {
		return trxcode;
	}
	public void setTrxcode(String trxcode) {
		this.trxcode = trxcode;
	}
	public String getKdproduk() {
		return kdproduk;
	}
	public void setKdproduk(String kdproduk) {
		this.kdproduk = kdproduk;
	}
	public String getNominal() {
		return nominal;
	}
	public void setNominal(String nominal) {
		this.nominal = nominal;
	}	
	public String getClientid() {
		return clientid;
	}
	public void setClientid(String clientid) {
		this.clientid = clientid;
	}
	public String getRc() {		
		return rc;
	}
	public void setRc(String rc) {		
		this.rc = rc;
	}
	public String getDataBilling() {
		return DataBilling;
	}
	public void setDataBilling(String dataBilling) {		
		DataBilling = dataBilling;
	}
	public String getReffpayment() {
		return reffpayment;
	}
	public void setReffpayment(String reffpayment) {
		this.reffpayment = reffpayment;
	}

}
