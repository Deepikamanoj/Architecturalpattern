package SecutityInterceptor;

import MovieRentalFramework.Customer;
import MovieRentalFramework.Movie;

public class SecurityInterceptor extends Interceptor {
    @Override
    public void beforeRentMovie(Customer customer, Movie movie, int daysRented) {
        // check if the customer has the required permissions to rent this movie
        if (!customer.getName().equals("admin")) {
            throw new SecurityException("Only admin can rent this movie");
        }

    }

    @Override
    public void afterRentMovie(Customer customer, Movie movie, int daysRented) {
        // no need to do anything after renting the movie
    }
}



