package week6Day3;

public class Students {

	
		public void getStudentInfo(int id) {
			System.out.println("ID:"+id);

		}
		public void getStudentInfo(int id, String name) {
			System.out.println("ID:"+id+" NAME:"+name);
			

		}
		public void getStudentInfo(String email,long phonenumber ) {
			
	           System.out.println("EMAIL:"+email+"  PHONE NUMBER:"+phonenumber);
		}
		
		public static void main(String[] args) {
			
			Students obj=new Students();
			obj.getStudentInfo(1);
			obj.getStudentInfo(221, "SURIYAKALA");
			obj.getStudentInfo("suriya@gmail.com",987654322l);
			

	}

}
