package composition;

import java.util.ArrayList;

public class Editor {
  private String name;
  private String institution;
  private ArrayList<Publication> publications;

  public Editor(String name, String institution) {
    setName(name);
    setInstitution(institution);
    publications = new ArrayList<Publication>();
  }

  public String getName() {return name;}
  public void setName(String _name) {name = _name;}

  public String getInstitution() {return institution;}
  public void setInstitution(String _institution) {institution = _institution;}

  public void addPublication(Publication ...publications) {
    for (Publication p : publications) {
      this.publications.add(p);
    }
  }

  public String toString() {
    return "Name: "+name+"\tInstitution: "+institution+"\n";
  }
}
