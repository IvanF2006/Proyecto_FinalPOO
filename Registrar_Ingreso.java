package Finanzas_Personales;

import java.util.Scanner;

class theTransaction {
    double monto;
    String fecha;
    String descripcion;

    public Transaction(double monto, String fecha, String descripcion) {
       this.monto = monto;
       this.fecha = fecha;
       this.descripcion = descripcion;
    }
}
class Income extends Transaction {
    public Income(double monto, String fecha, String descripcion) {
        super(monto, fecha, descripcion);
    }
}
public class Registrar_Ingreso {
    Scanner scanner = new Scanner(System.in);
    public void ejecutarRegistro(){
        System.out.println("-----Registrar nuevo ingreso-----");
        System.out.println("Monto a ingresar");
        double monto = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingrese la fecha");
        String fecha = scanner.nextLine();

        System.out.println("Ingrese descripción");
        String descripcion = scanner.nextLine();

        Income nuevoIngreso = new Income(monto,fecha,descripcion);

        System.out.println("Ingreso aplicado exitosamente");
        System.out.println("Monto: $" + monto + " | Fecha: " + fecha + "Detalle: " + descripcion);

    }
}