package oop;

public class Student extends Person {
	private int numCourses = 0;
	private String[] courses;
	private int[] grades;
	
	public Student(String name, String address) {
		super(name, address);
	}

	String getName() {
		return super.name;
	}
	
	String getAddress() {
		return super.address;
	}
	
	String toStr() {
		return "Student: "+super.name+"("+super.address+")";
	}
	
	void addCourseGrade(String course, int grade) {
		if(this.numCourses > 0) { //if data courses is not empty
			boolean found = false;
			int index = 0;
			for(int i = 0; i < this.numCourses; i++) {
				if (this.courses[i] == course) { //check if input course is in the data courses, and get the index
					found = true;
					index = i;
					break;
				}
			}
			if(found == true) { //if input course is in the data courses 
				this.grades[index] = grade; //update the data grades with input grade
			} else { //if input course is not in the data courses
				//create new array to temporally save data course and data grades, before adding the new course and new grade
				String[] tempCourses = new String[this.numCourses];
				int[] tempGrades = new int[this.numCourses];
				
				//fill the new array with exact same value and index of data courses and data grades
				for(int i = 0; i < this.numCourses; i++) {
					tempCourses[i] = this.courses[i];
					tempGrades[i] = this.grades[i];
				}
				
				this.numCourses += 1; // increase the num course value
				
				//create the new maximum index of data courses and data grades array
				this.courses = new String[this.numCourses];
				this.grades = new int[this.numCourses];
				
				//refilled the array of data courses and data grades with exact same value and index of data in new array, and leave the last index
				for(int i = 0; i < this.numCourses - 1; i++) {
					this.courses[i] = tempCourses[i];
					this.grades[i] = tempGrades[i];
				}
				
				//fill the last array index of data courses and data graddes with input course and input grade
				this.courses[this.numCourses - 1] = course;
				this.grades[this.numCourses - 1] = grade;
			}
		} else {  //if data courses is empty, doesn't need to check, and just fill the input course and input grade to the array of data courses and data grades
			this.numCourses += 1;
			
			this.courses = new String[numCourses];
			this.grades = new int[numCourses];
			
			this.courses[this.numCourses - 1] = course;
			this.grades[this.numCourses - 1] = grade;
		}
	}
	
	void printGrades() {
		if(this.numCourses == 0) {
			System.out.println("Course is empty");
		} else {
			for(int i=0; i < this.numCourses; i++) {
				System.out.println(this.grades[i]);
			}
		}
	}
	
	double getAverageGrades() {
		if(this.numCourses == 0) {
			System.out.println("Course is empty");
			return 0.0;
		} else {
			int num = 0;
			for(int i=0; i < this.numCourses; i++) {
				num += this.grades[i];
			}
			return num/numCourses;
		}
	}
}
