package by.mitsko.lessonThree;

public class Task10 { 

	public static void main(String[] args) {
		int b[][] = new int [3][3];
		int count = 0;
				for (int i = 0; i < b.length; i++) {
				for (int j = 0; j<b[i].length; j++){
				b[i][j] = (int)(Math.random()*199);
				System.out.print(b[i][j]+" ");
				      }
				System.out.println();
				}
				for (int i = 0; i < b.length; i++) {
				   for (int j = 0; j < b[i].length; j++) {
				     if (9 < b[i][j] && b[i][j] < 100) {
				      int a = b[i][j]/10;
				      int c = b[i][j]%10;
				      int sum = a + c;
				       if (sum%2 == 0) {
				        count = count +1;
				       }
				     }
				   }
				}
				   System.out.println(count);
				}
	}


