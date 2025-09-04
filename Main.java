public class Main {
    public static void main(String[] args) {
        Figura c1 = new Circulo(5);
        Figura t1 = new Triangulo(3, 4, 5);
        Figura q1 = new Cuadrado(6);
        System.out.println("Círculo:");
        c1.mostrarInfo();
        System.out.println("\nTriángulo:");
        t1.mostrarInfo();
        System.out.println("\nCuadrado:");
        q1.mostrarInfo();
    }
}