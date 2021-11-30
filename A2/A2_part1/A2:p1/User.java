package Assignment2;

import java.util.*;

public class User implements subject, observer {
	private String twitterName;
	private HashSet<User> followerList;
	private ArrayList<Post> postList;
	
	
	public User(String name) {
		this.twitterName = name;
		this.followerList = new HashSet<User>();
		this.postList = new ArrayList<Post>();
	}
	
	public String getUsername() {
		return this.twitterName;
	}
	
	public void notifyFollowers(Post p) {
		for (User u: followerList) {
			u.updatePostList(p);
		}
	}
	
	public void updatePostList(Post p) {
		this.postList.add(p);
	}

	public void post(String post) {
		Post twitterPost  = new Post(this, new Date(System.currentTimeMillis()), post);
		notifyFollowers(twitterPost);
	}
	
	public void updateFollowerList(User follower) {
		this.followerList.add(follower);
	}
	
	public void follow(subject followUser) throws CantFollowSelfException {
		if (this.equals(followUser) == true) {
			throw new CantFollowSelfException("User cannot follow themself");
		}
		
		followUser.updateFollowerList(this);
	}
	
	public void displayTweets() {
		System.out.println("----- Displaying Tweets -----");
		
		if (postList.isEmpty())
			System.out.println("User @" + this.twitterName + " has no tweets to display" + "\n");
		
		for (int i = 0; i < this.postList.size(); i++) {
			Post displayPost = postList.get(i);
			System.out.println(displayPost.toString());
		}
		
		postList.clear();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj.getClass() != getClass())
			return false;
		
		User u = (User)obj;
		if (u.twitterName != this.twitterName)
			return false;
		
		return true;
	}

}
