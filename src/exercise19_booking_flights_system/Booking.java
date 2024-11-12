package exercise19_booking_flights_system;

import java.time.LocalDate;

public class Booking {
    private LocalDate date;
    private int seatNumber;
    private Passenger passenger;
    private Flight flight;

    public Booking(LocalDate date, int seatNumber, Passenger passenger, Flight flight) {
        this.date = date;
        this.seatNumber = seatNumber;
        this.passenger = passenger;
        this.flight = flight;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }
}
