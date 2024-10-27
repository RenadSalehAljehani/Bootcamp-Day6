import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /* Q1. Write a Java program to test if the first and the last element of an array
         of integers are same. The length of the array must be greater than or equal to 2. */

        // Header
        System.out.println("-------------------Q1-------------------");

        // 1. Initialize an array var with elements
        int [] numbers = {50, -20, 0, 30, 40, 60, 10};

        // 2. Initialize a boolean var
        boolean isEqual = true;

        // 3. Print the original array
        System.out.println("The array: " + Arrays.toString(numbers));

        // 4. Check is if the first and the last element of an array are the same
        if (numbers[0] == numbers[numbers.length-1]) System.out.println("First and the last element of an array are the same? " + isEqual); // True if they're equal
        else System.out.println("First and the last element of an array are the same? " + !isEqual); // False if they're not equal

        //----------------------------------------------------------------------
        /* Q2. Write a Java program to find the numbers greater
        than the average of the numbers of a given array. */

        // Header
        System.out.println("-------------------Q2-------------------");

        // 1. Initialize an ArrayList ]
        ArrayList<Integer> nums = new ArrayList<Integer>();

        // 2. Insert elements
        nums.add(1);
        nums.add(4);
        nums.add(17);
        nums.add(7);
        nums.add(25);
        nums.add(3);
        nums.add(100);

        // 2. Print the original array
        System.out.println("The array: " + nums);

        // 3. Initialize total variable and calculate total
        double total = 0.0;
        for (int n : nums) {
            total += n;
        }

        // 4. Calculate the average
        double average = total / nums.size();

        // 5. Find numbers greater than the average
        ArrayList<Integer> greaterNums = new ArrayList<Integer>();
        for (int n : nums) {
            if (n > average) {
                greaterNums.add(n);
            }
        }

        // 6. Print the results
        System.out.printf("The average of the array is: %.1f%n", average);
        System.out.println("The numbers in the array greater than the average are: " + greaterNums);


        //----------------------------------------------------------------------
        /* Q3. Write a Java program to get the larger value between first
        and last element of an array of integers.  */

        // Header
        System.out.println("-------------------Q3-------------------");

        // 1. Initialize an array var with elements
        int [] numbersArr = {20,30,40};

        // 2. Initialize an int var to store the largest value
        int max = 0;

        // 3. Check for the largest value between the first and last element
        if (numbersArr[0] > numbersArr[numbersArr.length-1]) max = numbersArr[0];
        else max = numbersArr[numbersArr.length-1];

        // 4. Print the result
        System.out.println("Original Array: " + Arrays.toString(numbersArr));
        System.out.println("Larger value between first and last element: " + max);

        //----------------------------------------------------------------------
        /* Q4. Write a Java program to swap the first and last elements of
        an array and create a new array. */

        // Header
        System.out.println("-------------------Q4-------------------");

        // 1. Initialize an arraylist var with elements
        ArrayList<Integer> originalArr= new ArrayList<Integer>();

        // 2. Insert elements into the arraylist
        originalArr.add(20);
        originalArr.add(30);
        originalArr.add(40);

        // 3. Print the original array
        System.out.println("Original Array: " + originalArr);

        // 4. Temp vars to store the first and last elements of the array
        int firstElm = originalArr.get(0);
        int lastElm = originalArr.get(originalArr.size()-1);

        // 5. Swap the first and last elements of the array
        originalArr.set(0,lastElm);
        originalArr.set(originalArr.size()-1,firstElm);

        // 6. Create a new array
        ArrayList<Integer> swapArr= new ArrayList<Integer>();

        // 7. Add the elements of the original array to the new array
        for(int n : originalArr){
            swapArr.add(n);
        }

        // 8. Print the new array
        System.out.println( "New array after swapping the first and last elements: " + swapArr);

        //----------------------------------------------------------------------
        /* Q5. Write a program that places the odd elements of an array
        before the even elements. */

        // Header
        System.out.println("-------------------Q5-------------------");

        // 1. Initialize an arraylist var with elements
        ArrayList<Integer> arr = new ArrayList<Integer>();

        // 2. Insert elements into the arraylist
        arr.add(2);
        arr.add(3);
        arr.add(40);
        arr.add(1);
        arr.add(5);
        arr.add(9);
        arr.add(4);
        arr.add(10);
        arr.add(7);

        // 3. Print the original array
        System.out.println("Original array: " + arr);

        // 4. Separate odd and even numbers
        ArrayList<Integer> oddArr = new ArrayList<>();
        ArrayList<Integer> evenArr = new ArrayList<>();

        // 5. Loop through the original array
        for (int n : arr) {
            if (n % 2 != 0) {
                oddArr.add(n);  // Add odd numbers to oddArr
            } else {
                evenArr.add(n); // Add even numbers to evenArr
            }
        }

        // 6. Combine odd and even lists
        oddArr.addAll(evenArr);

        // 7. Print the result
        System.out.println("Array with odd elements before even elements: " + oddArr);

        // Q6. Write a program that test the equality of two arrays.

        // Header
        System.out.println("-------------------Q6-------------------");

        // 1. Create two arrays
        int [] arr1 = {2,3,6,6,4};
        int [] arr2 = {2,3,6,6,4};

        // 2. Boolean var
        boolean areEqual = true;

        // 3. print the two arrays
        System.out.println("First array: " + Arrays.toString(arr1)
                + "\nSecond array: " + Arrays.toString(arr2) );

        // 4. Check if the two arrays have the same length
        if (arr1.length != arr2.length) {
            areEqual = false;
        } else {
            // 5. Check if each element is equal or not
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    areEqual = false;
                    break;
                }
            }
        }

        // 6. Print the result
        System.out.println("Arrays are equal? " + areEqual);
    }
}