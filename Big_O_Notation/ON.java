package Big_O_Notation;
// O(n)
// This is O(n) because the code is running based on n where n is the number of inputs

public class ON {
    public void log(int[] numbers) {
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
    }
}