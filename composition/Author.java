package composition;

import java.util.ArrayList;

public class Author {
  private String name;
  private String citizenship;
  private ArrayList<Publication> publications;

  public Author(String name, String citizenship) {
    setName(name);
    setCitizenship(citizenship);
    publications = new ArrayList<Publication>();
  }

  public String getName() {return name;}
  public void setName(String _name) {name = _name;}

  public String getCitizenship() {return citizenship;}
  public void setCitizenship(String _citizenship) {citizenship = _citizenship;}

  public void addPublication(Publication ...publications) {
    for (Publication p : publications) {
      this.publications.add(p);
    }
  }

  public String toString() {
    return "Name: "+name+"\tCitizenship: "+citizenship+"\n";
  }
}
