package MovieRentalFramework;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");

        for (Rental rental : rentals) {

            result.append("\t").append(rental.getMovie().getTitle()).append("\t")
                    .append(String.valueOf(rental.getCharge())).append("\n");
            totalAmount += rental.getCharge();
            frequentRenterPoints += rental.getFrequentRenterPoints();
        }

        result.append("Amount owed is ").append(String.valueOf(totalAmount)).append("\n");
        result.append("You earned ").append(String.valueOf(frequentRenterPoints))
                .append(" frequent renter points");
        return result.toString();
    }
}



