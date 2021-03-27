import java.util.Scanner;
public class Student {
	
	private String IDNum;
	private int Credits;
	private int Points;
	private double grades;
	
	public String getSID()
	{
		return IDNum;
	}
	
	public void setSID(String xID)
	{
		IDNum = xID;
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
		return "Student ID no.: " + IDNum + " No. of Credits " + Credits + " Points of student:" + Points + "GPA: " + grades;
	}
}
