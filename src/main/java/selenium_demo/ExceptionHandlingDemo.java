package selenium_demo;

public class ExceptionHandlingDemo {
	
	public static void main(String[] args) {
		
		try {
			exceptionhand();
		} catch (Exception e) {
			System.out.println("I am inside Catch Block");
			System.out.println("This is the Message :"+e.getMessage());
			System.out.println("Cause of exception is "+e.getCause());
			e.printStackTrace();
		}
		finally { System.out.println("Inside finally block");}
}
	
	public static void exceptionhand() throws Exception{
			
			System.out.println("Hello Universe !!!");
			int i = 1/0;
			System.out.println("Completed or Done !!");			
				
		}
	}
