package com.ids_api_bank_api_logs.simulator.amt.model;

public class ResponseBodyModel {
	String status;
	String message;
	String acc_no;
	String acc_name;
	String dest_bank_code;
	String dest_acc_no;
	String dest_acc_name;
	String amount;
	String terminal_id;
	String transaction_id;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
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
	public String getDest_acc_name() {
		return dest_acc_name;
	}
	public void setDest_acc_name(String dest_acc_name) {
		this.dest_acc_name = dest_acc_name;
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
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}	
	
}
