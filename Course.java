
public class Course 
{
	private int code;
	private Book book;
	
	public Course(int code, Book book)
	{
		this.code = code;
		this.book = book;
	}
	
	public Course(int code)
	{
		this.code = code;
	}
	
	public Course(Book book)
	{
		this.book = book;
	}
}