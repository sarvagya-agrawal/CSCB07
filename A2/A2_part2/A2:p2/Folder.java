package Assignment2Part2;
import java.io.*;



public class Folder {
	File folder;
	
	public Folder(String pathToFolder) {

		folder = new File(pathToFolder);
		
		if (folder.isDirectory() != true) {
			throw new IllegalArgumentException(folder.getName() + " is not a directory");
		}
	}
	
	public void FindHashtags() throws Exception{
		for (File tweetFile: folder.listFiles()) {
			TwitterFile f = new TwitterFile(tweetFile);
			f.findHashtags();
		}
	}

}
