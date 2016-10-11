package composition;

import java.util.*;

public class Test {

    private static EditionOfBook editions[] = new EditionOfBook[3];
    private static Publisher springer = new Publisher("Springer", "Berlin, Germany");
    private static Volume IEvolumes[] = new Volume[3];

    public static void main(String[] args) {
        initializeSEBooks();
        mySEBooks();
        initializeIEMagzine();
        myIEMagzines();
    }

    public static void initializeIEMagzine() {
        Magazine iexplore = new Magazine("IExplore", "109-976-543-21", "2012");
        springer.addPublication(iexplore);
        iexplore.setPublisher(springer);

        Author sommer = new Author("Sommer", "USA");
        iexplore.addAuthor(sommer);
        sommer.addPublication(iexplore);

        Editor editors[] = new Editor[3];

        editors[0] = new Editor("Bill Gates", "Microsoft");
        editors[1] = new Editor("Jose Jones", "Center for Better Writing");
        editors[2] = new Editor("Mans Super", "Penn State Behrend");

        for (int i = 0; i < 3; i++) {
            iexplore.addEditor(editors[i]);
            editors[i].addPublication(iexplore);
        }


        for (int i = 0; i < 3; i++) {
            IEvolumes[i] = new Volume(iexplore, i + 1, 2000 + i, 12);
            iexplore.addVolumes(IEvolumes[i]);
            IssueOfMagazine issues[] = new IssueOfMagazine[12];
            for (int j = 0; j < 12; j++) {
                issues[j] = new IssueOfMagazine(IEvolumes[i], j + 1, j + 1, 10);
                IEvolumes[i].addIssueOfMagazine(issues[j]);
            }
        }
    }

    public static void initializeSEBooks() {

        Book softwareEngineering = new Book("Software Engineering", null);

        softwareEngineering.setPublisher(springer);
        springer.addPublication(softwareEngineering);

        Author sommerville = new Author("Sommerville Ian", "England");
        softwareEngineering.addAuthor(sommerville);
        sommerville.addPublication(softwareEngineering);

        Chapter chapters[] = new Chapter[4];

        chapters[0] = new Chapter("Introduction  ", 0, 10);
        chapters[1] = new Chapter("Specification ", 11, 33);
        chapters[2] = new Chapter("Design        ", 34, 66);
        chapters[3] = new Chapter("Implementation", 66, 100);

        for (int i = 0; i <= 3; i++) {
            softwareEngineering.addChapter(chapters[i]);
        }

        for (int i = 0; i < 3; i++) {
            editions[i] = new EditionOfBook("109-976-543-21" + i, (i + 1), ((i + 1) * 10));
            softwareEngineering.addEdition(editions[i]);
        }
    }

    public static void mySEBooks() {
        List<CopyOfBook> SEBooksOnMyShelf = new LinkedList<CopyOfBook>();
        String bcode = "11111111";
        CopyOfBook acopy = new CopyOfBook(bcode);
        SEBooksOnMyShelf.add(acopy);
        editions[0].addCopy(acopy);

        bcode = "22222222";
        acopy = new CopyOfBook(bcode);
        SEBooksOnMyShelf.add(acopy);
        editions[1].addCopy(acopy);

        bcode = "33333333";
        acopy = new CopyOfBook(bcode);
        SEBooksOnMyShelf.add(acopy);
        editions[1].addCopy(acopy);

        bcode = "44444444";
        acopy = new CopyOfBook(bcode);
        SEBooksOnMyShelf.add(acopy);
        editions[2].addCopy(acopy);

        bcode = "55555555";
        acopy = new CopyOfBook(bcode);
        SEBooksOnMyShelf.add(acopy);
        editions[2].addCopy(acopy);

        bcode = "66666666";
        acopy = new CopyOfBook(bcode);
        SEBooksOnMyShelf.add(acopy);
        editions[2].addCopy(acopy);

        ListIterator<CopyOfBook> editionIterator = SEBooksOnMyShelf.listIterator();
        int i=0;
        while(editionIterator.hasNext()){
            i=i+1;
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.printf("This is my %dth book:\n", i);
            System.out.println(editionIterator.next());
        }
    }

    public static void myIEMagzines() {
        List<CopyOfIssueOfMagazine> IEMagzineOnMyShelf = new LinkedList<CopyOfIssueOfMagazine>();

        String bcode = "mag-11111111";
        CopyOfIssueOfMagazine acopy = new CopyOfIssueOfMagazine(bcode);
        IEMagzineOnMyShelf.add(acopy);
        IEvolumes[0].getIssueOfMagazine(3).addCopyOfMagazineIssue(acopy);

        bcode = "mag-22222222";
        acopy = new CopyOfIssueOfMagazine(bcode);
        IEMagzineOnMyShelf.add(acopy);
        IEvolumes[1].getIssueOfMagazine(3).addCopyOfMagazineIssue(acopy);

        bcode = "mag-33333333";
        acopy = new CopyOfIssueOfMagazine(bcode);
        IEMagzineOnMyShelf.add(acopy);
        IEvolumes[2].getIssueOfMagazine(3).addCopyOfMagazineIssue(acopy);

        ListIterator<CopyOfIssueOfMagazine> editionIterator = IEMagzineOnMyShelf.listIterator();
        int i=0;
        while(editionIterator.hasNext()){
            i=i+1;
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.printf("This is my %dth magazine:\n", i);
            System.out.println(editionIterator.next());
        }

    }
}
