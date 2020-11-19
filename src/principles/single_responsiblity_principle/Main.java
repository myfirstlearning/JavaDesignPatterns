package principles.single_responsiblity_principle;

public class Main {

    public static void main(String[] args) throws Exception {

        Journal journal = new Journal();
        journal.addEntry("I cried today");
        journal.addEntry("I ate a bug");
        System.out.println(journal);

        Persistance p = new Persistance();
        String fileName = "C:\\Users\\dheeraj\\Desktop\\Files.txt";
        p.saveToFile(journal, fileName, true);

        Runtime.getRuntime().exec("notepad.exe " + fileName);

    }

}
