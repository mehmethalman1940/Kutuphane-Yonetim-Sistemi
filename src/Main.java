import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== KÜTÜPHANE YÖNETİM SİSTEMİ ===");
        String islemler = " 1. Kitap Ekle\n" +
                "2. Tüm Kitapları Listele \n" +
                "3. Yazara Göre Ara\n" +
                "4. Kitap Sayısını Göster \n" +
                "5. En Eski kitap \n" +
                "6. Kitap Sil \n" +
                "7. Çıkış Yap \n" +
                "====================================================";


        System.out.println(islemler);
        while (true) {


            System.out.print("Yapmak İstediğiniz İşlemi Giriniz: ");
            int islem = scanner.nextInt();

            switch (islem) {
                case 1:
                    library.addBook();
                    break;
                case 2:
                    library.listAllBook();
                    break;
                case 3:
                    library.searchingBooksAuthor();
                    break;
                case 4:
                    library.bookSize();
                    break;
                case 5:
                    library.oldestBook();
                    break;
                case 6:
                    library.removeBook();
                    break;
                case 7:
                    System.out.println("Programdan çıkılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçim");

            }
        }
    }
}