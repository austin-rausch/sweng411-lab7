package composition;

import java.util.ArrayList;


public class Volume{

	//Member variables
	private int volumeNumber;
	private int year;
	private int issueFrequency;

	//Associated objects
	private Magazine mag;
	private ArrayList<IssueOfMagazine> issues;

	public Volume(Magazine _mag, int _volumeNumber, int _year, int _issueFrequency){
		setMag(_mag);
		setVolNumber(_volumeNumber);
		setYear(_year);
		setIssueFrequency(_issueFrequency);		
		issues = new ArrayList<IssueOfMagazine>();
	}

	public void setMag(Magazine _mag){
		mag = _mag;
	}

	public void setVolNumber(int _volNum){
		volumeNumber = _volNum;
	}

	public void setYear(int _year){
		year = _year;
	}

	public void setIssueFrequency(int _issueFrequency){
		issueFrequency = _issueFrequency;
	}

	public int getVolumeNumber(){
		return volumeNumber;
	}

	public int getYear(){
		return year;
	}

	public int getIssueFrequency(){
		return issueFrequency;
	}


	public Magazine getMagazine(){
		return mag;
	}
	
	public void addIssueOfMagazine(IssueOfMagazine issue){
		issues.add(issue);
	}


	public IssueOfMagazine getIssueOfMagazine(int i){
		return issues.get(i);
	}
/*
	public void toString(){
		super();
		System.out.println("Volume Number:\t" + volumeNumber);
		System.out.println("Year:\t" + year);
		System.out.println("Issue Frequency:\t" + issueFrequency);
	}
*/
}
