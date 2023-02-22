package week5.day3;

public class Students {
 public void getStudentInfo(int id) {
	 System.out.println("THE Student Id is : "+id);
	 }
 public void getStudentInfo(int id,String name) {
	 System.out.println("ID IS : "+id +"                                                                                           " + " THE Student  Name is : "+name);
    }
 public void getStudentInfo(String email,long phonenumber) {
	 System.out.println("THE Student email is  : "+email + "                                               "+
			 "The Student phone number is : "+phonenumber);
	 
	 }
 public static void main(String[] args) {
	 Students details=new Students();
	 details.getStudentInfo(1407);
	 details.getStudentInfo(1407, "DHANALAKSHMI");
	 details.getStudentInfo("dhanalaksmimurugan2000@gmail.com",9845083472L);
	 
	
}
 
 
}
