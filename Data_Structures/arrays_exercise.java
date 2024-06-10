package Data_Structures;

import java.util.Arrays;

public class arrays_exercise {
    
    // Set an open array
    static int[] numbers = {}; 

    static void insert(int number){
        // Create a new array with a size larger by 1
        int[] newNumbers = new int[numbers.length + 1];

        // Copy the elements from the old array to the new
        for (int i = 0; i < numbers.length; i++){
            newNumbers[i] = numbers[i];
        }

        // Adds the new number to the end of the new array
        newNumbers[numbers.length] = number;

        //Update the reference point
        numbers = newNumbers;
    }

    static void removeAt(int index) {
        // If the index doesnt exist return
        if (index < 0 || index >= numbers.length){
            System.out.println("Index out of bounds");
            return;
        }
        
        // Create a new array with a size smaller by 1
        int[] newNumbers = new int[numbers.length - 1];

        // Copy elements to the new array, skipping the element at the specified index
        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (i != index) {
                newNumbers[j++] = numbers[i];
            }
        }

        // Update reference point
        numbers = newNumbers;
    }

    public static int indexOf(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1; // Number not found
    }

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        removeAt(1);
        System.out.println(Arrays.toString(numbers));

        int index = indexOf(numbers, 100);
        System.out.println(index);
    }
}
