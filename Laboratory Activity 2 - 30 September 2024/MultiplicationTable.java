import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size of the multiplication table: ");
		int maxnum = scanner.nextInt();
		int [][] multiplicationtable = new int[maxnum + 1][maxnum + 1];
		
		for (int i = 1; i <= maxnum; i++){
	    for (int j = 0; j  <= maxnum; j++){
		        multiplicationtable [i][j] = i*j;
		    }
		}
		System.out.printf("%4s " , "");
		for (int i = 1; i <= maxnum; i++){
		    System.out.printf("%4d" , i);
		}
		System.out.println();
	
	for (int i = 1; i <= maxnum; i++){
	    System.out.printf("%4d" , i);
	    for (int j = 1; j <= maxnum; j++){
		    System.out.printf("%4d" , multiplicationtable[i][j]);
	    
	    }
	    System.out.println();
	}
        scanner.close();
}
}
