package practical1;

public class FilmTestDrive {
    public static void main (String[] args){
        Film film1 = new Film();
        film1.setTitle("Dune");
        film1.setYear(-2000);
        film1.setDuration(155);
        film1.play("Dune", film1.getYear(), film1.getDuration());
    }
    
}
