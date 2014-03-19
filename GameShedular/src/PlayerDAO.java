
public interface PlayerDAO
{

	public boolean savePlayer(Player objPlayer);
	public Player findPlayer(String name);
	public Player[] findPlayerbyGame(String name);
}
