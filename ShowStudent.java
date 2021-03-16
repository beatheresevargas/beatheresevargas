import java.util.Scanner;
public class ShowStudent {

	public static void main(String[] args)
	{
		
		String Student;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your Student ID: ");
		String StudentID = sc.next();
		
		System.out.println("Enter the number of credits: ");
		int Credits = sc.nextInt();
		
		System.out.println("Enter the number of points: ");
		int Points= sc.nextInt();
		
		Student a = new Student(StudentID, Credits, Points);
		System.out.println(a);
	}
	
}
