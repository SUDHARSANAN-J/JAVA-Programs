import java.util.Scanner;

class Greatest_number_of_3
{
	public static void main(String args[])
	{
		int A , B, C;
		
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		System.out.println("Enter the first number :"+A);
		B = sc.nextInt();
		System.out.println("Enter the second number :"+B);
		C = sc.nextInt();
		System.out.println("Enter the third number :"+C);
		if (A > B)
		{
			if (A > C)
			{
				System.out.println("A is the greatest number");
			}
			else
			{
				System.out.println("C is the greatest number");
			}
		}	
		else
		{
			if (B > C)
			{
				System.out.println("B is the greatest number");
			}
			else
			{
				System.out.println("C is the greatest number");
			}
		}
	}
}