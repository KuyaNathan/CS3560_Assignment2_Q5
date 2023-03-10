import java.util.ArrayList;
import java.util.List;

public class Dog 
{
	private String breed;
	private String name;
	private List<Paw> listPaws;
	private final int max_paws = 4;
	
	public Dog()
	{
		this.breed = "";
		this.name = "";
		listPaws = new ArrayList<Paw>();
	}

	public void addPaws(Paw paw) 
	{
		listPaws.add(paw);
	}
	
	public String getBreed() 
	{
		return breed;
	}

	public void setBreed(String breed) 
	{
		this.breed = breed;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public List<Paw> getListPaws() 
	{
		return listPaws;
	}
	
}
