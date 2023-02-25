package MovieRentalFramework;

public abstract class Movie {
    public static final Object REGULAR = 1;
    public static final Object NEW_RELEASE = 1;
    public static final Object CHILDRENS = 1;
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


