import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class DayDAOImpl implements DayDAO
{
	List objList=new ArrayList();
	public Day findDay(String name) 
	{
		Iterator objIterator=objList.iterator();
		while(objIterator.hasNext())
		{
			Day objDay=(Day) objIterator.next();
			if(objDay.getName().equals(name))
				return objDay;
		}
		return null;
	}

	public Day[] findDaybyGame(String name) 
	{
		int jTmp=0;
		Day[] arrDay=new Day[1];
		Iterator objIterator=objList.iterator();
		while(objIterator.hasNext())
		{
			Day objDay=(Day) objIterator.next();
			//.out.println(objDay);
			Game[] arrGame=objDay.getArrGame();
			//System.out.println(arrGame[0].getName());
			for(int iTmp=0;iTmp<arrGame.length;iTmp++)
			{
				if(arrGame[iTmp].getName().equals(name))
				{
					arrDay[jTmp++]=objDay;
					break;
				}
			}
		}
		return arrDay;
	}

	public boolean saveDay(Day objDay)
	{
		objList.add(objDay);
		return true;
	}

}
