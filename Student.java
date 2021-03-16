import java.util.Scanner;
public class Student {
	
	private String StudentID;
	private int Credits, Points;
	private double grades;
	
	public String getSID()
	{
		return StudentID;
	}
	
	public void setSID(String xID)
	{
		StudentID = xID;
	}
		
	public int getCreds()
	{
		return Credits;
	}
	
	public void setCreds(int xCredits)
	{
		Credits = xCredits;
	}
	
	public int getNoOfPoints()
	{
		return Points;
	}
	
	public void setNoOfPoints(int xPoints)
	{
		Points = xPoints;
	}
	
	public double getGPA()
	{
		return grades;
	}
	
	public void setGPA(double xGPA)
	{
		grades = xGPA;
	}
	
	public void solveGPA()
	{
		grades = Points/Credits;
	}
	
	@Override
	public String toString()
	{
		return "Student ID no.: " + StudentID + " No. of Credits " + Credits + " Points of student:" + Points + "GPA: " + grades;
	}
}
