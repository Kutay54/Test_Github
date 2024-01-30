package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Photo extends Submission{
	
	public String headline;
	
	public Photo(String username, LocalDate timestamp, int likes, String headline) {
		this.setTimestamp(timestamp);
		this.setLikes(likes);
		this.setUsername(username);
		this.comments = new ArrayList<Comments>();
		this.headline = headline;
		}
	
	
}
