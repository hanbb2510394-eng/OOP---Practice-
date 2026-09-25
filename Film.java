package practical1;

public class Film {
    private String title;
    private int year;
    private int duration;

    public String getTtile() {return title;}
    public int getYear() {return year;}
    public int getDuration() {return duration;}

    public void setTitle(String newTitle) {
        if (newTitle != null && !newTitle.isEmpty()){
            title = newTitle;
        }
    }
    public void setYear(int newYear) {
        if (newYear > 0) {
            year = newYear;
        }
        else{
            System.out.println("Error: Year must greater than 0!");
        }
    }
    public void setDuration (int newDuration) {
        if (newDuration >=0){
            duration = newDuration;
        }
    }

    public void play(String newTitle, int newYear, int newDuration){
        System.out.println("Now playing: " + newTitle + " (" + newYear + ") " + newDuration + " minnutes." );
    } 
    // we must remove static since the computer will get all raw values not checking the condition

}