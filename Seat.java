package practical1;

public class Seat {
    private String row;
    private int number;
    private boolean reserved; 

    public void setRow (String newRow) {
        row = newRow;
    }
    public void setNumber (int newNumber) {number = newNumber;}
    public void setReserved (boolean newReserved) {reserved = newReserved;}

    public String getRow() {return row;}
    public int getNumber() {return number;}
    public boolean getReserved() {return reserved;}

}
