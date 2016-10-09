package composition;

import java.util.*;

public class Book extends Publication {
  private ArrayList <Chapter> chapters;
  private ArrayList <EditionOfBook> editions;

  public Book (String _title) {
    // null as second parameter because book constructor does not need publisher
    super(_title, null);
    chapters = new ArrayList <Chapter> ();
    editions = new ArrayList <EditionOfBook> ();
  }

  public void addChapter (Chapter c) {
    c.setBook(this);
    chapters.add(c);
  }

  public void addEdition (EditionOfBook e) {
    e.setBook(this);
    editions.add(e);
  }

  public String toString () {
    String value = super.toString() + "\n\nChapters:\n";
    int i = 1;
    for (Chapter c : chapters) {
      value += "\tChapter " + i++ + " " + c.toString() + "\n";
    }
    return value;
  }
}
