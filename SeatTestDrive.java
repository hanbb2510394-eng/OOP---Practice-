package practical1;

public class SeatTestDrive {
    public static void main(String[] args){
        Seat s = new Seat();
        s.setRow("C");
        s.setNumber(12);
        s.setReserved(true);
        s.setReserved(true);
        s.release();
        s.release();
        s.setNumber(-4);
        s.printInfo();
    }
}
