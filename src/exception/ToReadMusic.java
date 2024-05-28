package exception;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ToReadMusic {

	private static final Pattern notes = Pattern.compile("C,|D,|E,|F,|G,|A,|B,|C|D|E|F|G|A|B|c|d|e|f|g|a|b|c'|d'|e'|f'|g'|a'|b'");
	
	public static void main(String[] args) {
		String filePath = "music.txt";
		String fileName = "musicb.txt";
		
		try {
			Scanner scr = new Scanner(Paths.get(filePath));
			PrintWriter writer = new PrintWriter(fileName);
			writer.write("M:C \n");
			writer.write("L:1/4 \n");
			writer.write("K:C \n");
			while (scr.hasNextLine()) {
				String zeile = scr.nextLine().trim();
				if(!zeile.isEmpty()) {
					if(notes.matcher(zeile).matches()) {
						writer.print(zeile + " ");
					}
				
				}
			
			}scr.close();
			writer.close();
			}catch (IOException e) {
				System.out.println("Fehler");
			}
			
		}
		
		
}
		
