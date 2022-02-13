import java.util.Arrays;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber; 
    
    public Person(String name, String nationality, String dateofBirth, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateofBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];

    }
    

    
    public String getName() {
        return this.name;
        }
    public String getNationality() {
        return this.nationality;
    }
    public String getdateofBirth() {
        return this.dateOfBirth;
    }
    public int getseatNumber() {
        return this.seatNumber;
    }
    public String[] getpassport() {
        return Arrays.copyOf(passport, passport.length);

    }
    public void setName(String name){
        this.name = name;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void setdateofBirth(String dateofBString) {
        this.dateOfBirth = dateofBString;
    }
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;

    }public void setPassport(){
        this.passport = new String[]{name, nationality, dateOfBirth};
    }
    
    public Person(Person source) {
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
    }

    public boolean applyPassport(){
        int number = (int) (Math.random() * 2);
        if (number == 0) {
            return true;
        } else {
        
        return false;
        }

    }public void chooseSeat() {
        this.seatNumber = (int) Math.random() * 11 + 1;
        
    }public String toString() {
        return "Name: " + this.name + ".\n"
        + "Nationality: " + this.nationality + ".\n"
        + "Date of Birth: " + this.dateOfBirth + ".\n"
        + "Seat Number: " + this.seatNumber + ".\n"
        + "Passport: " + Arrays.toString(passport) + ".\n";
    }

}
