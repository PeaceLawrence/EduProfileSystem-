class Main {

	
    public static void main(String[] args) {

		Student student1 = new Student("Peace", 19, 6, 180, 42, 3.5, "Computer Science");
		System.out.println(student1.toString());
		System.out.println(student1.status());
		System.out.println(student1.getMajor());
		System.out.println(student1.getGPA() + " GPA");
		System.out.println(student1.getEarnedCreds());

		System.out.println();

		Professor professor1 = new Professor("Archie", 42, 6, 175, 
		30, 2.8, "Computer Science");
		System.out.println(professor1.toString());
		System.out.println(professor1.getTeachingLoad());
		System.out.println(professor1.getStudentEval() + " Rating");
		System.out.println(professor1.getDepartment());
		System.out.println(professor1.getRating());
  }
}