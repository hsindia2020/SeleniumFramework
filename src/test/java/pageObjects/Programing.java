package pageObjects;

import org.testng.annotations.Test;

public class Programing {
	
	@Test(priority=1)
	private static void functionunders() {
		
		System.out.println("Plus functions: ");
		int i = 2;
		double j =1.4;
		
		++i;
		j++;
		//j = j+j;
		
		System.out.println("value of I "+i);
		System.out.println("value of J "+j);
		
	}

	@Test(priority=2)
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

	@Test(priority=3)
	private static void arrayloop() {
		
		int arr[][] = {{2,30},{5,9,8},{82,19,56}};
		int arr1[] = {492,569,435};
//		int value = 0;
		System.out.println("Array calling "+arr[1][0]);
		System.out.println("Multi dimenion array "+arr[2][2]);
		
		for(int i=0; i<arr1.length;i++) {
			System.out.println("Array between For loop "+arr1[i]);
		}
	}
}
