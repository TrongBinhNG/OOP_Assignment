
public class StudentInformation {
	String name;
	String hometown;
	String dob;
	String gender;
	long StudentID;
	String email;
	String PhoneNumber;

public class DisplayInformation {
	public static void main(String args[]) {
		StudentInformation obj = new StudentInformation();
		obj.name = "Nguyen Trong Binh";
		obj.hometown = "Ha Noi";
		obj.gender = "male";
		obj.dob = "10-11-2001";
		obj.StudentID = 20194489;
		obj.email = "binh.nt194489@sis.hust.edu.vn";
		obj.PhoneNumber = "0123456789";
		System.out.println(obj.name);
		System.out.println(obj.hometown);
		System.out.println(obj.gender);
		System.out.println(obj.dob);
		System.out.println(obj.StudentID);
		System.out.println(obj.PhoneNumber);
		System.out.println(obj.email);
		
	}
	}
}
	

