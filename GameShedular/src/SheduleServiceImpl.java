
public class SheduleServiceImpl implements SheduleService
{
	
	PlayerDAO objPlayerDAO=new PlayerDAOImpl();
	DayDAO objDayDAO=new DayDAOImpl();
	public boolean addDay(String name, String[] games) 
	{
		Game [] arrGame=new Game[games.length];
		GameDAO objGameDAO=new GameDAOImpl();
		Day objDay=objDayDAO.findDay(name);
		if(objDay!=null)
			return false;
		else
		{
			objDay=new Day();
			objDay.setName(name);
			for(int iTmp=0;iTmp<games.length;iTmp++)
			{
				Game objGame=objGameDAO.findGame(name);
				if(objGame==null)
				{
					arrGame[iTmp]=new Game(games[iTmp]);
				}
				else
					return false;
			}
			objDay.setArrGame(arrGame);
			boolean flag=objDayDAO.saveDay(objDay);
			if(flag)
				return true;
			else
				return false;
		}
	}

	public boolean addGame(String name)
	{
		GameDAO objGameDAO=new GameDAOImpl();
		Game objGame=objGameDAO.findGame(name);
		if(objGame!=null)
			return false;
		else
		{
			objGame=new Game();
			objGame.setName(name);
			objGameDAO.saveGame(objGame);
			return true;
		}
		
	}

	public boolean addPlayer(String name, String[] games) 
	{
		Game [] arrGame=new Game[games.length];
		GameDAO objGameDAO=new GameDAOImpl();
		Player objPlayer=objPlayerDAO.findPlayer(name);
		if(objPlayer!=null)
			return false;
		else
		{
			objPlayer=new Player();
			objPlayer.setName(name);
			for(int iTmp=0;iTmp<games.length;iTmp++)
			{
				Game objGame=objGameDAO.findGame(name);
				if(objGame==null)
				{
					arrGame[iTmp]=new Game(games[iTmp]);
				}
				else
					return false;
			}
			objPlayer.setArrGame(arrGame);
			boolean flag=objPlayerDAO.savePlayer(objPlayer);
			if(flag)
				return true;
			else
				return false;
		}
		
	}

	public StringBuilder dayWiseReport(String name) 
	{
		
		Player[] arrPlayer=null;
		StringBuilder tmp=new StringBuilder(); 
		Day objDay=objDayDAO.findDay(name);
		//System.out.println(objPlayer.getName());
		if(objDay!=null)
		{
			tmp.append(name);
			Game[]arrGame=objDay.getArrGame();
			for(int iTmp=0;iTmp<arrGame.length;iTmp++)
			{
				tmp.append(" Game="+arrGame[iTmp].getName());
				//System.out.println(arrGame[iTmp].getName());
				arrPlayer=objPlayerDAO.findPlayerbyGame(arrGame[iTmp].getName());
				for(Player obj:arrPlayer)
				{
					tmp.append(" Day="+obj.getName()+"\n");
				}
			}
			
		}
		return tmp;
	}

	public StringBuilder gameWiseReport(String name)
	{
		
		return null;
	}

	public StringBuilder playerWiseReport(String name) 
	{
		Day[] arrDay=null;
		StringBuilder tmp=new StringBuilder(); 
		Player objPlayer=objPlayerDAO.findPlayer(name);
		//System.out.println(objPlayer.getName());
		if(objPlayer!=null)
		{
			tmp.append(name);
			Game[]arrGame=objPlayer.getArrGame();
			for(int iTmp=0;iTmp<arrGame.length;iTmp++)
			{
				tmp.append(" Game="+arrGame[iTmp].getName());
				//System.out.println(arrGame[iTmp].getName());
				arrDay=objDayDAO.findDaybyGame(arrGame[iTmp].getName());
				for(Day obj:arrDay)
				{
					tmp.append(" Day="+obj.getName()+"\n");
				}
			}
			
		}
		return tmp;
	}


}
