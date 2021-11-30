package Assignment2;

public interface observer {
	
	public void follow (subject followUser) throws CantFollowSelfException;
	public void updatePostList(Post p);
	public void displayTweets();

}
