
public class PrintGame {
	
	public static void Print_Game(char Game[][], int rows, int columns) {
		int i,j;
		
		for(i=0;i<rows;i++)
		{
			System.out.print("|  ");
			for(j=0;j<columns;j++)
			{
				System.out.print(Game[i][j]+ "  ");
			}
			System.out.print("|");
			System.out.print("\n");
		}
		
		for(i=0;i<columns*3+4;i++)
			System.out.print("-");
		System.out.print("\n");
		System.out.print("   ");
		for(i=0;i<columns;i++)
			if(i<9) 
			    System.out.print((i+1)+ "  ");
			else
				System.out.print((i+1)+ " ");
		System.out.print("\n\n");
	}
	
}
