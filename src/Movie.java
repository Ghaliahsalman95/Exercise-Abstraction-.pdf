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
        double getDiscout=0.2;
        double net=getPrice();
        net-= getPrice()*getDiscout;

        return net;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "director='" + director + '\'' +
                "Price"+getPrice()+" After Discount is: "+getDiscout()+
                '}';
    }
}
