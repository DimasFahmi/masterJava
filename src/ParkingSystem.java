import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Scanner;

public class ParkingSystem {

	public static void main(String[] args) {
		Scanner command = new Scanner(System.in);
		
		String mainCommand = null;	
		String otherCommand = "";
		
		MainMethods mainMethods = new MainMethods();		
	

		while(true) {
			try {
				System.out.println("Masukkan Perintah Pertama"); //Perintah Pertama
				mainCommand = command.nextLine();				
						switch(mainCommand) {					
						  case "1":
							  while(true) {
								  try {
									  System.out.println("Masukkan Perintah KeDua"); 									//Perintah KeDua
								      otherCommand = command.nextLine();	
								      if (otherCommand.equals("exit")) {
								    	  break;
								      }else {
									      mainMethods.mainCommand(otherCommand);	
								      }	
								} catch (Exception e) {
									System.out.println("Perintah Salah, Ulangi Lagi");
								}
							  }
							  break;
						  case "2":
						    System.out.println("Tuesday");
						    break;
						  case "exit":
							break;						    
						  default:
							System.out.println("Perintah Salah"); 
							
							break;					  
						}					
						if (mainCommand.equals("exit")){   							// Digunakan Untuk Keluar *****1							
							  break;						  
						  }		
			}catch (Exception e) {
				System.out.println("Perintah Salah, Ulangi Lagi");
			}
	}
	}
}
