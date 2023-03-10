import java.util.ArrayList;
import java.util.List;

public class Movie 
{
	private String name;
	private String genre;
	private List<watch> watchList;
	
	public Movie(String name, String genre)
	{
		this.name = name;
		this.genre = genre;
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
