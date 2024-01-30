package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Submission {
	
	public String username;
	public LocalDate timestamp;
	public int likes;
	public ArrayList<Comments> comments = new ArrayList<>();
	
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
		
}
