package theSocialNetwork;


public class NewsSubmission extends Submission{

	private String contentsOfNews;
	
	public NewsSubmission(String username,String contentsOfNews) {
		super(username);
		this.setUsername(username);
	}
	
}
