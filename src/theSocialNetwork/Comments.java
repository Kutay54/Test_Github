package theSocialNetwork;

public class Comments {
	
	private String comment;
	private String user;


	public Comments(String comment, String user) {
		super();
		this.comment = comment;
		this.user = user;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Comment: " + comment + "/n/t User:" + user;
	}

 
}
