package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class NewsSubmission extends Submission{

	public String contentsOfNews;
	
	public NewsSubmission(String username,String contentsOfNews, LocalDate timestamp, int likes) {
		this.setUsername(username);
		this.contentsOfNews = contentsOfNews;
		this.setTimestamp(timestamp);
		this.setLikes(likes);
		this.comments = new ArrayList<Comments>();
	}
	
}
