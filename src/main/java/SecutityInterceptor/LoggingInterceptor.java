package SecutityInterceptor;

import MovieRentalFramework.Customer;
import MovieRentalFramework.Movie;

public class LoggingInterceptor extends Interceptor {
    @Override
    public void beforeRentMovie(Customer customer, Movie movie, int daysRented) {
        System.out.println("Renting movie: " + movie.getTitle() + " for " + customer.getName());
    }

    @Override
    public void afterRentMovie(Customer customer, Movie movie, int daysRented) {
        System.out.println("Movie rented: " + movie.getTitle() + " for " + customer.getName());
    }
}




