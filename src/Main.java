public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student("Cristian", "López", 001, 100, 2024);
		Student student2 = new Student("Andrés", "Erazo", 002, 50, 2024);
		//Student student3 = new Student("Lady","Sanabria",003,75,2024);
		Student student3 = new Student("Lady", 003,75,2024);
		
		
		Course course = new Course();
		course.courseName="Programación";
		course.professorName="Juan Carlos Valencia";
		course.year =2024;
		
		   	course.enroll(student1);
	        course.enroll(student2);
	        course.enroll(student3);

	        System.out.println("Total Students: " + course.countStudents());
	        System.out.println("Best Grade: " + course.bestGrade());
	      
	        student1.printFullName();
	        System.out.println("Is approved: " + student1.isApproved());
	        student1.changeYearIfApproved();
	        
	        student2.printFullName();
	        System.out.println("Is approved: " + student2.isApproved());
	        student2.changeYearIfApproved();
	       
	        student3.printFullName();
	        System.out.println("Is approved: " + student3.isApproved());
	        student3.changeYearIfApproved();
	        
//	        System.out.println(student1.toString());
//			System.out.println(student2);
//			System.out.println(student3.toString());
	    
		
	}//main

}//class Main
