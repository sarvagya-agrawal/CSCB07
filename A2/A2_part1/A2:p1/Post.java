package Assignment2;

import java.util.*;


public class Post {
	Date postDate;
	String postContent;
	User postUser;
	HashSet<User> displayedBy;
	
	public Post(User user, Date date, String postContent) {
		this.postContent = postContent;
		this.postDate = date;
		this.postUser = user;
		this.displayedBy = new HashSet<User>();
	}
	
	public void markAsDisplayedBy(User u) {
		displayedBy.add(u);
	}

	@Override
	public String toString() {
		return "@" + postUser.getUsername() + " tweeted on " + postDate.toString() + ": " + postContent + "\n";
	}

	

}
