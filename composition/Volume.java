package composition;

import java.util.ArrayList;

public class Volume{

	//Member variables
	private int volumeNumber;
	private int year;
	private int issueFrequency;

	//Associated objects
	private Magazine magazine;
	private ArrayList<IssueOfMagazine> issues;

	public Volume(Magazine magazine, int volumeNumber, int year, int issueFrequency){
		setMagazine(magazine);
		setVolumeNumber(volumeNumber);
		setYear(year);
		setIssueFrequency(issueFrequency);
		issues = new ArrayList<IssueOfMagazine>();
	}

	public Magazine getMagazine() {return magazine;}
	public void setMagazine(Magazine _magazine) {magazine = _magazine;}

	public int getVolumeNumber() {return volumeNumber;}
	public void setVolumeNumber(int _volumeNumber) {volumeNumber = _volumeNumber;}

	public int getYear() {return year;}
	public void setYear(int _year) {year = _year;}

	public int getIssueFrequency() {return issueFrequency;}
	public void setIssueFrequency(int _issueFrequency) {issueFrequency = _issueFrequency;}

	public void addIssueOfMagazine(IssueOfMagazine issue){
		issues.add(issue);
		issue.setVolume(this);
	}

	public IssueOfMagazine getIssueOfMagazine(int i){
		return issues.get(i);
	}

	public String toString(){
		return (
			magazine.toString()
			+ "Volume Number: " + volumeNumber
			+ "\nYear: " + year
			+ "\nIssue Frequency: " + issueFrequency
			+ "\n\n");
	}
}
