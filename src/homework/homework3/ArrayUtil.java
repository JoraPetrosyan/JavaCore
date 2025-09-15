package homework.homework3;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        // 1
        System.out.println("All elements");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        // 2
        System.out.println("First element: " + numbers[0]);
        // 3
        System.out.println("Last element: " + numbers[numbers.length - 1]);
        // 4
        System.out.println("Length: " + numbers.length);
        // 5
        int minValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        System.out.println("Minimum: " + minValue);
        // 6
        if (numbers.length <= 2) {
            System.out.println("Can't print middle values.");
        }

        if (numbers.length % 2 == 0) {
            System.out.println("Middle values: " + numbers[numbers.length / 2] + " " + numbers[numbers.length / 2 - 1]);
        }
        if (numbers.length % 2 != 0) {
            System.out.println("Middle value: " + numbers[numbers.length / 2]);
        }
        // 7
        // 8
        int couplesCount = 0;
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                couplesCount++;
            }
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Couples: " + couplesCount);

        System.out.println("Odds: " + oddCount);
        // 9
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum: " + sum);
        // 10
        System.out.println("Average: " + sum / numbers.length);

    }
}
