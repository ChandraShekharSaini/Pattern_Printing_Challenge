import java.util.*;

public class Happy_New_Year {
    public static void main(String[] args) {

        DisplayHappYNew();

    }

    public static void DisplayHappYNew() {
        
        System.out.println();

        int n = 5;
        int mid = n / 2;
        // first row
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == 5 || i == mid + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("   ");

            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == 5 || i == 1 || i == mid + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("   ");

            for (int j = 1; j <= 5; j++) {
                if (j == 1 || (j == 5 && i <= mid + 1) || i == 1 || i == mid + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("   ");

            for (int j = 1; j <= 5; j++) {
                if (j == 1 || (j == 5 && i <= mid + 1) || i == 1 || i == mid + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("   ");

            for (int j = 1; j <= 5; j++) {
                if ((i == j && i <= mid + 1) || (i + j == n + 1 && i <= 3) || (j == mid + 1 && i >= mid + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        System.out.println();

        // Secound row
        for (int i = 1; i <= 5; i++) {

            System.out.print("          ");

            for (int j = 1; j <= 5; j++) {
                if (j == 1 || i == j || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("   ");

            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == n || i == mid + 1 || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("   ");

            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == n || (i + j == n + 1 && i >= mid + 1) || i == j && i >= mid + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        System.out.println();

        // Third row
        for (int i = 1; i <= 5; i++) {

            System.out.print("   ");

            for (int j = 1; j <= 5; j++) {
                if (i == j && i <= mid + 1 || i + j == n + 1 & i <= mid + 1 || j == mid + 1 && i > mid) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("   ");

            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == n || i == mid + 1 || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("   ");

            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == mid + 1 || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("   ");

            for (int j = 1; j <= 5; j++) {
                if (j == 1 || i == 1 || i == mid + 1 || j == n && i <= mid + 1 || i == j && i >= mid + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
        System.out.println();

    }

}
