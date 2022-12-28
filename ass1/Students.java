package week5.d1.ass1;

public class Students {
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
System.out.println(id);
	}
	public void getStudentInfo(int id ,String name) {
		// TODO Auto-generated method stub
System.out.println(id+ " "+ name);

	}
	public void getStudentInfo(long phoneNumber,String email) {
		// TODO Auto-generated method stub
System.out.println(phoneNumber+" "+ email);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj =new Students();
		obj.getStudentInfo(12345);
		obj.getStudentInfo(7646, "Kishore");
		obj.getStudentInfo(985643210, "kishore@gmail.com");
	}

}