import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class PlayerDAOImpl implements PlayerDAO
{
	List objList=new ArrayList();
	public Player findPlayer(String name) 
	{
		Iterator objIterator=objList.iterator();
		while(objIterator.hasNext())
		{
			Player objPlayer=(Player) objIterator.next();
			if(objPlayer.getName().equals(name))
				return objPlayer;
		}
		return null;
	}

	public Player[] findPlayerbyGame(String name)
	{
		int jTmp=0;
		Player[] arrPlayer=new Player[1];
		Iterator objIterator=objList.iterator();
		while(objIterator.hasNext())
		{
			Player objPlayer=(Player) objIterator.next();
			//.out.println(objDay);
			Game[] arrGame=objPlayer.getArrGame();
			//System.out.println(arrGame[0].getName());
			for(int iTmp=0;iTmp<arrGame.length;iTmp++)
			{
				if(arrGame[iTmp].getName().equals(name))
				{
					arrPlayer[jTmp++]=objPlayer;
					break;
				}
			}
		}
		return arrPlayer;
	}

	public boolean savePlayer(Player objPlayer) 
	{
		objList.add(objPlayer);
		return true;
	}

}
