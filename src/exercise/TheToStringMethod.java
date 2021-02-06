package exercise;

public class TheToStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(220, "suspect0", "7");
		System.out.println(s1);

	}

}

class Student{
	int id;
	String name;
	String grade;
	Student(int id, String name, String grade){
		this.id = id;
		this.name = name;
		this.grade = grade;
		
	}
	
	public String toString(){
		return "Student info: \nName: " + this.name + "\nId: " + this.id + "\ngrade: " + this.grade; 
		
	}
	
}