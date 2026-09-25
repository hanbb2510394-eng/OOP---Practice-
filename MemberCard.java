package practical1;
// with a class having many properties, while using encapsualtion you should do like this
// step 1: declare private fields for encapsulation
// step 2: getters
// step 3: setters 
public class MemberCard {
    private String name;
    private String studentID;
    private String email;

// Getters
    public String getName() {return name;}
    public String getStudentID() {return studentID;}
    public String getEmail() {return email;}

// Setters 
    public void setName(String newName) { // accept anything, even empty set
        if (newName != null && !newName.isEmpty()){
            name = newName; 
        }
        else {
            System.out.println("Error: Name cannot be null or empty!");
        }
    }
    public void setStudentID(String newStudentID) {
        if (newStudentID != null && !newStudentID.isEmpty()){
            studentID = newStudentID; 
        }
        else{
            System.out.println("Error: Student ID cannot be null or empty!");
        }
    }
    public void setEmail(String newEmail) {
        if (newEmail != null && !newEmail.isEmpty()){
            email = newEmail;
        }
        else{
            System.out.println("Error: Email cannot be null or empty!");
        }
    }

}

// this code is correct and can run however we need to get a validator for the setter
// goals of setter methods: protect your object from invalid data (like empty text or null)
// if user call setName() or setEmail() or setStudentID()without a valid value, causing an error
// the setter will check the parameter is whether valid or not before saving it to instance variable
// solution: adding if statement to check the validation  