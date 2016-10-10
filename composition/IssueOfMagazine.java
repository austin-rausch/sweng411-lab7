package composition;

import java.util.ArrayList;

public class IssueOfMagazine{
	
	//Member variables
	private int issueNumber;
	private int month;
	private int issueQuantity;

	//Associated objects
	private Volume volume;
	private ArrayList<CopyOfIssueOfMagazine> copies;

	public IssueOfMagazine(Volume _volume, int _issueNumber, int _month, int _issueQuantity){
		volume = _volume;
		issueNumber = _issueNumber;
		month = _month;
		issueQuantity = _issueQuantity;
	}
		

	public int getIssueNumber(){
		return issueNumber;
	}
	
	
	public int getMonth(){
		return month;
	}
	
	public void addCopyOfMagazine(CopyOfIssueOfMagazine c){
		copies.add(c);
	}

	public int getIssueQuantity(){
		return issueQuantity;
	}
	
/*
	public void toString(){
		//super();
		System.out.println("Issue Number:\t" + issueNumber);
		System.out.println("Month:\t" + month);
		System.out.println("Issue Quantity:\t" + issueQuantity);
	}
*/
}
