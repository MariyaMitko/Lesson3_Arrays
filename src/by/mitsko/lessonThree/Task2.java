package by.mitsko.lessonThree;

public class Task2 {

	public static void main(String[] args) {
		int b[] = new int[104];
		for (int i = 0, j = 300; i < 104; i = i + 1, j--) {
			b [i] = j;
			System.out.print(b[i] + " ");
		}
			
            System.out.println();
            for (int i = 2; i < 104; i = i + 3) {
            	System.out.print(b[i] + " ");
            }
	}

}
