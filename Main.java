class Main {

	
    public static void main(String[] args) {


		Professor professor1 = new Professor("Archie", 42, 6, 175, 
		30, 2.8, "Computer Science");
		System.out.println(professor1.toString());
		System.out.println(professor1.getTeachingLoad());
		System.out.println(professor1.getStudentEval());
		System.out.println(professor1.getDepartment());
		System.out.println(professor1.getRating());
  }
}