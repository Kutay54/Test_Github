package theSocialNetwork;


public class NewsSubmission extends Submission{

	private String contentsOfNews;
	
	public NewsSubmission(String username,String contentsOfNews) {
		super(username);
		this.contentsOfNews = contentsOfNews;
	}

	public String getContentsOfNews() {
		return contentsOfNews;
	}

	public void setContentsOfNews(String contentsOfNews) {
		this.contentsOfNews = contentsOfNews;
	}
	
	
}
