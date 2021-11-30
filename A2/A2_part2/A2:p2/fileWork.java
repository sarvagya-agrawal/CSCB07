package Assignment2Part2;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class fileWork {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//fileFinder f = new fileFinder("/Users/sarvagya/Desktop/Univ/CSCB07/A2/Tweets2020/cristiano.txt");
		//fileFinder f = new fileFinder("/Users/sarvagya/Desktop/Univ/CSCB07/A2/Tweets2020");
		System.out.println("Enter Full path to desired Directory:");
		
		Scanner input = new Scanner(System.in);
		
		String filePath = input.next();
		
		File checkFile = new File(filePath);
		
		if (checkFile.exists() == false)
			throw new IllegalArgumentException("The File path is invalid");
		
		
		Folder f1 = new Folder(filePath);
		

		
		f1.FindHashtags();
		
		
		//f.findHashtags();
		/*
		 * File f = new File("/Users/sarvagya/Desktop/Univ/CSCB07/abcd.txt");
		 * 
		 * Scanner scan11 = new Scanner(f);
		 * 
		 * 
		 * Pattern pattern = Pattern.compile("\s#\\w+\s"); Matcher matcher =
		 * pattern.matcher(" #fd ");
		 * 
		 * System.out.println(matcher.matches());
		 */
	}

}
