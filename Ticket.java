package practical1;
// goal: building a shopping cart system for buying concert ticket 
// Ticket.java file hold the information of individual ticket 

public class Ticket {
    private String concertTitle; 
    private String artistName;
    private String seatingZone;
    private int price;

    public String getConcertTitle() {return concertTitle;}
    public String getArtistName() {return artistName;}
    public String getSeatingZone() {return seatingZone;}
    public int getPrice() {return price;}

    public void setConcertTitle(String newConcertTitle){
        concertTitle = newConcertTitle;
    }
    public void setArtistName(String newArtistName){
        artistName = newArtistName;
    }
    public void setSeatingZone(String newSeatingZone){
        seatingZone = newSeatingZone;
    }
    public void setPrice(int newPrice){
        price = newPrice;
    }

    
    
}
