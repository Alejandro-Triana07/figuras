public class Carro extends Vehiculo {
    private int numPuertas;

    public Carro(String marca, String modelo, int numPuertas) {
        super(marca, modelo);
        this.setNumPuertas(numPuertas);
    }
    public int getNumPuertas() {
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas) {
        if (numPuertas > 0) {
            this.numPuertas = numPuertas;
        } else {
            this.numPuertas = 4;
        }
    }
    public void mostrarInfo() {
        System.out.println("Marca: " + getMarca() + " | Modelo: " + getModelo() + " | Puertas: " + getNumPuertas());
    }
}

