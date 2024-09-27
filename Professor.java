public class Professor extends Person{
    private int teaching_load;
    private double student_eval;
    private String department; 

    public Professor (String name, int age, int height, int weight, int teaching_load,
     double student_eval, String department ) {
        super(name, age, height, weight);
        this.teaching_load = teaching_load;
        this.student_eval = student_eval;
        this.department = department;
    }

    public int getTeachingLoad(){
        return teaching_load;
    }

    public double getStudentEval(){
        return student_eval;
    }
    
    public String getDepartment(){
        return department;
    }

    public String toString(){
        return getName() + " age:" + getAge() + " height:" + 
        getHeight() + "ins. " + "weight: " + getWeight() + "Ibs " + " Teaching Load: " + 
        getTeachingLoad() + "credits " + " Student Eval:" + getStudentEval() +
        " Department:" + getDepartment();
    }

    public String getRating(){
        if(getStudentEval() >= 0 && getStudentEval() <= 1.25){
            return "avoid";
        }
        else if(getStudentEval() >= 1.26 && getStudentEval() <= 2.5){
            return "so-so";
        }
        else if(getStudentEval() >= 2.6 && getStudentEval() <= 3.75){
            return "good";
        }
        else if(getStudentEval() >= 3.76 && getStudentEval() <= 5.0){
            return "hot";
        }else{
            return "Invalid Input"; 
        }
    }
}