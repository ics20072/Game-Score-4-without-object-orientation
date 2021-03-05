import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		//Δηλωση Μεταβλητων
		String player_1, player_2;
		char chip_player_1, chip_player_2;
		int rows, columns,i;
		
		System.out.println("This is score4");
		
		//Εισαγωγη ονοματων παικτων
		System.out.print("Please enter the name of the 1st player: ");
		player_1 = keyboard.nextLine();
		System.out.print("Please enter the name of the 2nd player: ");
		player_2 = keyboard.nextLine();
		
		//Εισαγωγη μαρκα του παιχτη (ή ο ή χ)
		do {
		System.out.print(player_1 +", please select your chip(o or x): ");
		chip_player_1 = keyboard.next().charAt(0);
		}while(chip_player_1!='x' && chip_player_1!='o');
		if (chip_player_1=='x')
			chip_player_2 = 'o';
		else
			chip_player_2 = 'x';
		System.out.println(player_2+ ", your chip is: " +chip_player_2);
		
		//Εισαγωγή διαστάσεων παιχνιδιού και ελεγχος για εγκυρες τιμες
		do {
			System.out.print("Please, enter the number of rows(4-15): ");
			rows = keyboard.nextInt();
			if (rows<4 || rows>15)
				System.out.print("Incorrect input. ");
		}while(rows<4 || rows>15);
		do {
			System.out.print("Please, enter the number of columns(4-15): ");
			columns = keyboard.nextInt();
			if (columns<4 || columns>15)
				System.out.print("Incorrect input. ");
		}while(columns<4 || columns>15);
		
		
		//Δημιουργια κενου παιχνιδιου
		char [][] Game = new char[rows][columns]; //Δηλωση Πινακα
		
		CreateGame.Game(Game, rows, columns); //Κληση μεθοδου για γεμισμα του πινακα με "-"
		
		//Εμφανιση Παιχνιδιου
		PrintGame.Print_Game(Game, rows, columns); //Εμφανιση αρχικου παιχνιδιου γεματο με "-"
		
		Random ra = new Random();
		
		int ran_number = ra.nextInt(); //Τυχαια Επιλογη παιχτη για να ξεκινησει το παιχνδι
		int next_player = 0, column; //Η μεταβλητη next_player βοηθα στην εναλλαγη του παιχτη
		boolean stop=false; //Μεταβλητη για ελεγχο νικητη ή ισοπαλλιας
		int [] full_columns = new int [columns]; //Δημιουργια πινακα με την αδεια θεση απο καθε στυλη
		
		for (i=0;i<columns;i++)
			full_columns[i] = rows-1; //Ως πρωτη αδεια θεση σε καθε στυλη, η τελευταια γραμμη
		
		
		
		//Ξεκινημα παιχνιδιου με τυχαια επιλογη παιχτη και πρωτη επιλογη στυλης
		if (ran_number%2==0)  
		{
			do {
			System.out.print(player_1+ "(" +chip_player_1+ ") , your turn. Select column: ");
			next_player = 0;
			column = keyboard.nextInt(); //Επιλογη στυλης
			}while(column<1 || column>columns || full_columns[column-1]<0); //Ελεγχος για σωστη επιλογη θεσης
			Game[full_columns[column-1]][column-1] = chip_player_1; //Εισαγωγη Μαρκας
			full_columns[column-1] = full_columns[column-1]-1; //Επομενη αδεια θεση στην στυλη που επιλεχτηκε
		}
		else
		{
			do {
			System.out.print(player_2+ "(" +chip_player_2+ ") , your turn. Select column: ");
			next_player = 1;
			column = keyboard.nextInt(); //Επιλογη στυλης
			}while(column<1 || column>columns || full_columns[column-1]<0); //Ελεγχος για σωστη επιλογη θεσης
			Game[full_columns[column-1]][column-1] = chip_player_2; //Εισαγωγη Μαρκας
			full_columns[column-1] = full_columns[column-1]-1; //Επομενη αδεια θεση στην στυλη που επιλεχτηκε
		}
		//Εμφανιση Παιχνιδιου
		PrintGame.Print_Game(Game, rows, columns);
				
				
		
		//ΣΥΝΕΧΕΙΑ ΠΑΙΧΝΙΔΟΥ
				while (true)
				{
					//Ελεγχος για νικητη
					stop = CheckGame.ChechForWinner(Game, rows, columns, chip_player_1, player_1, chip_player_2, player_2);
					if (stop==true)
						break;
					//Ελεγχος για Ισοπαλια
					stop = CheckGame.CheckForDraw(columns, full_columns);
					if (stop==true)
						break;
					
					//Εισαγωγη Μαρκας με τον ιδιο τροπο οπως στην αρχη
					next_player++;
					if (next_player%2==0)
					{
						do {
						System.out.print(player_1+ "(" +chip_player_1+ ") , your turn. Select column: ");
						column = keyboard.nextInt();
						}while(column<1 || column>columns || full_columns[column-1]<0); //Ελεγχος για σωστη επιλογη θεσης
						Game[full_columns[column-1]][column-1] = chip_player_1;
						full_columns[column-1] = full_columns[column-1]-1;	
					}
					else
					{
						do {
						System.out.print(player_2+ "(" +chip_player_2+ ") , your turn. Select column: ");
						column = keyboard.nextInt();
						}while(column<1 || column>columns || full_columns[column-1]<0); //Ελεγχος για σωστη επιλογη θεσης
						Game[full_columns[column-1]][column-1] = chip_player_2;
						full_columns[column-1] = full_columns[column-1]-1;
					}
					
					//Εμφανιση Παιχνιδιου
					PrintGame.Print_Game(Game, rows, columns);
				}
				keyboard.close();
		}
}
