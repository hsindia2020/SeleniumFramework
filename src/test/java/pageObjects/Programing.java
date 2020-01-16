package pageObjects;

public class Programing {

	public static void main(String[] args) {

//		Loopcondition();
		arrayloop();
		
		//functionunders();
	}
	
	private static void functionunders() {
		
		int i = 2;
		double j =1.4;
		
		++i;
		j++;
		//j = j+j;
		
		System.out.println("value of I "+i);
		System.out.println("value of J "+j);
		
	}

	private static void Loopcondition() {

		int i = 1;

		for(i=2;i<=5;i++) {
			System.out.println("Printing the value of I "+i);
			if (i==4)
			{
				System.out.println("Entering into if clause");
			}else if (i==5)
			{
				System.out.println("Else statement running");
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Exception runing on "+e);
				e.printStackTrace();
			}
		}
	}

	private static void arrayloop() {
		
		int i[][] = {{2,30},{5,9,8},{82,19,56}};
		
		System.out.println("Array calling "+i[1][0]);
		System.out.println("Multi dimenion array "+i[2][2]);
	}
}
