package composition;

import java.util.ArrayList;

public class Publication {
  private String name;
  private Publisher publisher;
  private ArrayList<Author> authors;
  private ArrayList<Editor> editors;

  public Publication(String name, Publisher publisher) {
    setName(name);
    setPublisher(publisher);
    authors = new ArrayList<Author>();
    editors = new ArrayList<Editor>();
  }

  public String getName() {return name;}
  public void setName(String _name) {name = _name;}

  public Publisher getPublisher() {return publisher;}
  public void setPublisher(Publisher _publisher) {publisher = _publisher;}

  public void addAuthor(Author ...authors) {
    for (Author a : authors) {
      this.authors.add(a);
    }
  }

  public void addEditor(Editor ...editors) {
    for (Editor e : editors) {
      this.editors.add(e);
    }
  }

  public String toString() {
    return "Publication name: "+name+"\n";
  }
}
