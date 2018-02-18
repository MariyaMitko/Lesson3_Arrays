package by.mitsko.lessonThree;

public class Task9 {

	public static void main(String[] args) {
		int b[][] = new int[5][5];
		int count = 0;
		int x = 4;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = (int) (Math.random() * 5);
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				if (b[i][j] == x) {
					count = count + 1;
				}
			}
		}
		System.out.println(count);
	}

}
