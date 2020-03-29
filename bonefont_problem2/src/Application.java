


/*Create a separate class called Application that contains a main method 
 * which illustrates the use of DuplicateCounter by calling both the 
 * remove and write methods. Your input file must be called problem2.txt 
 * and your output file must be called unique_word_counts.txt. Your input 
 * file should be located within your project structure so that you can 
 * reference it with the relative path of "problem2.txt", and not an absolute 
 * path such as "c:users\chris\pa4p2\problem2.txt". You will not receive 
 * credit if you use different file names, as my graders will not modify 
 * your code to make it work with their test files.*/





public class Application {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DuplicateCounter duplicateCounter = new DuplicateCounter();
		
		duplicateCounter.count("problem2.txt");
		duplicateCounter.write("unique_word_counts.txt");
		
		
		
	}
}
