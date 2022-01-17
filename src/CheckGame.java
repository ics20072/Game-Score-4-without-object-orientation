
public class CheckGame {
	//Κλαση για το αν υπαρχει νικητης ή ισοπαλια σε καθε γυρο
	
	
	//Μεθοδος για ελεγχο αν υπαρχει νικητης
	public static boolean ChechForWinner(char Game[][], int rows, int columns,
			char chip_player_1, String player_1,char chip_player_2,String player_2) {
		
		boolean stop = false;
		int i,j;
		
		//Ελεγχος για νικητη με μαρκα x (οριζοντια)
		for(i=0;i<rows;i++)
		{
			for(j=0;j<columns-3;j++)
			{
				if (Game[i][j]=='x' && Game[i][j+1]=='x' && Game[i][j+2]=='x' && Game[i][j+3]=='x')
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
		
		//Ελεγχος για νικητη με μαρκα o (οριζοντια)
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
		
		
		
		//Ελεγχος για νικητη με μαρκα x (Καθετα)
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
		
		//Ελεγχος για νικητη με μαρκα o (Καθετα)
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
		
		
		
		//Ελεγχος για νικητη με μαρκα x (Διαγωνια με ελεγχο απο πανω δεξια προς κατω αριστερα)
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
		
		//Ελεγχος για νικητη με μαρκα o (Διαγωνια με ελεγχο απο πανω δεξια προς κατω αριστερα)
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
		
		
		
		
		//Ελεγχος για νικητη με μαρκα x (Διαγωνια απο πανω αριστερα προς κατω δεξια)
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
		
		//Ελεγχος για νικητη με μαρκα o (Διαγωνια απο πανω αριστερα προς κατω δεξια)
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
	
	//Μεθοδος για ελεγχο γεματου παιχνιδιου (Ισοπαλια)
	public static boolean CheckForDraw (int columns, int full_columns[]) {
		
		int temp = 0,i;
		boolean stop = false;
		
		for(i=0;i<columns;i++)
		{
			if (full_columns[i]>=0) //Αν μια στυλη ειναι γεματη, θα εχει αρνητικη τιμη στον βοηθητικο πινακα full_columns
				temp++;
		}
		if (temp==0) //Ελεγχος αν ολες οι στυλες ειναι γεματες 
		{
			stop = true;
			System.out.println("GAME OVER. WE HAVE A DRAW!!!");
			for(i=0;i<34;i++)
				System.out.print("-");
		}
		return stop;
	}
	
}
