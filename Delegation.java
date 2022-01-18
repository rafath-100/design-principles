// Delegation Principle : Handling over a responsibility for a particular to task to other class or method

interface TravelBooking {
    void bookTickets();
}

class TrainTicket implements TravelBooking {
    @Override
    public void bookTickets() {
        System.out.println("Train Tickets Booked");
    }
}

class FlightTicket implements TravelBooking {
    @Override
    public void bookTickets() {
        System.out.println("Flight Tickets Booked");
    }
}

class TicketBookingAgent implements TravelBooking {
    TravelBooking ticket;
    public TicketBookingAgent(TravelBooking ticket){
        this.ticket = ticket;
    }
    public void bookTickets() {
        ticket.bookTickets();
    }
}
public class Delegation {
    public static void main(String ...args){
        TicketBookingAgent train = new TicketBookingAgent(new TrainTicket());
        TicketBookingAgent flight = new TicketBookingAgent(new FlightTicket());
        train.bookTickets();
        flight.bookTickets();
    }
}
