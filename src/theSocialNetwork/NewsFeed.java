package theSocialNetwork;

import java.util.ArrayList;

public class NewsFeed {

    private ArrayList<Submission> submission;
    
    public NewsFeed() {
    	this.submission = new ArrayList();
    }
    
    void addSubmission (Submission submission) {
    	this.submission.add(submission);
    }
    
    void printAllSubmission() {
    	for (Submission s : submission) {
    		System.out.println(s);
    	}
    }
    
    void printSubmissionByUser(String userName) {
    	for (Submission s : submission) {
    		if (s.getUsername().equals(userName)) {
    			System.out.println(s);
    		}
    	}
    }
    
    void deleteSubmission(Submission submission) {
    	this.submission.remove(submission);
    }
    
    
}