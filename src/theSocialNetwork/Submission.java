package theSocialNetwork;

import java.util.ArrayList;

public abstract class Submission {
	
	public String username;
	public double timestamp;
	public int likes;
	public ArrayList<Comments> comments = new ArrayList<>();
	public String contentsOfNews;
	
}
