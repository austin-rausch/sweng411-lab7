package composition;

import java.util.ArrayList;

public class IssueOfMagazine {

	//Member variables
	private int issueNumber;
	private int month;
	private int issueQuantity;

	//Associated objects
	private Volume volume;
	private ArrayList<CopyOfIssueOfMagazine> copies;

	public IssueOfMagazine(Volume volume, int issueNumber, int month, int issueQuantity){
		setVolume(volume);
		setIssueNumber(issueNumber);
		setMonth(month);
		setIssueQuantity(issueQuantity);
		copies = new ArrayList<CopyOfIssueOfMagazine>();
	}

	public Volume getVolume() {return volume;}
	public void setVolume(Volume _volume) {volume = _volume;}

	public int getIssueNumber() {return issueNumber;}
	public void setIssueNumber(int _issueNumber) {issueNumber = _issueNumber;}

	public int getMonth() {return month;}
	public void setMonth(int _month) {month = _month;}

	public int getIssueQuantity() {return issueQuantity;}
	public void setIssueQuantity(int _issueQuantity) {issueQuantity = _issueQuantity;}

	public void addCopyOfMagazineIssue(CopyOfIssueOfMagazine copy){
		copies.add(copy);
		copy.setIssueOfMagazine(this);
	}

	public String toString() {
		return (
			volume.toString()
		 	+ "Issue Number: " + issueNumber
			+ "\nMonth: " + month
			+ "\nIssue Quantity: " + issueQuantity + "\n");
	}
}
