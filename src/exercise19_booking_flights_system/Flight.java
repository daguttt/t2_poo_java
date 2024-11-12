package exercise19_booking_flights_system;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

public class Flight {
    private String flightNumber;
    private int totalSeats;
    private int availableSeats;
    private ArrayList<Booking> bookings;

    public Flight(String flightNumber, int totalSeats) {
        this.flightNumber = flightNumber;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
        this.bookings = new ArrayList<>();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public boolean isSeatAvailable() {
        return availableSeats > 0;
    }

    public Optional<Booking> bookSeat(Passenger passenger) {
        if (!isSeatAvailable()) {
            System.out.println("No seats available on flight " + flightNumber);
            return Optional.empty();
        }

        int seatNumber = totalSeats - availableSeats + 1; // Assign next available seat
        Booking booking = new Booking(LocalDate.now(), seatNumber, passenger, this);
        bookings.add(booking);
        availableSeats--;

        System.out.println("Booking successful: Seat " + seatNumber + " for " + passenger.getName());
        return Optional.of(booking);
    }

    public void cancelBooking(Booking booking) {
        if (bookings.remove(booking)) {
            availableSeats++;
            System.out.println("Booking for seat " + booking.getSeatNumber() + " has been canceled.");
        } else {
            System.out.println("Booking not found.");
        }
    }
}
