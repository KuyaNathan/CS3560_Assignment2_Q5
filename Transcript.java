
public class Transcript 
{
	private String course;
	private double grade;
	
	public Transcript(String course, double grade)
	{
		this.course = course;
		this.grade = grade;
	}
	
	public Transcript(String course)
	{
		this.course = course;
	}
	
	public Transcript(double grade)
	{
		this.grade = grade;
	}
}
