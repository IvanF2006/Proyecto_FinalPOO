package Finanzas_Personales;

import java.util.Scanner;

class Transaction {
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

public class Registro_Gastos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}