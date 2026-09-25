package practical1;

public class TestPlayTime {
    public static void main (String[] args){
        // create and print separately Film and shortFilm object first
        PlayTime film = new PlayTime();
        film.setHours(2);
        film.setMinutes(35);
        System.out.println(film.getHours() + " h " + film.getMinutes() + " min");

        PlayTime shortFilm = new PlayTime();
        shortFilm.setHours(0);
        shortFilm.setMinutes(20);
        System.out.println(shortFilm.getHours() + " h " + shortFilm.getMinutes() + " min ");
        
        // put addiction and substraction 
        // calling an method return an object
        // PlayTime doubleBill = variable declaration (creating an object)
        // film.add(shortFilm) = method call, go to the film object, run its add method and pass shortFilm inside the argument
        // here shortFilm = PlayTime other
        PlayTime doubleBill = film.add(shortFilm);
        System.out.println(doubleBill.getHours() + " h " + doubleBill.getMinutes() + " min");

        PlayTime gap = film.substract(shortFilm);
        System.out.println(gap.getHours() + " h " + gap.getMinutes() + " min");

    }
}
