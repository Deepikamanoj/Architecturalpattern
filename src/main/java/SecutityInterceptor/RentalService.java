package SecutityInterceptor;

import MovieRentalFramework.Customer;
import MovieRentalFramework.Movie;

public interface RentalService {
    void rentMovie(Customer customer, Movie movie, int daysRented);
}



