package sample;
import java.util.Scanner;

public class main {  	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Input: ");
	        String input = scanner.nextLine();
	        
	        String[] words = input.split(" ");
	        String longestWord = "";
	        for (String word : words) {
	            if (word.length() > longestWord.length()) {
	                longestWord = word;
	            }
	        }
	        
	        System.out.println("The longest word: " + longestWord);
	    }
	}
