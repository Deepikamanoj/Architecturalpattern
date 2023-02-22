package SecutityInterceptor;

import MovieRentalFramework.Customer;
import MovieRentalFramework.Movie;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    private List<DispatchInfo> dispatchInfos;

    public Dispatcher() {
        dispatchInfos = new ArrayList<>();
    }

    public void add(Interceptor interceptor, Customer customer, Movie movie, int daysRented) {
        DispatchInfo dispatchInfo = new DispatchInfo(interceptor, customer, movie, daysRented);
        dispatchInfos.add(dispatchInfo);
    }

    public void dispatch() {
        for (DispatchInfo dispatchInfo : dispatchInfos) {
            Interceptor interceptor = dispatchInfo.interceptor;
            Customer customer = dispatchInfo.customer;
            Movie movie = dispatchInfo.movie;
            int daysRented = dispatchInfo.daysRented;

            interceptor.beforeRentMovie(customer, movie, daysRented);
            interceptor.afterRentMovie(customer, movie, daysRented);
        }
    }

    private static class DispatchInfo {
        Interceptor interceptor;
        Customer customer;
        Movie movie;
        int daysRented;

        DispatchInfo(Interceptor interceptor, Customer customer, Movie movie, int daysRented) {
            this.interceptor = interceptor;
            this.customer = customer;
            this.movie = movie;
            this.daysRented = daysRented;
        }
    }
}










