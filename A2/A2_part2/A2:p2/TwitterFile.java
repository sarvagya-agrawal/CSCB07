package Assignment2Part2;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TwitterFile {
	File twitterFile;
	String fileName;
	ArrayList<String> hashtagList;
	HashSet<String> uniqueHashtagList;
	ArrayList<hashtagObj> uniqueHashtagObjList;
	String Top3;
	
	
	public TwitterFile(File file) {
		twitterFile = file;
		fileName = twitterFile.getName();
		hashtagList = new ArrayList<String>();
		uniqueHashtagList = new HashSet<String>();
		uniqueHashtagObjList = new ArrayList<hashtagObj>();
	}
	
	public void findHashtags() throws Exception{
		Scanner input = new Scanner(twitterFile);
		
		while(input.hasNext()) {
			String current = input.next();
			Pattern pattern = Pattern.compile("#\\w+");
			Matcher matcher = pattern.matcher(current);
			
			if (matcher.matches()) {
				hashtagList.add(current);
			}
		}
		
		input.close();
		
		int occurences;
        hashtagList.replaceAll(String::toLowerCase);

		for (String s: hashtagList) {
			if (uniqueHashtagList.contains(s) == false) {
				uniqueHashtagList.add(s);
				occurences = Collections.frequency(hashtagList, s);
				hashtagObj ht = new hashtagObj(s, occurences);
				uniqueHashtagObjList.add(ht);
			}			
		}
		
		Collections.sort(uniqueHashtagObjList, new SortByOccurences());
		
		if (uniqueHashtagObjList.isEmpty() != true) {
			System.out.println("----------" + fileName + "----------");
			for (int i = 0; i < 3; i++) {
				int pos = i + 1;
				System.out.print(uniqueHashtagObjList.get(i).hashtag + " (" + uniqueHashtagObjList.get(i).occurences + " times) " + "\n");
			}
		}
		
		
		
	}
}
