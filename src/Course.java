
import java.util.ArrayList;

public class Course {

String  courseName;
String professorName;
int year;
ArrayList<Student>students=new ArrayList<>();

public void enroll(Student student){
    //TODO add the student to the collection
students.add(student);
}//enroll

public void unEnroll(Student student){
    //TODO remove this student from the collection
    // Hint: check if that really is this student
students.remove(student);
}//unEnroll

public int countStudents(){
    //TODO implement
    return students.size();
}//countStudents

public int bestGrade(){
    //TODO implement
	int best=0;
	for (Student student : students) {
		if (student.grade>best) {
			best=student.grade;
		}//if
	}//foreach
    return best;

}//bestGrade
public void enroll(Student[] studentsArray) {
    for (Student student : studentsArray) {
        enroll(student); // Usaando el método enroll
    }//for
}//sobre cargando enroll

}//class Course
