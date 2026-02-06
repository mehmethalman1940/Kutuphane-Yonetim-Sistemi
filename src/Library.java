import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Library {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();

    public void kitapEkle() {

        

        System.out.print("Eklemek İstediğiniz Kitap id'sini Giriniz: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Eklemek İstediğiniz Kitap Başlığını Giriniz: ");
        String baslik = scanner.nextLine();
        System.out.print("Eklemek İsrediğiniz Kitabın Yazarını Giriniz: ");
        String yazar = scanner.nextLine();
        System.out.print("Eklemek istediğiniz Kitabın Yılını Giriniz: ");
        int yil = scanner.nextInt();
        System.out.print("Eklemek İstediğiniz Kitabın Sayfa Sayısını Giriniz: ");
        int sayfaSayisi = scanner.nextInt();

        Book book = new Book(id, baslik, yil, yazar, sayfaSayisi);

        books.add(book);
        System.out.println("Kitabınız Eklendi");
        System.out.println("============================================");

    }

    public void tumKitaplariListele() {
        for (Book book : books) {
            System.out.println("Id: "+ book.getId());
            System.out.println("Başlık: "+ book.getBaslik());
            System.out.println("Yazar: "+ book.getYazar());
            System.out.println("Yıl: " + book.getYil());
            System.out.println("Sayfa Sayısı: "+ book.getSayfaSayisi());
            System.out.println("****************");
        }
        System.out.println("=================================");

    }

    public void yazaraGoreAra() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aramak İstediğiniz Kitabın Yazarını Giriniz: ");
        String yazar = scanner.nextLine();

        boolean bulundu = false;

        for (Book book : books) {
            if (book.getYazar().equalsIgnoreCase(yazar)) {
                System.out.println("Aradığınız Yazar Mevcut...");
                bulundu = true;
            }
        }
        if (!bulundu) {
            System.out.println("Aradığınız Yazar Bulunamadı...");
        }
        System.out.println("=================================");

    }

    public void kitapSayisi() {
        System.out.println("Toplam Kitap Sayınız: " + books.size());
        System.out.println("=================================");

    }

    public void enEskiKitap() {

        Book enEskiKitap = books.get(0);

        for (Book book1 : books) {
            if (book1.getYil() < enEskiKitap.getYil()) {
                enEskiKitap = book1;

            }
            System.out.println("Yılına Göre En eski Kitap: "+ enEskiKitap.getBaslik()+ "Yılı "+ enEskiKitap.getYil());
            System.out.println("=================================");
        }
    }
    
    public void kitapSilme(){
        Iterator<Book> bookIterator = books.iterator();
        System.out.print("Silmek İstediğiniz Kitabın id'sini giriniz: ");
        int silinecekId = scanner.nextInt();
        while (bookIterator.hasNext()){
            if (bookIterator.next().getId() == silinecekId){
                bookIterator.remove();
                System.out.println("Kitap silindi.");
                System.out.println("================");
                System.out.println("Yeni Listeniz: ");
                tumKitaplariListele();
                return;
            }
        }
    }
}