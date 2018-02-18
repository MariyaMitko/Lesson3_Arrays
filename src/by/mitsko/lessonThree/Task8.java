package by.mitsko.lessonThree;

public class Task8 {

	 public static void main(String[] args) {

		  int b[][] = new int[4][4];

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = (int) (Math.random() * 10);
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		int max = 0;
		int l = 0;
		int m = 0;
		int z = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				if (b[i][j] > max) {
					max = b[i][j];
					l = i;
					m = j;
				}
			}
			z++;
			System.out.println(max + " ");
			max = 0;
			l = 0;
			m = 0;
		}
	} 
} 
