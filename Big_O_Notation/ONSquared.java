package Big_O_Notation;
// O(n^2)



public class ONSquared {
    public void log(int numbers[]) {
        for (int first : numbers) // O(n)
            for (int second : numbers)
            System.out.println(first + ", " + second);
    }
}