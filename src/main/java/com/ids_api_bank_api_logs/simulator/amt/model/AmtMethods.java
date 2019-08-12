package com.ids_api_bank_api_logs.simulator.amt.model;

public class AmtMethods {
	
	RequestBodyModel requestBodyModel = new RequestBodyModel();
	 
	 int a = 97;
	 int b = 26;			//Tidak Bisa Diubah
	 int c = 41;
	
	
	 public String dataRandoms(int x) {	
		 AmtMethods methods =  new AmtMethods();
		 String databilling = methods.Randoms(x);	
		 return databilling;
	} 
	 
	 public String Randoms(int x) {	
		 String randoms = "";
		 for ( int y = 0; y < x ; y++) {			 
			 int Bilangan = (a + (int)(Math.random() * b));
			 randoms = randoms + (new Character((char) Bilangan).toString());
		 }		 
		 return randoms;
	}	
}
