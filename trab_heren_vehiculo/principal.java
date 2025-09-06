import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        int opcion;
        do {
            System.out.println("MENÚ VEHÍCULOS");
            System.out.println("1. Registrar carro");
            System.out.println("2. Registrar moto");
            System.out.println("3. Mostrar todos los vehículos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la marca del carro: ");
                    String marcaCarro = sc.nextLine();
                    System.out.print("Ingrese el modelo del carro: ");
                    String modeloCarro = sc.nextLine();
                    System.out.print("Ingrese el número de puertas: ");
                    int puertas = sc.nextInt();
                    sc.nextLine();
                    Carro c = new Carro(marcaCarro, modeloCarro, puertas);
                    listaVehiculos.add(c);
                    System.out.println("Carro registrado correctamente.");
                    break;

                case 2:
                    System.out.print("Ingrese la marca de la moto: ");
                    String marcaMoto = sc.nextLine();
                    System.out.print("Ingrese el modelo de la moto: ");
                    String modeloMoto = sc.nextLine();
                    System.out.print("Ingrese el cilindraje: ");
                    int cilindraje = sc.nextInt();
                    sc.nextLine();

                    Moto m = new Moto(marcaMoto, modeloMoto, cilindraje);
                    listaVehiculos.add(m);
                    System.out.println("Moto registrada correctamente.");
                    break;

                case 3:
                    System.out.println("LISTA DE VEHÍCULOS");
                    if (listaVehiculos.isEmpty()) {
                        System.out.println("No hay vehículos registrados.");
                    } else {
                        int i = 1;
                        for (Vehiculo v : listaVehiculos) {
                            System.out.print(i + ". ");
                            v.mostrarInfo();
                            i++;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
        sc.close();
    }
}

