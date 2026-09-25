package practical1;

public class TicketCardTestDrive {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket();
        ticket1.setConcertTitle("Eras Tour");
        ticket1.setArtistName("Taylor Swift");
        ticket1.setSeatingZone("CAT 4");
        ticket1.setPrice(150);
        

        Ticket ticket2 = new Ticket();
        ticket2.setArtistName("Bruno Mars");
        ticket2.setConcertTitle("World Tour");
        ticket2.setSeatingZone("VIP 1");
        ticket2.setPrice(200);
        
        Ticket ticket3 = new Ticket();
        ticket3.setConcertTitle("Asia Tour");
        ticket3.setArtistName("Black Pink");
        ticket3.setSeatingZone("CAT 1");
        ticket3.setPrice(100);


        
        // we just create the Ticket informations, now we have to add these tickets into TicketCard (purchases)
        TicketCard ticketCard = new TicketCard();
        ticketCard.addToCart(ticket1);
        ticketCard.addToCart(ticket2);
        ticketCard.addToCart(ticket3);  

        ticketCard.removeFromCart(ticket3);
        ticketCard.checkOut();
    
    
    }
}
