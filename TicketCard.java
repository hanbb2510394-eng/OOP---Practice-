package practical1;
// TicketCard.java file holds a collection of tickets and manages adding/removing them
// define two main attributes
// cartContents = an array of Ticket objects
// count = an int to keep track of how many tickets are currently in the cart 
public class TicketCard {
    // we must declare cartContents to be an array of Ticket objets so it can hold multiple Ticket object 
    // it will hold all attributes of the Ticket.java file 
    private Ticket[] cartContents = new Ticket[10];
    private int count;

    public Ticket[] getCartContents() {return cartContents;}
    public int getCount() {return count;}

    public void setCartContents(Ticket[] newCartContents) {
        cartContents = newCartContents;
    }
    public void setCount(int newCount){
        count = newCount;
    }

    // addToCart(Ticket t)
    // we need to make sure the cart isn't full yet (max size is 10) --> if statement
    // cartContents = the array itself - the entire row of lockers
    // count = this variables keep track of how many items are currently in the cart
    // [count] = tell Java which specific locker index to open 
    // e.g. count = 2 (means you currently have 2 tickets) --> lockers 0 and 1 already contain tickets 
    // & locket 2 is the first empty spot and places ticket t inside it
    public void addToCart(Ticket t){ 
    if (count < cartContents.length){
        cartContents[count] = t;
        count++;}
    else {
        System.out.println("Cannot add ticket: Cart is full!");
    }
}
    // removeFromTicket ideas
    // step 1: find the removed ticket position through the array from 0 to count - 1
    // step 2: shift all remaining ticket backward one index so we don't have null at the middle of the array --> cartContents[j] = cartContents[j + 1]
    // step 3: set the bottom element: cartContents[count - 1] = null
    // step 4: count--
    public void removeFromCart(Ticket t){
    int i = 0; // starts checking at the first item
    while(i < count && !cartContents[i].equals(t)) {
        i++;
        // i < count = we still looking at valid tickets (we only looked at filled shelves)
        // !cartContents[i].equals(t): is the ticket on shelf i NOT the ticket t we want to remove
        // as long as shelf i has the wrong ticket, the condition is true (equals() is boolen), the loops keep running
        // this isn't the ticket we looking for, move to the next element 
    }
    if (i == count){
        System.out.println("Cannot remove: Ticket not found in cart!");
        return; // exist since there is nothing to remove 
    }
    // shift remaining items to the left
    while (i < count - 1){
        cartContents[i] = cartContents[i + 1]; // syntax to shift item to the left (change the index)
        i++; // the loop continue until the condition whhile is false 
    }
        cartContents[count - 1] = null; // clear the duplicate slot at the end as null
        count--; // decrease the number of ticket in the cart 
    }

    // checkOut() to print the bill 
    public void checkOut(){
        int totalPrice = 0; 
        for (int i = 0; i < count; i++){
            totalPrice += cartContents[i].getPrice(); // equation to calculate the total price
            System.out.println("Ticket details: " + cartContents[i].getConcertTitle() + ", "+ cartContents[i].getArtistName() + ", " + cartContents[i].getSeatingZone() + ", " + "$" + cartContents[i].getPrice());
            System.out.println("Current price: " + "$" + totalPrice);
        }
        count = 0; // reset the cart items to zero --> purchases is empty 

}
}


    





