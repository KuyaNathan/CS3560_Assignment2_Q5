import java.util.ArrayList;
import java.util.List;

public class Team 
{
	private int code;
	private List<Player> listPlayers;
	
	public Team()
	{
		this.code = 0;
		listPlayers = new ArrayList<Player>();
	}

	public int getCode() 
	{
		return code;
	}

	public void setCode(int code)
	{
		this.code = code;
	}

	public List<Player> getListPlayers() 
	{
		return listPlayers;
	}

	public void addPlayers(Player player)
	{
		listPlayers.add(player);
	}
	
	
}
