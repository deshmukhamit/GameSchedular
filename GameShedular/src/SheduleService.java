
public interface SheduleService
{
	public boolean addPlayer(String name,String[] games);
	public boolean addGame(String name);
	public boolean addDay(String name,String[] games);
	public StringBuilder playerWiseReport(String name);
	public StringBuilder gameWiseReport(String name);
	public StringBuilder dayWiseReport(String name);
}
