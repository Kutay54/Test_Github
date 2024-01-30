package theSocialNetwork;


public class Photo extends Submission{
	
	public String fileName;
	public String headline;
	
	public Photo(String username, String headline, String fileName) {
		super(username);
		this.headline = headline;
		}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
}
