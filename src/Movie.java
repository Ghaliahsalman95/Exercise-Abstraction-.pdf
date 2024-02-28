public class Movie extends Product{
    private String director;

    public Movie() {
    }

    public Movie(String director) {
        this.director = director;
    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    @Override
    public double getDiscout() {
        double discout=0.2;
//        double net=getPrice();
//        net-= getPrice()*discout;
return this.getPrice()-(this.getPrice()*discout);

    }

    @Override
    public String toString() {
        return "Movie{" +
                "director='" + director + '\'' +
                "Price"+getPrice()+" After Discount is: "+getDiscout()+
                '}';
    }
}
