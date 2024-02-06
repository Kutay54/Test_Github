package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class Submission {
	
	private String username;
	private LocalDate timestamp;
	private int likes;
	private ArrayList<Comments> comments;
	
	
	
	public Submission(String username) {
		super();
		this.username = username;
		this.timestamp = LocalDate.now();
		this.likes = 0;
		this.comments = new ArrayList<>();
	}


	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public LocalDate getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}
	
	public int getLikes() {
		return likes;
	}
	
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	
	 /**
	  * Calculates at what time a post has been posted
	  * @param millis
	  */
	 public static void calculateTimeStamp(long millis) {
	        long currentTime = System.currentTimeMillis();
	        long diff = currentTime - millis;

	        long seconds = TimeUnit.MILLISECONDS.toSeconds(diff);
	        long minutes = TimeUnit.MILLISECONDS.toMinutes(diff);
	        long hours = TimeUnit.MILLISECONDS.toHours(diff);
	        long days = TimeUnit.MILLISECONDS.toDays(diff);
	        long months = TimeUnit.MILLISECONDS.toDays(diff) * 30;
	        long year = TimeUnit.MILLISECONDS.toDays(diff) * 365;
	        
	        if (seconds < 60) {
	        	System.out.println("vor " + seconds + " Sekunden");;
	        } 
	         else if (minutes < 3600) {
	            System.out.println("vor " + minutes + " Minuten");;
	        } 
	         else if (hours < 86400) {
	            System.out.println("vor " + hours + " Stunden");;
	        } 
	         else if(days < 604800) {
	        	 System.out.println("vor " + days + " Tagen");
	        }
			 else if(months < 604800 * 30) {
				 System.out.println("vor " + months + " Monaten");
			}
			 else if(year < 604800 * 365) {
				System.out.println("vor " + year + " Jahren");
		     }
	   } 

	 /**
	  * Adds a new comment
	  * @param comments
	  */
	 public void addComments(Comments comments) {
		 this.comments.add(comments);
	 }
	 
	 /**
	  * Deletes a comment 
	  * @param comments
	  */
	 public void removeComments(Comments comments) {
		 this.comments.remove(comments);
	 }
	 
	 /**
	  * Gives us all the comments
	  * @param comments
	  */
	 public void printAllComments() {
		 for(Comments c : this.comments) {
			 System.out.println(c);
		 }
	 }


	@Override
	public String toString() {
		return "Username: " + username + "/n/t timestamp: " + timestamp + "/n/t likes: " + likes + 
				"/n/t comments: " + comments;
	}
	
	 
}
