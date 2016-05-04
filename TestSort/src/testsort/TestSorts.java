/*
 * TestSorts.java from Chapter 13
 * An application for testing sort algorithms.
 *
 */

 /**
  * Sort algorithms are tested.
  */
 package testsort;
 import java.util.Scanner;
 import java.util.Random;

 public class TestSorts {

 	public static void displayArray(int[] array) {
 		for (int i = 0; i < array.length; i++) {
 			System.out.print(array[i] + "  ");
 		}
 		System.out.println("\n");
 	}

 	public static void sortIntArray() {
		Scanner input = new Scanner(System.in);
		int numItems, searchNum, location;
		int[] test;
		Random rand = new Random();

		System.out.print("Enter number of elements: ");
		numItems = input.nextInt();

		/* populate array */
		test = new int[numItems];
		for (int i = 0; i < test.length; i++) {
			test[i] = rand.nextInt(100);
		}
		System.out.println("Unsorted:");
		displayArray(test);

		//Sorts.selectionSort(test);
		Sorts.insertionSort(test);
		//Sorts.mergesort(test, 0, test.length - 1);

		System.out.println("Sorted:");
		displayArray(test);

		/* search for number in sorted array */
		System.out.print("Enter a number to search for: ");
		searchNum = input.nextInt();
		while (searchNum != -1){
			location = Searches.binarySearch(test, 0, test.length-1, searchNum);
			System.out.println("Number at position: " + location);
			System.out.print("Enter a number to search for: ");
			searchNum = input.nextInt();
		}
  	}


 	public static void displayArray(Circle[] array) {
 		for (int i = 0; i < array.length; i++) {
 			System.out.println(array[i] + "  ");
 		}
 		System.out.println("\n");
 	}


 	public static void sortObjectArray() {
 		Scanner input = new Scanner(System.in);
		int numObjects;
		Circle[] test;
		Random rand = new Random();

		System.out.print("Enter number of objects: ");
		numObjects = input.nextInt();
		input.close();

		/* populate array */
		test = new Circle[numObjects];
		for (int i = 0; i < test.length; i++) {
			test[i] = new Circle(rand.nextInt(10));
		}
		System.out.println("Unsorted:");
		displayArray(test);

		Sorts.selectionSort(test);

		System.out.println("Sorted:");
		displayArray(test);
 	}


	public static void main(String[] args) {
		sortIntArray();
	}
}