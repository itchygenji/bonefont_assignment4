





/*Create a class called DuplicateRemover. Create an instance method called 
 * remove that takes a single parameter called dataFile of type String 
 * (representing the path to a text file) and uses a Set of Strings to eliminate 
 * duplicate words from the file referenced by dataFile. The unique words should 
 * be stored in an instance variable called uniqueWords. Create an instance method 
 * called write that takes a single parameter called outputFile (representing the 
 * path to a text file) and writes the words contained in uniqueWords to the file 
 * pointed to by outputFile. The output file should be overwritten if it already 
 * exists, and created if it does not exist.*/


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;









public class DuplicateRemover {
	private Set<String> uniqueWords;
	public DuplicateRemover() {
		uniqueWords = new HashSet<String>();
		
	}
	
	public void remove(String dataFile) {
		try {
			Scanner scan = new Scanner(new File(dataFile));
			while (scan.hasNext()) {
				
				String lowerCase = scan.next();
				uniqueWords.add(lowerCase.toLowerCase());
				
			}
			
			scan.close();
			
		} catch (IOException | NoSuchElementException e) {
			
			System.out.println(e + "\nBetter luck next time!!!!");
			//e.printStackTrace();
			
		}
		
	}
	
	public void write(String outputFile) {
		
		try {
			
			PrintWriter printWrite = new PrintWriter(new File(outputFile));
			
			for (String words : uniqueWords) {
				
			
				printWrite.println(words);
		
				
			}
			
			printWrite.flush();
			printWrite.close();
			
		} catch (IOException | NoSuchElementException e) {
			
			System.out.println(e + "Better luck next time!!!!");
			
		}
		
	}
	
}
