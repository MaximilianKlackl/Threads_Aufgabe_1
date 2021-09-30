
public class Main {

    public static void main(String[] args) {

        /*
        Starte nun beide Threads.
        - Was fällt auf?
        - Versuche das Phänomen zu erklären!
        - Ändere nun dein Programm, sodass jeweils mehr Ausgaben je Thread erfolgen (200, 2000, 20000, ...) - was beobachtest du dabei?

         Antwort: Das Programm läuft auf einen "Main Thread".
         Dieser erzeugt 2 andere bei welchen pseudo paralität vorgeteuscht wird.
         Spricht der Main Thread wechselt zwischen den 2 erzeugten.
         */

        DatePrinter datePrinter = new DatePrinter();
        Thread datePrinterThread = new Thread(datePrinter);
        datePrinterThread.start();

        CountPrinter countPrinter = new CountPrinter();
        Thread countPrinterThread = new Thread(countPrinter);
        countPrinterThread.start();
    }
}
