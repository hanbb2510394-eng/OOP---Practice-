package practical1;
// this program designed to store time in hrs/min and let you add or substract another PlayTime object
// add: combines two runtimes together when a cinema shows both movies back-to-back (chiếu liên tiếp)
// substract: finds the gap between the two movie runtimes

//
public class PlayTime{
    // Getters and Setters for defaut hours and minutes 
    private int hours;
    private int minutes;

    public int getHours() {return hours;}
    public int getMinutes() {return minutes;}

    public void setHours(int newHours) {
        hours = newHours;
    }
    public void setMinutes(int newMinutes){
        minutes = newMinutes;
    }

    // if the duration exceeds 60 minutes, converting that value into hours 

    // addiction (convert extra minutes to hours)
    // hrs added = totalMinutes / 60 (using integer division), e.g. minutes = 135 --> 2hrs
    // remaining minutes = totalMinutes % 60 (remainder operator) e.g 135 % 60 = 15 --> 2hrs 15 min

    public PlayTime add(PlayTime other){
        int totalMinutes = minutes + other.getMinutes();
        int extraHours = totalMinutes / 60;
        int remainingMinutes = totalMinutes % 60;
        int totalHours = hours + other.getHours() + extraHours;
       
        PlayTime result = new PlayTime();
        result.setHours(totalHours);
        result.setMinutes(remainingMinutes);
        return result;
    }

    // substraction 
    // covert hours to minutes first for both object: totalMinutes1 = (hours * 60) + minutes
    // gap between two movies: gap = totalMinutes(bigger) - totalMinutes(smaller)
    // convert back from minutes to hours (like above)
    // we don't put if else statement for totalMinutes1 and totalMinutes2 because the problem is mean default that totalMinutes1 is for Film
    // and totalMinutes2 is for shortFilm --> basically, totalMinutes always bigger than totalMinutes2 

    public PlayTime substract(PlayTime other){
        int totalMinutes1 = minutes + (hours * 60);
        int totalMinutes2 = other.getMinutes() + (other.getHours() * 60); // other object
        int gap = totalMinutes1 - totalMinutes2; 
        int gapHours = gap / 60;
        int gapMinutes = gap % 60;
       
        PlayTime result = new PlayTime();
        result.setHours(gapHours);
        result.setMinutes(gapMinutes);
        return result;

        // we can delete 4 remaining codes and copy it into Test file because of its goal
        // 1. Creation: PlayTime file needs to package the calculated gapHours and gapMinutes into a brand new PlayTime object (result)
        // 2. Returning: the line return result is what actually hands that new object back to whichever file called the method,
        // without is, the method wouldn't give anything back 
        // simplifying: the code is for creating and holding the object so we can run the method itself
    }
        
    
    
}