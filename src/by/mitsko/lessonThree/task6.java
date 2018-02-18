package by.mitsko.lessonThree;

public class task6 {

	public static void main(String[] args) { 
		int b [][] = new int [4][4];
		int temp;
		int x = 3;
		int y = 2;
		for (int i=0; i<b.length; i++) {
		  for (int j=0; j<b[i].length; j++) {
		   b [i][j] = (int)(Math.random()*10);
		   System.out.print(b[i][j] + " ");
		}
		System.out.println();
		}
		System.out.println();
		
		  for (int i=0; i < b.length; i++) {
			  for (int j=0; j < b[i].length; j++) {
			     temp = b[y][j];
			     b[y][j] = b[x][j];
			     b[x][j] = temp;
			     System.out.print(b[i][j] + " ");
			     }
			   System.out.println(); }
			     }
		  

}
