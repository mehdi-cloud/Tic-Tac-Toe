public class TicTacToe{

	public static boolean CheckTie(char[]p, char[]q, char[]r){
	for (int x = 0; x < 3; x++) {
  	  for (int y = 0; y < 3; y++) {
       	if (p[x] == ' ' || q[x] == ' ' || r[x] == ' ') {
           return false;
        }
    }
	}
	return true;

	}//ends method

	public static void Winner(char[]a, char[]b, char[]c, int i){

		//Checks all possibilities of either player winning
		if(a[0]==a[1] && a[1]==a[2] && a[0]=='X'){
			System.out.println("Player 1 wins!");
			System.exit(1);}
		else if(b[0]==b[1] && b[1]==b[2] && b[1]=='X'){
			System.out.println("Player 1 wins!");
			System.exit(1);}
		else if(c[0]==c[1] && c[1]==c[2] && c[1]=='X'){
			System.out.println("Player 1 wins!");
			System.exit(1);}
		else if (a[0]==b[0] && b[0]==c[0] && a[0]=='X'){
			System.out.println("Player 1 wins!");
			System.exit(1);}
		else if (a[1]==b[1] && b[1]==c[1] && a[1]=='X'){
			System.out.println("Player 1 wins!");
			System.exit(1);}
		else if (a[2]==b[2] && b[2]==c[2] && a[2]=='X'){
			System.out.println("Player 1 wins!");
			System.exit(1);}
		else if (a[0]==b[1] && b[1]==c[2] && a[0]=='X'){
			System.out.println("Player 1 wins!");
			System.exit(1);}
		else if (a[2]==b[1] && b[1]==c[0] && a[2]=='X'){
			System.out.println("Player 1 wins!");
			System.exit(1);}

		else if(a[0]==a[1] && a[1]==a[2] && a[0]=='O'){
			System.out.println(" Player 2 wins!");
			System.exit(1);}
		else if(b[0]==b[1] && b[1]==b[2] && b[1]=='O'){
			System.out.println(" Player 2 wins!");
			System.exit(1);}
		else if(c[0]==c[1] && c[1]==c[2] && c[1]=='O'){
			System.out.println(" Player 2 wins!");
			System.exit(1);}
		else if (a[0]==b[0] && b[0]==c[0] && a[0]=='O'){
			System.out.println(" Player 2 wins!");
			System.exit(1);}
		else if (a[1]==b[1] && b[1]==c[1] && a[1]=='O'){
			System.out.println(" Player 2 wins!");
			System.exit(1);}
		else if (a[2]==b[2] && b[2]==c[2] && a[2]=='O'){
			System.out.println(" Player 2 wins!");
			System.exit(1);}
		else if (a[0]==b[1] && b[1]==c[2] && a[0]=='O'){
			System.out.println(" Player 2 wins!");
			System.exit(1);}
		else if (a[2]==b[1] && b[1]==c[0] && a[2]=='O'){
			System.out.println(" Player 2 wins!");
			System.exit(1);}
		
		
		
	}//closes method Winner

	// method printArray prints every item of the array
	// receives an array as an argument
	public static void printArray (char[] array) {

		for (int i = 0; i < array.length; i++) {
			StdOut.print(array[i] + " | ");
		}
		StdOut.println(); // new line at the end
	}


	public static void main (String[] args){
		int y = 0;
		int x = 0;

		char[]a = {' ', ' ', ' '};
		char[]b = {' ', ' ', ' '};
		char[]c = {' ', ' ', ' '};
		StdOut.println("Hello, Welcome to the World's greatest game of Tic-tac-toe!");
		StdOut.println("  ");
		StdOut.println("When entering x and y treat the bottom left box as (1 1) and the top right as (3 3)");

		//display Board
		StdOut.println("  ");
			printArray(a);
			printArray(b);
			printArray(c);

		for(int i=0; i<5; i++){
			//first players turn
			StdOut.println("  ");
			StdOut.println("Player 1, enter x and y");
			StdOut.println("  ");

			x = StdIn.readInt();
			y = StdIn.readInt();
			
		//Checks for error
		while( y>3 || x>3 || x<1 || y<1){
			StdOut.println("  ");
			StdOut.println("Error: Enter a number between 1 and 3");
			StdOut.println("  ");
			x = StdIn.readInt(); //reread
			y = StdIn.readInt();}

			//This locates input to the point chosen p1
		if(y==3){
			a[x-1]='X';}

		else if(y==2){
			b[x-1]='X';}

		else if (y==1){
			c[x-1] ='X';} 
		
			//display Board
			StdOut.println("  ");
			printArray(a);
			printArray(b);
			printArray(c);
			//check if winner
			Winner(a ,b ,c, i);

			//checks tie
			if(CheckTie(a, b, c)){
				System.out.println("It is a tie!");
				System.exit(1);}
			
			StdOut.println("  ");
			StdOut.println("Player 2, enter x and y");
			StdOut.println("  ");

			x = StdIn.readInt();
			y = StdIn.readInt();

		
		//this checks for error 
		while( y>3 || x>3 || x<1 || y<1){
			StdOut.println("  ");
			StdOut.println("Error: Enter a number between 1 and 3");
			StdOut.println("  ");
			x = StdIn.readInt(); //reread
			y = StdIn.readInt();}

			//This locates input to the point chosen p2
		 if(y==3){
			a[x-1]='O';}

		else if(y==2){
			b[x-1]='O';}

		else if (y==1){
			c[x-1] ='O';} 

			//display Board again after player 2 enters value
			StdOut.println("  ");
			printArray(a);
			printArray(b);
			printArray(c);
		
			//check if winner
			Winner(a, b, c, i);
			

			}//ends for loop	

			
		}
	}

	



