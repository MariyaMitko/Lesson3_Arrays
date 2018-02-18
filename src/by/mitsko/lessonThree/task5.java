package by.mitsko.lessonThree;

public class task5 {

	public static void main(String[] args) {
		int b [] = new int [100];
		int max = b [0];
			for (int i = 0, j = 1; i<100; i++, j++) {
			b [i] = (int) (Math.random()*100);
			   if (b[i]> max) {
				  max = b[i];
			   }
			  double d = b[i]/(double)max;
			   System.out.println(d);
			}
	}   
				   
}
			   

	


