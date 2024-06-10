package Data_Structures;
import java.util.Arrays;

// Arrays are ways to create collection of data but cannot be modified without creating a new array and are referred to as O(n). See linked-list for more.
public class arrays {
    public static void main (String[] args) {
        // int[] numbers = new int[3];
        // numbers[0] = 10;
        // numbers[1] = 20;
        // numbers[2] = 30;
        // Or...
        int[] numbers = {10, 20, 30};
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers)); // use Arrays to convert the address in memory to the stored value
    }
}
