

public class PracticeMethods {
	

		// access specifier ,static keyword , return type , method name () {}

			public static void myAdd(int a,int b) {	
				int c = a + b;
				System.out.println("Sum " + c);
			}

			public static void main(String args[]) {
				System.out.println("Application is started...");
				
				myAdd(30,20);
				myAdd(10,50);
				PracticeMethods.myAdd(60,40);	

				System.out.println("Thank....");
			}

		}
	


