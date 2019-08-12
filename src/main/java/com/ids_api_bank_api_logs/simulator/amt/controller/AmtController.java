package com.ids_api_bank_api_logs.simulator.amt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ids_api_bank_api_logs.simulator.amt.model.AmtMethods;
import com.ids_api_bank_api_logs.simulator.amt.model.RequestBodyModel;
import com.ids_api_bank_api_logs.simulator.amt.model.ResponseBodyModel;

@RestController
@RequestMapping("/payment/gw/api/disbursement/")
public class AmtController {
		
	RequestBodyModel requestBodyModel = new RequestBodyModel();
	ResponseBodyModel responseBodyModel = new ResponseBodyModel();	
	AmtMethods methods =  new AmtMethods();
	
	@PostMapping("/inquiry")
	   public ResponseEntity<Object> createRequestInquiry(@RequestBody RequestBodyModel requestBodyModel) {		  	
		  	responseBodyModel.setAcc_name(requestBodyModel.getAcc_name());
			responseBodyModel.setAcc_no(requestBodyModel.getAcc_no());
			responseBodyModel.setAmount(requestBodyModel.getAmount());
			responseBodyModel.setDest_acc_name(methods.dataRandoms(10));
			responseBodyModel.setDest_acc_no(requestBodyModel.getDest_acc_no());
			responseBodyModel.setDest_bank_code(requestBodyModel.getDest_bank_code());
			responseBodyModel.setMessage(methods.dataRandoms(10));
			responseBodyModel.setStatus(methods.dataRandoms(10));
			responseBodyModel.setTerminal_id(requestBodyModel.getTerminal_id());
			responseBodyModel.setTransaction_id(methods.dataRandoms(10));
			
		    return new ResponseEntity<>(responseBodyModel, HttpStatus.OK);
		    }
	
	@PostMapping("/transfer")
	   public ResponseEntity<Object> createRequestTransfer(@RequestBody RequestBodyModel requestBodyModel) {		  	
			responseBodyModel.setAcc_name(requestBodyModel.getAcc_name());
			responseBodyModel.setAcc_no(requestBodyModel.getAcc_no());
			responseBodyModel.setAmount(requestBodyModel.getAmount());
			responseBodyModel.setDest_acc_name(methods.dataRandoms(10));
			responseBodyModel.setDest_acc_no(requestBodyModel.getDest_acc_no());
			responseBodyModel.setDest_bank_code(requestBodyModel.getDest_bank_code());
			responseBodyModel.setMessage(methods.dataRandoms(10));
			responseBodyModel.setStatus(methods.dataRandoms(10));
			responseBodyModel.setTerminal_id(requestBodyModel.getTerminal_id());
			responseBodyModel.setTransaction_id(methods.dataRandoms(10));
			
		    return new ResponseEntity<>(responseBodyModel, HttpStatus.OK);
		    }
	
}