public class Product {
    String title;
    String nameWorkOfArt;
    String firstAndLastArtistName;
    double price;

    public Product(String title, String nameWorkOfArt,
                   String firstAndLastArtistName, double price) {
        this.title = title;
        this.nameWorkOfArt = nameWorkOfArt;
        this.firstAndLastArtistName = firstAndLastArtistName;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNameWorkOfArt() {
        return nameWorkOfArt;
    }

    public void setNameWorkOfArt(String nameWorkOfArt) {
        this.nameWorkOfArt = nameWorkOfArt;
    }

    public String getFirstAndLastArtistName() {
        return firstAndLastArtistName;
    }

    public void setFirstAndLastArtistName(String firstAndLastArtistName) {
        this.firstAndLastArtistName = firstAndLastArtistName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
