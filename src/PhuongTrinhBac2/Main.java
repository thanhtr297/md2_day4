package PhuongTrinhBac2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a(a khac 0): ");
        double a = scanner.nextDouble();
        System.out.println("Input b: ");
        double b = scanner.nextDouble();
        System.out.println("Input c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();

        if (delta > 0) {
            System.out.println("Phuong trinh co 2 nghiem la: " + quadraticEquation.getRoot1() + " va " + quadraticEquation.getRoot2() );
        } else  if (delta == 0) {
            System.out.println("Phuong trinh co 1 nghiem kep: " + quadraticEquation.getRoot());
        } else {
            System.out.println("Phuong trinh vo nghiem!");
        }
    }
}
