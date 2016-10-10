package composition;

public class CopyOfBook {
  private String rfid_code;
  private EditionOfBook edition;

  public CopyOfBook (String _rfid_code) {
    setRFIDCode(_rfid_code);
  }

  public void setRFIDCode (String rc) {
    rfid_code = rc;
  }
  public String getRFIDCode () {
    return rfid_code;
  }

  public void setEdition (EditionOfBook e) {
    edition = e;
  }
  public EditionOfBook getEdition () {
    return edition;
  }

  public String toString () {
    return edition.toString() + "\n" +
            "RFIDtag: " + rfid_code;
  }
}
