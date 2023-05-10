package structural.facade.bookingExcample;

class HotelBookingService implements BookingInterface{
    @Override
    public void book(BookingInfo info){
        System.out.println("Hotel booked");
    }
}
