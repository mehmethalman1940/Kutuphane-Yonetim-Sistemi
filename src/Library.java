import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Library {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();

    public void addBook() {

        

        System.out.print("Eklemek İstediğiniz Kitap id'sini Giriniz: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Book book: books){
            if (book.getId() == id){
                System.out.println("Aynı id'ye sahip kitap bulunmakta...");
                System.out.print("Lütfen yeni id giriniz:");
                id = scanner.nextInt();
            }
        }
        System.out.print("Eklemek İstediğiniz Kitap Başlığını Giriniz: ");
        String baslik = scanner.nextLine();
        System.out.print("Eklemek İsrediğiniz Kitabın Yazarını Giriniz: ");
        String yazar = scanner.nextLine();
        System.out.print("Eklemek istediğiniz Kitabın Yılını Giriniz: ");
        int yil= scanner.nextInt();
        if (yil<0){
            System.out.println("Yıl 0'dan küçük olamaz...");
            System.out.print("Tekrardan Eklemek istediğiniz Kitabın Yılını Giriniz: ");
            yil= scanner.nextInt();
        }
        System.out.print("Eklemek İstediğiniz Kitabın Sayfa Sayısını Giriniz: ");
        int sayfaSayisi = scanner.nextInt();
        if (sayfaSayisi<0){
            System.out.println("Sayfa sayisi 0'dan küçük olamaz...");
            System.out.print("Tekrardan Sayfa Sayısını Giriniz: ");
            sayfaSayisi = scanner.nextInt();
        }
        Book book = new Book(id, baslik, yil, yazar, sayfaSayisi);

        books.add(book);
        System.out.println("Kitabınız Eklendi");
        System.out.println("============================================");

    }

    public void listAllBook() {
        for (Book book : books) {
            System.out.println("Id: "+ book.getId());
            System.out.println("Başlık: "+ book.getTitle());
            System.out.println("Yazar: "+ book.getAuthor());
            System.out.println("Yıl: " + book.getYear());
            System.out.println("Sayfa Sayısı: "+ book.getPageNumber());
            System.out.println("****************");
        }
        System.out.println("=================================");

    }

    public void searchingBooksAuthor() {

        System.out.print("Aramak İstediğiniz Kitabın Yazarını Giriniz: ");
        String yazar = scanner.nextLine();

        boolean bulundu = false;

        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(yazar)) {
                System.out.println("Aradığınız Yazar Mevcut: "+book.getAuthor());
                System.out.println("Kitabı: "+ book.getTitle());
                bulundu = true;
            }
        }
        if (!bulundu) {
            System.out.println("Aradığınız Yazar Bulunamadı...");
        }
        System.out.println("=================================");

    }

    public void bookSize() {
        System.out.println("Toplam Kitap Sayınız: " + books.size());
        System.out.println("=================================");

    }

    public void oldestBook() {

        Book oldestBook = books.get(0);

        for (Book book1 : books) {
            if (book1.getYear() < oldestBook.getYear()) {
                oldestBook = book1;

            }

        }
        System.out.println("Yılına Göre En eski Kitap: "+ oldestBook.getTitle()+ "Yılı "+ oldestBook.getYear());
        System.out.println("=================================");
    }
    
    public void removeBook(){
        Iterator<Book> bookIterator = books.iterator();
        System.out.print("Silmek İstediğiniz Kitabın id'sini giriniz: ");
        int silinecekId = scanner.nextInt();
        while (bookIterator.hasNext()){
            if (bookIterator.next().getId() == silinecekId){
                bookIterator.remove();
                System.out.println("Kitap silindi.");
                System.out.println("================");
                System.out.println("Yeni Listeniz: ");
                listAllBook();
                return;
            }
        }
    }
}