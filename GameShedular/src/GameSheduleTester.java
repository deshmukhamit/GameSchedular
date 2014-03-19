import java.util.Scanner;


public class GameSheduleTester
{

	public static void main(String[] args) 
	{
		SheduleService objSheduleService=new SheduleServiceImpl();
		Scanner scn=new Scanner(System.in);
	
		String[] arrGame={"Cricket","Football"};
		String[] arrg={"volleyball","TT"};
		boolean flag1=objSheduleService.addPlayer("Amit", arrGame);
		boolean flag2=objSheduleService.addGame("Cricket");
		boolean flag3=objSheduleService.addGame("Football");
		boolean flag6=objSheduleService.addGame("volleyball");
		boolean flag4=objSheduleService.addGame("TT");
		boolean flag5=objSheduleService.addDay("monday", arrGame);
	
		StringBuilder tmp=objSheduleService.playerWiseReport("Akash");
		System.out.println(tmp);
	}

}
