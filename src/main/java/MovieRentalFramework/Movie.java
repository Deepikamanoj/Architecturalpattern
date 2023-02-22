package MovieRentalFramework;

public abstract class Movie {
    public static final Object REGULAR = ;
    public static final Object NEW_RELEASE = ;
    public static final Object CHILDRENS = ;
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public Movie(String title, Object regular) {
    }

    public String getTitle() {
        return title;
    }

    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}


