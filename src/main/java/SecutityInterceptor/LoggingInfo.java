package SecutityInterceptor;

import java.time.LocalDateTime;

public class LoggingInfo implements LoggingContext{
    private final String customerName;
    private final String movieName;
    private final LocalDateTime timestamp;

    public LoggingInfo(String customerName, String movieName, LocalDateTime timestamp) {
        this.customerName = customerName;
        this.movieName = movieName;
        this.timestamp = timestamp;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getMovieName() {
        return movieName;
    }
}


