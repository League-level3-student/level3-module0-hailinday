package _01_Simple_Array_Algorithms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.

public static void main(String[] args) {
	String[] names = new String[5];
	
	names[0] = "Jan";
    names[1] = "Sara";
    names[2] = "Fred";
    names[3] = "Marc";
    names[4] = "Randy";
    for(int i = 0; i < names.length; i++){
    	System.out.println(names[i]);
    }
    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
    System.out.println("\n");
    for(int i = names.length-1; i >= 0; i--){
    	System.out.println(names[i]);
    }
    System.out.println("\n");
    for(int i = 0; i < names.length; i++){
    	if (i % 2 == 0) {
    		System.out.println(names[i]);
		}
    }
    System.out.println("\n");
    	ArrayList<String> name = new ArrayList<String>();
    	name.add("Jan");
    	name.add("Sara");
    	name.add("Fred");
    	name.add("Marc");
    	name.add("Randy");
        for (int j = name.size()-1; j >= 0 ; j--) {
        	Random rand = new Random();
        	int random = rand.nextInt(name.size());
			System.out.println(name.get(random));
			name.remove(random);
		}
    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.



    //4. Write a method that takes an array of Strings and prints every other String in the array.


    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.

}
}
