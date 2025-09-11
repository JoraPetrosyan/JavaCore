package homework.homework2;

public class FigurePainter {
    public static void main(String[] args) {
        int a = 6;
        int b = -6;
        int x = 5;

        for (int i = 1; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i = 1; i < a; i++) {
            for (int j = b; j < -i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int j = -1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");

        for (int i = 1; i < a; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = b; j < -i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = -1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = b; j < -i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}