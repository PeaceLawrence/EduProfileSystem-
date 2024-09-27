public class Student extends Person {

    private int earnedCredits;
    private double gpa;
    private String major;

    public Student (String name, int age, int height, int weight, int earnedCredits, double gpa, String major) {

        
        super(name, age, height, weight);
        this.earnedCredits = earnedCredits;
        this.gpa = gpa;
        this.major = major; 

    }

    public int getEarnedCreds(){
        return earnedCredits;
    }

    public double getGPA(){
        return gpa;
    }

    public String getMajor(){
        return major;
    }

    public String toString() {
        return getName() + " age:" + getAge() + " height:" + 
        getHeight() + "ins. " + "weight: " + getWeight() + "Ibs " + " Earned Credits:" + getEarnedCreds() + 
        " gpa: " + getGPA() + " Major: " + getMajor();  }

    public String status(){
        if(getEarnedCreds() >= 0 && getEarnedCreds() < 30){
        return "Freshman";
    }
        else if(getEarnedCreds() >= 31 && getEarnedCreds() <= 60){
            return "Sophomore";
        }
        else if(getEarnedCreds() >= 61 && getEarnedCreds() <= 90){
            return "Junior";
        }
        else if(getEarnedCreds() >= 91){
            return "Senior";
        }
        else{
            return "Invalid Input";
        }

    }
}