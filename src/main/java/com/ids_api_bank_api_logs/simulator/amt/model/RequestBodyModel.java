package com.ids_api_bank_api_logs.simulator.amt.model;

public class RequestBodyModel {
	String acc_no;
	String acc_name;
	String dest_bank_code;
	String dest_acc_no;
	String amount;
	String terminal_id;
	String areacode;
	String chaneltype;
	String refcust_number;
	String regencycode;
	
	public String getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(String acc_no) {
		this.acc_no = acc_no;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	public String getDest_bank_code() {
		return dest_bank_code;
	}
	public void setDest_bank_code(String dest_bank_code) {
		this.dest_bank_code = dest_bank_code;
	}
	public String getDest_acc_no() {
		return dest_acc_no;
	}
	public void setDest_acc_no(String dest_acc_no) {
		this.dest_acc_no = dest_acc_no;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTerminal_id() {
		return terminal_id;
	}
	public void setTerminal_id(String terminal_id) {
		this.terminal_id = terminal_id;
	}
	public String getAreacode() {
		return areacode;
	}
	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}
	public String getChaneltype() {
		return chaneltype;
	}
	public void setChaneltype(String chaneltype) {
		this.chaneltype = chaneltype;
	}
	public String getRefcust_number() {
		return refcust_number;
	}
	public void setRefcust_number(String refcust_number) {
		this.refcust_number = refcust_number;
	}
	public String getRegencycode() {
		return regencycode;
	}
	public void setRegencycode(String regencycode) {
		this.regencycode = regencycode;
	}	
	
}
