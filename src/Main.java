public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, false);
        Printer printerOne = new Printer(50, true);

        System.out.println("Initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printing(5);
        System.out.println("pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printing(2);
        System.out.println("pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printerOne.printing(8);
        System.out.println("pages printed was " + pagesPrinted + " new total print count for printer = " + printerOne.getPagesPrinted());





    }
}
