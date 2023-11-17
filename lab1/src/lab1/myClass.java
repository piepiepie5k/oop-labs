package lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;


public class myClass {

	public static void main(String[] args) {

		Games games[] = new Games[13];
		
		games[0]=new Games("Dota 2", 0.0, 2013);
		games[1]=new Games("Counter Strike 2", 0.0, 2023);
		games[2]=new Games("Half-Life 2", 9.99, 2004);
		games[3]=new Games("Half-Life", 4.99, 1998);
		games[4]=new Games("Hunt: Showdown", "Crytek", 39.99, 2019);
		games[5]=new Games("God of War", "Santa Monica", 49.99, 2020);
		games[6]=new Games("Resident Evil 4", "CAPCOM", 49.99, 2023);
		games[7]=new Games("Titanfall 2", "Respawn", 29.99, 2016);
		games[8]=new Games("Grand Theft Auto V", "Rockstar",39.99 ,2013);
		games[9]=new Games("Punch Club 2", "Lazy Bear Games", 9.99, 2023);
		games[10]=new Games("Russian Fishing 4", "FishSoft LLC", 0.0, 2021);
		games[11]=new Games("Loop Hero", "Four Quarters", 5.99, 2021);
		games[12]=new Games("Yakuza: Like a Dragon", "rgg studio", 59.99, 2020);

		//for(Games game: games) {
		//	game.print();
		//}
		
		for(int i=0; i<games.length; i++) {
			int j_max=i;
			for (int j=i+1;j<games.length; j++) {
				if(games[j_max].price<games[j].price) {
					j_max=j;
				}
			}
			Games temp = games[i];
			games[i]=games[j_max];
			games[j_max]=temp;
		}
		try {
			PrintStream out = new PrintStream(new File("price.txt"));
			for (Games game : games) {
				game.filesave(out);
			}
			
		}
		catch(FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		
		//for(Games game: games) {
		//	game.print();
		//}
		for(int i=0; i<games.length; i++) {
			int j_max=i;
			for (int j=i+1;j<games.length; j++) {
				if(games[j_max].age>games[j].age) {
					j_max=j;
				}
			}
			Games temp = games[i];
			games[i]=games[j_max];
			games[j_max]=temp;
		}
		try {
			PrintStream out = new PrintStream(new File("age.txt"));
			for (Games game : games) {
				game.filesave(out);
			}
			
		}
		catch(FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		//for(Games game: games) {
		//	game.print();
		//}
		
	}

}






