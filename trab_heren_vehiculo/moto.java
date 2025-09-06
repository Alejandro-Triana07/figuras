public class Moto extends Vehiculo {
    private int cilindraje;

    public Moto(String marca, String modelo, int cilindraje) {
        super(marca, modelo);
        this.setCilindraje(cilindraje);
    }
    public int getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        if (cilindraje > 50) {
            this.cilindraje = cilindraje;
        } else {
            this.cilindraje = 125;
        }
    }
    public void mostrarInfo() {
        System.out.println("Marca: " + getMarca() + " | Modelo: " + getModelo() + " | Cilindraje: " + getCilindraje() + " cc");
    }
}

