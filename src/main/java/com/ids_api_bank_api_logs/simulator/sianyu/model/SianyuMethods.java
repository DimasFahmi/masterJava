package com.ids_api_bank_api_logs.simulator.sianyu.model;

public class SianyuMethods {
	
	RequestBodyModel requestBodyModel = new RequestBodyModel();
	 
	 int a = 49;
	 int b = 8;			//Tidak Bisa Diubah
	 int c = 1;
	
	 public String RC(String Data) {
		int x = Data.length();
		String rc = Data.substring(x - 2,x);
		return rc;			
	} 
	 
	 public String dataBiling(String Data, String Data1) {		 
		 int x = 10; // Jumlah Bilangan Acak
		 SianyuMethods methods =  new SianyuMethods();
		 String databilling = Data + "|" + methods.Randoms(x , a , b, c) + "|" + Data1 ;	
		 return databilling;
	}
	 
	 public String reffPayments() {		 
		 int x = 8; // Jumlah Bilangan Acak
		 SianyuMethods methods =  new SianyuMethods();
		 String reffpayments = methods.Randoms(x , a , b, c);	
		 return reffpayments;
	}
	 
	 public String Randoms(int x, int a, int b, int c ) {	
		 String randoms = "";
		 for ( int y = 0; y < x ; y++) {
			 if ( y == 0) {
				 a = 49;
				 b = 8;
			 }else {
				 a = a - c;
				 b = b + c;
				 c = 0;
			 }
			 int Bilangan = (a + (int)(Math.random() * b));
			 randoms = randoms + (new Character((char) Bilangan).toString());
		 }		 
		 return randoms;
	}	
}
