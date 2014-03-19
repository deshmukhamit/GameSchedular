
public class Player
{
	String name;
	Game[] arrGame;
	
	public Player()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Player(String name, Game[] arrGame)
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
