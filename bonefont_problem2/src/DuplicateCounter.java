


/*Create a class called DuplicateCounter. Create an instance method called count that 
 * takes a single parameter called dataFile of type String (representing the path to 
 * a text file) and uses a Map of Strings to count how many times each word occurs in 
 * dataFile. The counts should be stored in an instance variable called wordCounter. 
 * Create an instance method called write that takes a single parameter called outputFile 
 * (representing the path to a text file) and writes the contents of wordCounter to the 
 * file pointed to by outputFile. The output file should be overwritten if it already 
 * exists, and created if it does not exist.*/





import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;






public class DuplicateCounter {
	private HashMap<String, Integer> wordCounter;
	public DuplicateCounter(){
		wordCounter = new HashMap<String, Integer>();
		
	}
	
	public void count(String dataFile){
		wordCounter.clear();
		try{
			Scanner scan = new Scanner(new File(dataFile));
			String word, wordLower;
			while(scan.hasNext()){
				
				word = scan.next();
				wordLower = word.toLowerCase();
				
				if(!wordLower.equals("")) {
					if(wordCounter.get(wordLower) == null) {
						wordCounter.put(wordLower, 1);
					}else
						wordCounter.put(wordLower, wordCounter.get(wordLower) + 1);
					
				}
				
			}
			
			scan.close();
			
		}
		
		catch(IOException | NoSuchElementException e){
			System.out.println(e + "\nBetter luck next time!!!!");
			
		}
		
	}
	
	public void write(String outputFile){
		
		try{
			PrintWriter printWrite = new PrintWriter(new File(outputFile));
			
			for(String wordLower : wordCounter.keySet()){
				
				printWrite.println(wordLower + " " + wordCounter.get(wordLower));
				
			}
			
			printWrite.flush();
			printWrite.close();
			
		}
		
		catch(IOException | NoSuchElementException e){
			
			System.out.println(e + "\nBetter luck next time!!!!");
			
		}
		
	}
	
}
