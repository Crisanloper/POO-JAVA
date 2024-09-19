
import java.util.Scanner;

public class Student {

	  String firstName;
      String lastName;
      int registration;
      int grade;
      int year;

  
      public void printFullName() {
    	    System.out.println(firstName + " " + lastName);
    	}

    	public boolean isApproved() {
    	
    		//int grade;
    		//grade=0;
    		//if (grade>=60) {
    		//System.out.println("TRUE");
    		//}//if	
    		return grade>=60;	
    	}//isApproved

    	public int changeYearIfApproved() {
    	    if (isApproved()) {
    	        year += 1; 
    	        System.out.println("Congratulations");
    	    }
    	    return year; // Regresa el año actual
    	}//isApproved
      
      public Student (String firstName, String lastName, int registration, int grade, int year) {
  		this.firstName=firstName; 
  		this.lastName=lastName; 
  		this.registration=registration; 
  		this.grade=grade;
  		this.year=year;
  		}//constructor
     
  	public Student (String firstName, String lastName, int registration ) {
		this(firstName,lastName,registration,80, 2024);
	}//constructor
	
	public Student (String firstName, String lastName) {
		this(firstName, lastName, 0,0, 0);
	}//constructor

	public Student (String firstName, int registration, int grade, int year) {
		this(firstName, "Sin apellido", registration, grade, year);
	}//constructor
	public String toString() {
		return "firstName=" + this.firstName + ", lastName="+ this.lastName + ", registration=" + this.registration
				+ ", grade="+this.grade+", year=" + this.year;
	}//toString
	
}//class Student
