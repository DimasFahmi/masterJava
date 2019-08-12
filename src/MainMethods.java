import java.util.HashMap;
import java.util.Scanner;

public class MainMethods {
	Scanner command = new Scanner(System.in);
		
	HashMap<Integer, String> plateMobil = new HashMap<Integer, String>();
	HashMap<Integer, String> warnaMobil = new HashMap<Integer, String>();
	
	int amountOfParking = 0;
	int slot = 1;
	int noParking = 0;
	int b = 0;  //Jumlah Parkir
	
	//Main Command
	
	public void mainCommand(String otherCommand) {	
		String[] split = otherCommand.split(" ");		
		if (split[0].equals("create-parking")) {
			createSLot(Integer.parseInt(split[1]), slot);
		}else if (otherCommand.split(" ")[0].equals("find-by-plate")){
			findBy("find-by-plate", split[1]);
		}else if (otherCommand.split(" ")[0].equals("find-by-color")){
			findBy("find-by-color", split[1]);
		}else if (split[0].equals("park")){
			int c = 0;																		//Penanda apakah slot full				
			for ( int a = 1; a <= b; a++) {	    							
				if (plateMobil.get(a).equals("") || warnaMobil.get(a).equals("")) {		
					plateMobil.put(a, split[1]);
					warnaMobil.put(a, split[2]);
					System.out.println("car parked at " + (a) + " With " + 
							split[1] + " Number And Have Color " + 
							split[2]);
					c = c + 1;							    						
					break;						    							
				}    							
			}
			if ( c == 0) {
				System.out.println("Slot Penuh");				    								
			}			
		}else if (split[0].equals("leave")){
			int slotWillBeRemove = Integer.parseInt(split[1]);
			System.out.println("car parked at " + (slotWillBeRemove) + " With " + 
					plateMobil.get(slotWillBeRemove) + " Number And Have Color " + 
					warnaMobil.get(slotWillBeRemove) + " Leave or Exit");			//Akhir Leave
			  plateMobil.remove(slotWillBeRemove);
			  warnaMobil.remove(slotWillBeRemove);
			  plateMobil.put(slotWillBeRemove, "");
			  warnaMobil.put(slotWillBeRemove, "");
		}else if(split[0].equals("Print")) {
			print("nomor");
			print("plate");
			print("warna");
		  }else {
			System.out.println("Perintah Salah");
		}		  
	}
	
	
	
	//Other Command

	public void createSLot(int amountOfParking, int slot) {
		amountOfParking = b + amountOfParking;	
		for (int a = b; a < amountOfParking; a++) {	
			plateMobil.put(a+1, "");
			warnaMobil.put(a+1, "");
	}		
		b = amountOfParking;
		
	}
	
	public void findBy(String find, String split) {
		  StringBuffer sb = new StringBuffer();
		  String findBy = null;
		  for ( int a = 0; a < warnaMobil.size(); a++) {
			  if (size(find, a).equals(split)) {					
				  sb.append((a+1) + "x");
			  }
		  }
		  if (sb.length() == 0) {
			  System.out.println("Mobil Yang Dicari Tidak Ada");
		  }else {
		  for (String retval : sb.toString().split("x")) {
			  int retval1 = Integer.parseInt(retval);	
				String carColor = (String) warnaMobil
						.get(retval1);
				System.out.println("car parked at " + retval + " Have " + plateMobil.get(retval1)
				+ " Number And Have Color " + warnaMobil.get(retval1));
				//Dimas Fahmi Suntoro
			}
		  }	
	}
	
	public String size(String findBy, int a) {
		String size1;
		if (findBy.equals("find-by-plate")) {
			size1 = (String)plateMobil.get(a + 1);
		}
		else {
			size1 = (String)warnaMobil.get(a + 1);
		}		
		return size1;
	}
	
	public void print(String print) {
		String carColorPlate = null;
		for (Integer key : plateMobil.keySet()) {
			if (print.equals("warna")) {
				carColorPlate = (String)warnaMobil.get(key);
			}else if (print.equals("plate")) {
				carColorPlate = (String)plateMobil.get(key);
			}
			else {
				carColorPlate =  String.valueOf(key);
			}			  
				System.out.print(carColorPlate + " ");
			}
		  System.out.println();
	}
}
