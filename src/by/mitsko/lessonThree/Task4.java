package by.mitsko.lessonThree;

public class Task4 {

	public static void main(String[] args) {
		int n = 465; 		
		int sum = 0; 
		while (n > 0) {
				if (n%10%2 == 0) 
				sum = sum + (n%10);
				n = n/10;
				}
				System.out.println(sum); 
		
		}
		
	}
	
	

