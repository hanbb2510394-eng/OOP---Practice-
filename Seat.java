package practical1;

public class Seat {
    private String row;
    private int number;
    private boolean reserved; 

    public void setRow (String newRow) {row = newRow;}
    public void setNumber (int newNumber) {
        if (newNumber < 0){
            System.out.println("Invalid seat number: " + newNumber);
        }
        else{
            number = newNumber; 
        }
    }

    public void setReserved (boolean newReserved) {
        // the default of boolen is false 
        if (reserved){
            System.out.println("Seat " + row + number + " is already reserved");
        }
        else{
            reserved = true;
            System.out.println("Seat " + row + number + " reserved");
            }
        }

    public void release(){
            // the user want to release the seat 
        if(!reserved){ 
            System.out.println("Seat " + row + number + " is not reserved");
        }
        else{
            reserved = false;
            System.out.println("Seat " + row + number + " released");
            }
        }
 
    public void printInfo(){
        if (reserved){
            System.out.println("Seat " + row + number + " - free");
        }
        else{
            System.out.println("Seat " + row + number + " - reserved"); 
        }
    }

    public String getRow() {return row;}
    public int getNumber() {return number;}
    public boolean getReserved() {return reserved;}
}
