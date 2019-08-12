package com.ids_api_bank_api_logs.simulator.sianyu.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ids_api_bank_api_logs.simulator.sianyu.model.SianyuMethods;
import com.ids_api_bank_api_logs.simulator.sianyu.model.RequestBodyModel;
import com.ids_api_bank_api_logs.simulator.sianyu.model.ResponseBodyModel;

@RestController
@RequestMapping("/development.elemeno.tech/serviceconverter/index.php/servicejson/main")
public class SianyuController {
		
	RequestBodyModel requestBodyModel = new RequestBodyModel();
	ResponseBodyModel responseBodyModel = new ResponseBodyModel();	
	SianyuMethods methods =  new SianyuMethods();
	
	@PostMapping
	   public ResponseEntity<Object> createRequest(@RequestBody RequestBodyModel requestBodyModel) {
		
		  	responseBodyModel.setTrxcode(requestBodyModel.getTrxcode());
			responseBodyModel.setRc(methods.RC(requestBodyModel.getIdpel())); 
			responseBodyModel.setDataBilling(methods.dataBiling(requestBodyModel.getIdpel(),requestBodyModel.getNominal()));
			responseBodyModel.setReffpayment(methods.reffPayments());
			responseBodyModel.setKdproduk(requestBodyModel.getKdproduk());
			responseBodyModel.setNominal(requestBodyModel.getNominal());
			responseBodyModel.setClientid(requestBodyModel.getClientid());
		    return new ResponseEntity<>(responseBodyModel, HttpStatus.OK);
		    
		    }
	
}