
public interface DayDAO
{
	public boolean saveDay(Day objDay);
	public Day findDay(String name);
	public Day[] findDaybyGame(String name);

}
