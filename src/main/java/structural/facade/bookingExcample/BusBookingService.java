package structural.facade.bookingExcample;

public class BusBookingService implements BookingInterface{

    @Override
    public void book(BookingInfo bookingInfo) {
        System.out.println("booking bus");
    }
}
