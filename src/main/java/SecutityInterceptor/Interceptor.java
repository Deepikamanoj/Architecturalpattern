package SecutityInterceptor;

import MovieRentalFramework.Customer;
import MovieRentalFramework.Movie;

public abstract class Interceptor {
public abstract void beforeRentMovie(Customer customer, Movie movie, int daysRented);

public abstract void afterRentMovie(Customer customer, Movie movie, int daysRented);

public abstract void beforeRentMovie(Customer customer, Movie movie, int daysRented);
}