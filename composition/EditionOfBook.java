package composition;

import java.util.*;

public class EditionOfBook {
  private ArrayList <CopyOfBook> copies;

  private int editionNumber;
  private int issueQuantity;
  private String isbn;
  private Book ownerBook;

  public EditionOfBook (String _isbn, int _editionNumber, int _issueQuantity) {
    setEditionNumber(_editionNumber);
    setIssueQuantity(_issueQuantity);
    setIsbn(_isbn);

    copies = new ArrayList <CopyOfBook> ();
  }

  public void setIsbn (String i) {
    isbn = i;
  }
  public String getIsbn () {
    return isbn;
  }

  public void setIssueQuantity (int in) {
    issueQuantity = in;
  }
  public int getIssueQuantity () {
      return issueQuantity;
  }

  public void setEditionNumber (int e) {
    editionNumber = e;
  }
  public int getEditionNumber () {
    return editionNumber;
  }

  public void setBook (Book ob) {
    ownerBook = ob;
  }
  public Book getBook () {
    return ownerBook;
  }

  public void addCopy (CopyOfBook c) {
      c.setEdition(this);
      copies.add(c);
  }

  public String toString () {
    return ownerBook.toString() + "\n" +
            "\n\tEdition: " + editionNumber +
            "\n\tIssue Quantity: " + issueQuantity +
            "\n\tISBN: " + isbn;
  }
}
