package composition;

import java.util.ArrayList;

public class CopyOfIssueOfMagazine{
	private String sequenceNum;
	private IssueOfMagazine issue;

	public CopyOfIssueOfMagazine(String sequenceNum) {
		setSequenceNum(sequenceNum);
	}

	public String getSequenceNum() {return sequenceNum;}
	public void setSequenceNum(String _sequenceNum) {sequenceNum = _sequenceNum;}

	public IssueOfMagazine getIssueOfMagazine() {return issue;}
	public void setIssueOfMagazine(IssueOfMagazine _issue) {issue = _issue;}

	public String toString() {
		return issue.toString()+"\nSequence Number: " + sequenceNum;
	}
}
