
public class CreateGame {
	//Κλαση για την δημιουργια του παιχνιδιου
	
	public static void Game(char Game[][], int rows, int columns) {
		int i,j;
		
		for (i=0;i<rows;i++)
		{
			for(j=0;j<columns;j++)
			{
				Game[i][j] = '-'; //Γεμισμα με παυλες
			}
		}
	}
	
}
