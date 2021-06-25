package oop;

public class Teacher extends Person {
	private int numCourses = 0;
	private String[] courses;
	
	public Teacher(String name, String address) {
		super(name, address);
	}

	String getName() {
		return super.name;
	}
	
	String getAddress() {
		return super.address;
	}
	
	String toStr() {
		return "Teacher: "+super.name+"("+super.address+")";
	}
	
	boolean addCourse(String course) {
		if(this.numCourses > 0) { //if data courses is not empty
			for(int i = 0; i < this.numCourses; i++) {
				if (this.courses[i] == course) { //check input course, if exist return false
					return false;
				}
			}
			
			//if course is not exist in data courses
			String[] tempCourses = new String[this.numCourses]; //create new array to temporally save data course, before adding the new course
			for(int i = 0; i < this.numCourses; i++) {
				tempCourses[i] = this.courses[i]; //fill the new array with exact same value and index of data courses 
			}
			this.numCourses += 1; //because we want to add course into data courses, num courses value also increase
			this.courses = new String[this.numCourses]; //create the new maximum index of data courses array
			for(int i = 0; i < this.numCourses - 1; i++) {
				this.courses[i] = tempCourses[i]; //refilled the array of data courses with exact same value and index of data in new array, and leave the last index
			}
			this.courses[this.numCourses - 1] = course; //fill the last array index of data courses with input course
			return true;
		} else { //if data courses is empty, doesn't need to check, and just fill the input course to the array of data courses
			this.numCourses += 1;
			this.courses = new String[numCourses];
			this.courses[this.numCourses - 1] = course;
			return true;
		}
	}
	
	boolean removeCourse(String course) {
		if(this.numCourses > 0) { //if data courses is not empty
			boolean found = false; //create new variables with boolean data type
			for(int i = 0; i < this.numCourses; i++) {
				if (this.courses[i] == course) { //check if input course is in the data courses
					found = true;
					break;
				}
			}
			if(found == true) { //if input course is in the data courses
				if(this.numCourses-1 == 0) { //if data courses array only have one data
					this.numCourses -= 1; //decrease the num courses value
					this.courses = new String[this.numCourses]; //create the new maximum index of data courses array
					return true;
				} else { //if data courses array have more than one data
					String[] tempCourses = new String[this.numCourses-1];//create new array with maximum index that has been decreased
					for(int i = 0,j = 0; i < this.numCourses; i++) {
						if (this.courses[i] == course) { //if value in array data courses with index [i] is match with input course
							continue; //continue to the next index
						}
						//if value in array data courses with index [i] isn't match with input course
						tempCourses[j++] = this.courses[i]; //fill the data courses value to the new array
					}
					this.numCourses -= 1; //decrease the num courses value 
					this.courses = new String[this.numCourses];//create the new maximum index of data courses array
					for(int i = 0; i < this.numCourses; i++) {
						this.courses[i] = tempCourses[i]; //refilled the array of data courses with values in new array
					}
					return true;
				}
			} else { //if input course isn't in the data courses, return false
				return false;
			}
		} else { //if data courses is empty, return false
			return false;
		}
	}
	
	void printCourses() {
		if(this.numCourses == 0) {
			System.out.println("Course is empty");
		} else {
			for(int i=0; i < this.numCourses; i++) {
				System.out.println(this.courses[i]);
			}
		}
	}
}
