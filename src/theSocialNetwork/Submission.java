package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class Submission {
	
	public String username;
	public LocalDate timestamp;
	public int likes;
	public ArrayList<Comments> comments = new ArrayList<>();
	
	
	
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
	
	
	 public static String getTimeAgo(long millis) {
	        long currentTime = System.currentTimeMillis();
	        long diff = currentTime - millis;

	        long seconds = TimeUnit.MILLISECONDS.toSeconds(diff);
	        long minutes = TimeUnit.MILLISECONDS.toMinutes(diff);
	        long hours = TimeUnit.MILLISECONDS.toHours(diff);
	        long days = TimeUnit.MILLISECONDS.toDays(diff);

	        if (seconds < 60) {
	            return "vor " + seconds + " Sekunden";
	        } else if (minutes < 60) {
	            return "vor " + minutes + " Minuten";
	        } else if (hours < 24) {
	            return "vor " + hours + " Stunden";
	        } else {
	            return "vor " + days + " Tagen";
	        }
	    }
	 
	 public void addComments(Comments comments) {
		 this.comments.add(comments);
	 }
	 
	 public void removeComments(Comments comments) {
		 this.comments.remove(comments);
	 }
	 
	 public void printAllComments() {
		 for(Comments c : this.comments) {
			 System.out.println(c);
		 }
	 }
	
}
