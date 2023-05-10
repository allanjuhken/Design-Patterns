package structural.facade.bookingExcample;

class FlightBookingService implements BookingInterface{
    @Override
    public void book(BookingInfo info){
        System.out.println("Flight booked");
    }
}
