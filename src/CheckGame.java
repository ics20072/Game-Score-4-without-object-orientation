
public class CheckGame {

	public static boolean ChechForWinner(char Game[][], int rows, int columns, char chip_player_1, String player_1,char chip_player_2,String player_2) {
		
		boolean stop = false;
		int i,j;
		
		for(i=0;i<rows;i++) {
			for(j=0;j<columns-3;j++) {
				if (Game[i][j]=='x' && Game[i][j+1]=='x' && Game[i][j+2]=='x' && Game[i][j+3]=='x') {
					    stop = true;
					    break;
					}
			}
			if (stop==true) {
				 if (chip_player_1 == 'x') {
				    System.out.println("GAME OVER. THE WINNER IS: " +player_1);
				 }
				 else {
				    System.out.println("GAME OVER. THE WINNER IS: " +player_2);
				 }
				break;
			}
		}
		if (stop==true) {
			return stop;
		}
		
		for(i=0;i<rows;i++)
		{
			for(j=0;j<columns-3;j++)
			{
				if (Game[i][j]=='o' && Game[i][j+1]=='o' && Game[i][j+2]=='o' && Game[i][j+3]=='o')
					{
					    stop = true;
					    break;
					}
			}
			if (stop==true)
			{
				 if (chip_player_2 == 'o')
				    	System.out.println("GAME OVER. THE WINNER IS: " +player_2);
				    else
				    	System.out.println("GAME OVER. THE WINNER IS: " +player_1);
				break;
			}
		}
		if (stop==true)
			return stop;
		
		for(j=0;j<columns;j++)
		{
			for(i=0;i<rows-3;i++)
			{
				if (Game[i][j]=='x' && Game[i+1][j]=='x' && Game[i+2][j]=='x' && Game[i+3][j]=='x')
					{
					    stop = true;
					    break;
					}
			}
			if (stop==true)
			{
				 if (chip_player_1 == 'x')
				    	System.out.println("GAME OVER. THE WINNER IS: " +player_1);
				    else
				    	System.out.println("GAME OVER. THE WINNER IS: " +player_2);
				break;
			}
		}
		if (stop==true)
			return stop;
		
		for(j=0;j<columns;j++)
		{
			for(i=0;i<rows-3;i++)
			{
				if (Game[i][j]=='o' && Game[i+1][j]=='o' && Game[i+2][j]=='o' && Game[i+3][j]=='o')
					{
					    stop = true;
					    break;
					}
			}
			if (stop==true)
			{
				 if (chip_player_2 == 'o')
				    	System.out.println("GAME OVER. THE WINNER IS: " +player_2);
				    else
				    	System.out.println("GAME OVER. THE WINNER IS: " +player_1);
				break;
			}
		}
		if (stop==true)
			return stop;
		
		for(i=0;i<rows-3;i++)
		{
			for(j=3;j<columns;j++)
			{
				if (Game[i][j]=='x' && Game[i+1][j-1]=='x' && Game[i+2][j-2]=='x' && Game[i+3][j-3]=='x')
				{
					stop = true;
					break;
				}
			}
				if (stop==true)
				{
					 if (chip_player_1 == 'x')
					    	System.out.println("GAME OVER. THE WINNER IS: " +player_1);
					    else
					    	System.out.println("GAME OVER. THE WINNER IS: " +player_2);
					break;
				}	
		}
		if (stop==true)
			return stop;
		
		for(i=0;i<rows-3;i++)
		{
			for(j=3;j<columns;j++)
			{
				if (Game[i][j]=='o' && Game[i+1][j-1]=='o' && Game[i+2][j-2]=='o' && Game[i+3][j-3]=='o')
				{
					stop = true;
					break;
				}
			}
				if (stop==true)
				{
					 if (chip_player_2 == 'o')
					    	System.out.println("GAME OVER. THE WINNER IS: " +player_2);
					    else
					    	System.out.println("GAME OVER. THE WINNER IS: " +player_1);
					break;
				}	
		}
		if (stop==true)
			return stop;
		
		for(i=rows-4;i>=0;i--)
		{
			for(j=0;j<columns-3;j++)
			{
				if (Game[i][j]=='x' && Game[i+1][j+1]=='x' && Game[i+2][j+2]=='x' && Game[i+3][j+3]=='x')
					{
					    stop = true;
					    break;
					}
			}
			if (stop==true)
			{
				 if (chip_player_1 == 'x')
				    	System.out.println("GAME OVER. THE WINNER IS: " +player_1);
				    else
				    	System.out.println("GAME OVER. THE WINNER IS: " +player_2);
				break;
			}
		}
		if (stop==true)
			return stop;
		
		for(i=rows-4;i>=0;i--)
		{
			for(j=0;j<columns-3;j++)
			{
				if (Game[i][j]=='o' && Game[i+1][j+1]=='o' && Game[i+2][j+2]=='o' && Game[i+3][j+3]=='o')
					{
					    stop = true;
					    break;
					}
			}
			if (stop==true)
			{
				 if (chip_player_2 == 'o')
				    	System.out.println("GAME OVER. THE WINNER IS: " +player_2);
				    else
				    	System.out.println("GAME OVER. THE WINNER IS: " +player_1);
				break;
			}
		}
		if (stop==true)
			return stop;
		
		return stop;
	}
	
	public static boolean CheckForDraw (int columns, int full_columns[]) {
		
		int temp = 0,i;
		boolean stop = false;
		
		for(i=0;i<columns;i++)
		{
			if (full_columns[i]>=0)
				temp++;
		}
		if (temp==0) 
		{
			stop = true;
			System.out.println("GAME OVER. WE HAVE A DRAW!!!");
			for(i=0;i<34;i++)
				System.out.print("-");
		}
		return stop;
	}
	
}
