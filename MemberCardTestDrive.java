package practical1;
public class MemberCardTestDrive{
    public static void main(String [] args){
        // Set is input
        MemberCard person = new MemberCard();
        person.setName("");
        person.setStudentID("2510394");
        person.setEmail("hanbb.2510394");

        // Get is output
        System.out.println("Name: " + person.getName());
        System.out.println("Student ID: " + person.getStudentID());
        System.out.println("Email: " + person.getEmail());
    }
}
