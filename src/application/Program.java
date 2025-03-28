package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rectangle width and height: ");

        Rectangle R = new Rectangle();
        R.Width = sc.nextDouble();
        R.Height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", R.area());
        System.out.printf("PERIMETER = %.2f%n", R.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", R.diagonal());
        sc.close();
    }
}
