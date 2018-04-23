package helloWorld;
import java.util.ArrayList;
import java.util.Collections;

/*This program will generate 500 random numbers, and put them in a arraylist and search
 * the smallest number from the list
 * 
 */


public class Question3 {
	
		
	static ArrayList<Integer> array = new ArrayList<Integer>(); //initializing arraylist
	

	public static void main(String[] args) {
		
		for (int i =0; i < 500 ; i++) {
			
			
			int number = ((int)(Math.random()*100) + 1); //print 500 random numbers in betn 1 and 100
			//System.out.println(number);
			
			array.add(number);
			
					
		}
		
		System.out.println("Values in Arraylist "+array);
		
		Collections.sort(array);  //will sort the array in ascending order
		//System.out.println(array);
		 		
		Integer minNumber = findMinNum(array);// calling function
		System.out.println("Smallest Number = "+ minNumber);
		
		
	}	// main	close
	
	
	//This function will calculate and return the min value from arrylist
	
		private static Integer findMinNum(ArrayList<Integer> array) {
			Integer min = Integer.MAX_VALUE;
			for (Integer number : array) {
				if(number< min) {
					min = number;
				}
			}
			return min;
		
		}
		

	

}//class close


