import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de Figuras");
            System.out.println("1. Calcular área de un Triángulo");
            System.out.println("2. Calcular área de un Círculo");
            System.out.print("Elija una de las 2 opciones: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = sc.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = sc.nextDouble();
                    Figura t = new Triangulo(base, altura);
                    System.out.println("Área del Triángulo: " + t.calcularArea());
                    break;

                case 2:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = sc.nextDouble();
                    Figura c = new Circulo(radio);
                    System.out.println("Área del Círculo: " + c.calcularArea());
                    break;

                default:
                    System.out.println("Opción no válida, Intente otra vez");
            }

        } while (opcion != 2);

        sc.close();
    }
}
