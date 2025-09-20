package homework.homework4;

public class ArrayHomework {
    public static void main(String[] args) {
        //1
        int[] numbers = {1, 5, 8, 7, 6, 7, 5, 6, 33, 18,};
        int n = 6;
        int count = 0;
        for (int num : numbers) {
            if (num == n) {
                count++;
            }
        }
        System.out.print("number " + count);
        System.out.print("\n");
        //2
        int c = 0;
        for (int i = numbers.length - 1; i > c; i--) {
            System.out.print(numbers[i] + " ");
        }
        //3
        int Copy = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                if (numbers[i] == numbers[j]) {
                    Copy++;
                }
            }
        }
        System.out.println();
        System.out.print("repeating number " + Copy);
        //4
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        char[] vowel = {'ա', 'է', 'ը', 'ի', 'օ', 'ո'};
        int num = 0;
        for (char tar : chars) {
            for (char a : vowel) {
                if (a == tar) {
                    num++;
                }
            }
        }
        System.out.println();
        System.out.println("vowel " + num);
    }
}
