package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String[] food = new String[5];
        
     
        // 2. print the third element in the array

        // 3. set the third element to a different value
    	for(int i = 0; i < food.length; i++){
    		 String food1 = JOptionPane.showInputDialog("Pick a food for this element");
    	     food[i] = food1;
    	     System.out.println("This is a food item " + food[i]);
    	}
       
        // 4. print the third element again

        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice

        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE

        // 7. make an array of 50 integers
    	int[] ints = new int[50];
    	int min = ints[0];
    	int max = ints[0];
    	for(int i = 0; i < ints.length; i++){
    		Random rand = new Random();
    		ints[i] = rand.nextInt(50);
   	     	System.out.println("Integer " + ints[i]);
   	     	if (ints[i]<min) {
				min = ints[i];
			}
   	     if (ints[i]>max) {
				max = ints[i];
			}


    	}
    	System.out.println("Smallest integer: " + min);
    	System.out.println("Largest integer: " + max);
    	System.out.println("Last integer: " + ints[49]);
        // 8. use a for loop to make every value of the integer array a random
        //    number

        // 9. without printing the entire array, print only the smallest number
        //    on the array

        // 10 print the entire array to see if step 8 was correct

        // 11. print the largest number in the array.

        // 12. print only the last element in the array

    }
}
