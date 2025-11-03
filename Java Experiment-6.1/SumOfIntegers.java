import java.util.*;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers separated by spaces:");
        String input = sc.nextLine();
        String[] parts = input.split(" ");

        // Autoboxing and String parsing
        for (String s : parts) {
            try {
                Integer num = Integer.parseInt(s); // String to Integer (autoboxing)
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input ignored: " + s);
            }
        }

        int sum = 0;
        // Unboxing using enhanced for loop
        for (Integer num : numbers) {
            sum += num; // Unboxing happens here automatically
        }

        System.out.println("Sum of integers: " + sum);
        sc.close();
    }
}
