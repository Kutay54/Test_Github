package theSocialNetwork;

import java.util.ArrayList;

public class NewsFeed {

    private ArrayList<Submission> submission;
    
    public NewsFeed() {
    	this.submission = new ArrayList<>();
    }
    
    /*
     * Ads a Submission
     */
    public void addSubmission (Submission submission) {
    	this.submission.add(submission);
    }
    
    /*
     * Prints all submission
     */
    public void printAllSubmission() {
    	for (Submission s : submission) {
    		System.out.println(s);
    	}
    }
    
    
    /*
     * Prints all submission by user
     */
    public void printSubmissionByUser(String userName) {
    	for (Submission s : submission) {
    		if (s.getUsername().equals(userName)) {
    			System.out.println(s);
    		}
    	}
    }
    
    /*
     * Deletes a submission
     */
    public void deleteSubmission(Submission submission) {
    	this.submission.remove(submission);
    }
    
   /*
    *  Finds a user in class submission from her or his post
    */
   ArrayList<Submission> findUser(String userName, boolean onlyPhotos) {
	   ArrayList<Submission> result = new ArrayList<>();
	   for (Submission s : submission) {
		   if (s.getUsername().equals(userName) && (!onlyPhotos || s instanceof Photo)) {
			   result.add(s);
		   }
	   }
	   System.out.println("Die User " + result);
	   return result;
   }
}