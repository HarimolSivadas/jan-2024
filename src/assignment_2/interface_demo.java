package assignment_2;


public class interface_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Test t = new Test();
		t.student_details();
		t.student_feedetails();
		t.student_grade();

			
		}
		
		}
	interface I {//1.created interface and declared three methods
		void student_details();
		void student_feedetails();
		void student_grade();
	           }


	abstract class sub implements I {//created an abstract class and defined two of the methods
		
		public void student_details() {
			
			System.out.println("The name of student is:Harimol Sivadas");
		}
			
			public void student_feedetails() {
				System.out.println("The remaining fees is 1000");
			}
			
			
		}
	
	
	class Test extends sub{//created a sub class of abstract class and defined the remaining methods..
		
		
		
		public void student_grade() {
			
			System.out.println("The student is good in Academics");
		}
	}	
	


