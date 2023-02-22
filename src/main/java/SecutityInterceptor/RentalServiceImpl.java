package SecutityInterceptor;

import MovieRentalFramework.Customer;
import MovieRentalFramework.Movie;

import java.util.List;

public class RentalServiceImpl implements RentalService {
    private List<Interceptor> interceptors;

    public RentalServiceImpl(List<Interceptor> interceptors) {
        this.interceptors = interceptors;
    }

    @Override
    public void rentMovie(Customer customer, Movie movie, int daysRented) {
        Dispatcher dispatcher = new Dispatcher();
        for (Interceptor interceptor : interceptors) {
            dispatcher.add(interceptor, customer, movie, daysRented);
        }
        dispatcher.dispatch();
    }
}


