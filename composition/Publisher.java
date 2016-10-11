package composition;

import java.util.ArrayList;

public class Publisher {
  private String name;
  private String location;
  private ArrayList<Publication> publications;

  public Publisher(String name, String location) {
    setName(name);
    setLocation(location);
    publications = new ArrayList<Publication>();
  }

  public String getName() {return name;}
  public void setName(String _name) {name = _name;}

  public String getLocation() {return location;}
  public void setLocation(String _location) {location = _location;}

  public void addPublication(Publication ...publications) {
    for (Publication p : publications) {
      this.publications.add(p);
    }
  }

  public String toString() {
    return "Publisher: "+name+"\tLocation: "+location+"\n";
  }
}
