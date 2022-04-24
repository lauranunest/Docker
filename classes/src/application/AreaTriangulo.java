package application;

import java.util.Scanner;

import entities.Triangle;

public class AreaTriangulo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre as medidas do triângulo x:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Entre as medidas do triângulo y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Área do triângulo x: %.2f\n", areaX);
        System.out.printf("Área do triângulo y: %.2f\n", areaY);

        if (areaY > areaX) {

            System.out.printf("Triângulo y tem a maior área\n");
        } else {
            System.out.printf("Triângulo x tem a maior área\n");
        }
    }

}
