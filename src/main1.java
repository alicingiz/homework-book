import java.util.Arrays;
import java.util.Scanner;

public class main1 {
    static Book[] books = new Book[20];

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Secim edin");
        System.out.println("1- butun kitablara bax");
        System.out.println("2- kitab elave edin");


        int input = scanner.nextInt();
        scanner.nextLine();
        while (true) {

            switch (input) {
                case 1:
                    showBooks();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    davamEtmek();
                    break;
                case 4:
                    axtarisEtmek();
                    break;

            }
        }


    }

    public static void showBooks() {
        for (Book book : books) {
            if (book != null)
                System.out.println("Name: " + book.name + "price: " + book.price + "count: " + book.count);
        }
    }

    public static void addBook() {
        String bookName = scanner.nextLine();
        int bookPrice = scanner.nextInt();
        int bookCount = scanner.nextInt();


        Book book = new Book(bookName, bookPrice, bookCount);
        boolean hasEmpty = true;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                hasEmpty = false;
                break;
            }
        }

        if (hasEmpty) {
            Book[] newBook = new Book[books.length * 2];
            for (int i = 0; i < books.length; i++) {
                newBook[i] = books[i];
            }
            newBook[books.length] = book;
            books = newBook;

        }
    }

    public static void davamEtmek() {
        System.out.println("yes ve ya no secin");
        String secim = scanner.nextLine();

        if (secim.equals("yes")) {
            System.out.println("proqram davam edir");
        } else if (secim.equals("no")) {
            System.out.println("proqram bitirildi");
            System.exit(0);
        }

    }

    public static void axtarisEtmek() {
        System.out.println("Yes ve ya no secin");
        String secim = scanner.nextLine();


        if (secim.equals("yes")) {
            System.out.println("kitabin adini qeyd edin");
            String ad = scanner.nextLine();
            System.out.println("minimum qiymetini daxil edin");
            int min = scanner.nextInt();
            System.out.println("max qiymetini daxil edin");
            int max = scanner.nextInt();

        } else if (secim.equals("no")) {
            System.out.println("proqram bitdi");
            System.exit(0);
        }
    }
}
