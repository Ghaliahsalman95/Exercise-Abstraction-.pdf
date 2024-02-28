public class Book extends Product{
private String author;

    public Book(String author) {
        this.author = author;
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book() {
    }

    @Override
    public double getDiscout() {
        double discout=0.3;
return this.getPrice()-(this.getPrice()*discout);
//        double net=getPrice();
//               net-= getPrice()*discout;
//
//        return net;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                "Price"+getPrice()+" After Discount is: "+getDiscout()+
                '}';
    }
}
