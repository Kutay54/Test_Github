package exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class CurrentDate {

	public static void main(String[] args) {
		String filename = "Aktuelles_Datum_zeit.txt";
		
		try 
			(PrintWriter writer = new PrintWriter(filename)) {
			LocalTime now = LocalTime.now();
			writer.print(now);
			}
		 catch (FileNotFoundException e) {
			System.err.println("Fehler: Datei wurde nicht geöffnet");
		} 
			
		
	}
	
	
}
