package composition;

public class Chapter {
  private String title;
  private int startPage;
  private int endPage;
  private Book ownerBook;

  public Chapter (String _title, int _startPage, int _endPage) {
    setTitle(_title);
    setStartPage(_startPage);
    setEndPage(_endPage);
  }

  public void setTitle (String t) {
    title = t;
  }
  public String getTitle () {
    return title;
  }

  public void setStartPage (int sp) {
    startPage = sp;
  }
  public int getStartPage () {
    return startPage;
  }

  public void setEndPage (int ep) {
    endPage = ep;
  }
  public int getEndPage () {
    return endPage;
  }

  public void setBook (Book ob) {
    ownerBook = ob;
  }
  public Book getBook () {
    return ownerBook;
  }

  public String toString () {
    return title + ",\t" + "Pages: " +
            startPage + "---" + endPage;
  }
}
