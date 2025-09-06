public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.setMarca(marca);
        this.setModelo(modelo);
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        } else {
            this.marca = "Desconocida";
        }
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        } else {
            this.modelo = "Genérico";
        }
    }
    public void mostrarInfo() {
        System.out.println("Marca: " + getMarca() + " | Modelo: " + getModelo());
    }
}

