package oop;

public class Main {
	public static void main(String[] args) {
		/*Student newStudent = new Student("FIkri", "Jl. Darmapala");
		System.out.println(newStudent.getName());
		System.out.println(newStudent.getAddress());
		System.out.println(newStudent.toStr());
		newStudent.setAddress("Jl. Demang Lebar Daun");
		System.out.println(newStudent.address);
		newStudent.addCourseGrade("Fisika", 80);
		newStudent.addCourseGrade("Kimia", 90);
		newStudent.addCourseGrade("Bahasa", 85);
		newStudent.addCourseGrade("Kimia", 70);
		newStudent.printGrades();
		System.out.println(newStudent.getAverageGrades());*/
		
		Teacher newTeacher = new Teacher("FIKRI", "JL. Sudirman");
		System.out.println(newTeacher.getName());
		System.out.println(newTeacher.getAddress());
		System.out.println(newTeacher.toStr());
		newTeacher.addCourse("Kimia");
		newTeacher.addCourse("Fisika");
		newTeacher.addCourse("Kalkulus");
		newTeacher.addCourse("Bahasa");
		newTeacher.removeCourse("Kalkulus");
		newTeacher.printCourses();
	}
}
