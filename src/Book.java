public class Book {

    private int id;
    private String baslik;
    private String yazar;
    private int yil;
    private int sayfaSayisi;

    public Book(int id, String baslik, int yil, String yazar, int sayfaSayisi) {
        this.id = id;
        this.baslik = baslik;
        this.yil = yil;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }


    public void bilgileriGoster(){
        System.out.println("Id: "+ getId());
        System.out.println("Kitap Başlığı: "+ getBaslik());
        System.out.println("Kitap Yazarı "+ getYazar());
        System.out.println("Kitap Yılı: "+ getYil());
        System.out.println("Kitap Sayfa Sayısı : "+ getSayfaSayisi());
    }

    public String toString() {
        return "Kitap ID: " + id +
                ", Başlık: " + baslik +
                ", Yazar: " + yazar +
                ", Yayın Yılı: " + yil +
                ", Sayfa Sayısı: " + sayfaSayisi;
    }
}
