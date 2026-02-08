public class Book {

    private int id;
    private String title;
    private String author;
    private int year;
    private int pageNumber;

    public Book(int id, String title, int yil, String yazar, int sayfaSayisi) {
        this.id = id;
        this.title = title;
        this.year = yil;
        this.author = yazar;
        this.pageNumber = sayfaSayisi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }


    public void bilgileriGoster(){
        System.out.println("Id: "+ getId());
        System.out.println("Kitap Başlığı: "+ getTitle());
        System.out.println("Kitap Yazarı "+ getAuthor());
        System.out.println("Kitap Yılı: "+ getYear());
        System.out.println("Kitap Sayfa Sayısı : "+ getPageNumber());
    }

    public String toString() {
        return "Kitap ID: " + id +
                ", Başlık: " + title +
                ", Yazar: " + author +
                ", Yayın Yılı: " + year +
                ", Sayfa Sayısı: " + pageNumber;
    }
}
