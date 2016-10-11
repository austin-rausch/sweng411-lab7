package composition;

import java.util.ArrayList;

public class Magazine extends Publication {

	//Member variables
	private String foundingYear;
	private String issn;

	//Associated objects
	private ArrayList<Volume> volumes;

	public Magazine(String _name, String _issn, String _foundingYear){
		super(_name, null);	//implemented in Test.java as
							//subsequent set methods
		setFoundingYear(_foundingYear);
		setIssn(_issn);
		volumes = new ArrayList<Volume>();
	}


	public String getFoundingYear(){
		return foundingYear;
	}


	public String getIssn(){
		return issn;
	}

	public void setFoundingYear(String _foundingYear) {
		foundingYear = _foundingYear;
	}


	public void setIssn(String _issn) {
		issn = _issn;
	}

	public void addVolumes(Volume _volume){
		volumes.add(_volume);
	}

	public String toString(){
		String msg = super.toString();
		msg += "\nISSN: " + this.getIssn();
		msg += "\nFounding year: " + this.getFoundingYear();
		return msg + "\n\n";
	}
}
