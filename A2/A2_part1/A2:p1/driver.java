package Assignment2;

public class driver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		User a = new User("a");
		User b = new User("b");
		User c = new User("c");
		
		User d = new User("d");
		
		a.follow(c);
		b.post("Hi");
		
		
		
		a.follow(b);
		Thread.sleep(1000);
		
		c.post("Hello");
		
		Thread.sleep(2000);
		
		b.post("Hi again");
		
		a.displayTweets();
		
		Thread.sleep(3000);
		
		c.post("Hello again");
		
		a.displayTweets();
		a.displayTweets();
		
		d.post("what");
		
		b.post("my twitter post!");
		c.post("b07 is fun");
		
		a.displayTweets();
		
		

	}

}
