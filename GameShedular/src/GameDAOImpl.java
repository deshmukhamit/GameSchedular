import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class GameDAOImpl implements GameDAO
{

	List objList=new ArrayList();
	public Game findGame(String name) 
	{
		Iterator objIterator=objList.iterator();
		while(objIterator.hasNext())
		{
			Game objGame=(Game) objIterator.next();
			if(objGame.getName().equals(name))
				return objGame;
		}
		return null;
	}

	public boolean saveGame(Game objGame) 
	{
		objList.add(objGame);
		return true;
	}

}
