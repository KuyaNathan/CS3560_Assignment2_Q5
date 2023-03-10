import java.util.ArrayList;
import java.util.List;

public class Person 
{
	private String name;
	private List<watch> watchList;
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public void addWatch(watch w)
	{
		if(watchList == null)
		{
			watchList = new ArrayList<watch>();
		}
		watchList.add(w);
	}
	
	public List<watch> getWatchList()
	{
		return this.watchList;
	}
}
