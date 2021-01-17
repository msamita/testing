package constractor;

public class Student {
	
	 
String studentName;
	int rollno;
	public Student(String studentName,int rollno) {
		this.studentName =studentName;
		this.rollno = rollno;
	}
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.printf("Amita:, null");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student("AMITA",20);
		System.out.println(st.studentName);
		System.out.println(st.rollno);
		//Student s=new Student();
		

	}

}
