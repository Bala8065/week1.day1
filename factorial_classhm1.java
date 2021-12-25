package week1.day1;

public class factorial_classhm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int fact=1;
		int n=4;
		
		for (i=1;i<=n;i++)
		{
			fact= fact*i;
		}
		 
		System.out.println("Factorial of " +n + " is :"+fact);

	}

}
