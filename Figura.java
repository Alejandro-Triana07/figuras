abstract class Figura {
    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public void mostrarInfo() {
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}