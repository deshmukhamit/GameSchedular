
public class Day
{
	String name;
	Game[] arrGame;
	
	public Day()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Day(String name, Game[] arrGame)
	{
		super();
		this.name = name;
		this.arrGame = arrGame;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Game[] getArrGame() {
		return arrGame;
	}
	public void setArrGame(Game[] arrGame) {
		this.arrGame = arrGame;
	}
	
	
}
