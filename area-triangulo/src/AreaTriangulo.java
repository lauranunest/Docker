import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre as medidas do triângulo x:");

        double xA = sc.nextDouble();
        double xB = sc.nextDouble();
        double xC = sc.nextDouble();

        System.out.println("Entre as medidas do triângulo y:");

        double yA = sc.nextDouble();
        double yB = sc.nextDouble();
        double yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Área do triângulo x: %.2f\n", areaX);
        System.out.printf("Área do triângulo y: %.2f\n", areaY);

        if (areaY > areaX) {

            System.out.printf("Triângulo y tem a maior área\n");
        } else {
            System.out.printf("Triângulo x tem a maior área\");
        }

    }
}
