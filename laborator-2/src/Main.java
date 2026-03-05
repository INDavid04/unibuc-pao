import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /// Ce afiseaza?
//        System.out.println(Integer.parseInt("4.5"));
        /// NumberFormatException

        /// Ce afiseaza?
//        System.out.println(Integer.parseInt("4"));

        /// Instructiuni de control
        /// Switch, instructiunea ternara (Elvis) difera de alte limbaje

        ///  Operator ternar
        int a1 = -1;
        int n6 = (a1 > 0) ? a1 : -a1; /// similar cu f1

        /// Enhaced for loop sau for i
        int [] arr1 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        for (int el : arr1) {
            System.out.println(el);
        }

        /// Stream-uri
//        Arrays.stream(arr1).forEach(int e -> System.out.println(e));

        /// Clasa Scanner care stie sa citeasca din consola sau chiar fisiere
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Result: " + n);

        Scanner sc1 = new Scanner(new File("./data.txt"));
    }

    /// Similar cu n6
    private static int f1(int a) {
        if (a > 0) {
            return a;
        } else {
            return -a;
        }
    }
}