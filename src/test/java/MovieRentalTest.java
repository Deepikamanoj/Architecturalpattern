import MovieRentalFramework.Movie;
import MovieRentalFramework.Rental;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovieRentalTest {

    private Rental rental;

    @BeforeEach
    public void setup() {
        rental = new Rental();
    }

    @Test
    public void testRentalStatement() {
        rental.addRental(new Rental(new Movie("Movie 1", Movie.REGULAR) {
            @Override
            public double getCharge(int daysRented) {
                return 0;
            }
        }, 3));
        rental.addRental(new Rental(new Movie("Movie 2", Movie.NEW_RELEASE) {
            @Override
            public double getCharge(int daysRented) {
                return 0;
            }
        }, 2));
        rental.addRental(new Rental(new Movie("Movie 3", Movie.CHILDRENS) {
            @Override
            public double getCharge(int daysRented) {
                return 0;
            }
        }, 4));
        String statement = rental.generateRentalStatement();
        String expected = "Rental Record for Customer\n"
                + "\tMovie 1\t3.5\n"
                + "\tMovie 2\t6.0\n"
                + "\tMovie 3\t3.0\n"
                + "Amount owed is 12.5\n"
                + "You earned 4 frequent renter points";
        Assertions.assertEquals(expected, statement);
    }

    @Test
    public void testRentalStatementWithZeroRentals() {
        String statement = rental.generateRentalStatement();
        String expected = "Rental Record for Customer\n"
                + "Amount owed is 0.0\n"
                + "You earned 0 frequent renter points";
        Assertions.assertEquals(expected, statement);
    }

    @Test
    public void testRentalStatementWithNullRentals() {
        rental.addRental(null);
        String statement = rental.generateRentalStatement();
        String expected = "Rental Record for Customer\n"
                + "Amount owed is 0.0\n"
                + "You earned 0 frequent renter points";
        Assertions.assertEquals(expected, statement);
    }

    @Test
    public void testRentalStatementWithNegativeDaysRented() {
        rental.addRental(new Rental(new Movie("Movie 1", Movie.REGULAR) {
            @Override
            public double getCharge(int daysRented) {
                return 0;
            }
        }, -1));
        String statement = rental.generateRentalStatement();
        String expected = "Rental Record for Customer\n"
                + "\tMovie 1\t0.0\n"
                + "Amount owed is 0.0\n"
                + "You earned 0 frequent renter points";
        Assertions.assertEquals(expected, statement);
    }
}
