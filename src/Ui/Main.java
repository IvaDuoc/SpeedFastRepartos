package Ui;

import Model.Pedido;
import Model.PedidoComida;
import Model.PedidoEncomienda;
import Model.PedidoExpress;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //utilize la misma estructura para mostrarlo que en el ejemplo que dio en clases
        Pedido comida = new PedidoComida(1, "pasaje 1");
        Pedido encomienda = new PedidoEncomienda(2, "pasaje 2");
        Pedido express = new PedidoExpress(3, "pasaje 3");

        System.out.println("=== Prueba sin nombre (polimorfismo) ===");
        comida.asignarRepartidor();
        System.out.println();
        encomienda.asignarRepartidor();
        System.out.println();
        express.asignarRepartidor();
        System.out.println();

        System.out.println("=== Prueba con nombre (sobrecarga) ===");
        PedidoComida rcomida = new PedidoComida(4, "pasaje 4");
        PedidoEncomienda rencomienda = new PedidoEncomienda(5, "pasaje 5");
        PedidoExpress rexpress = new PedidoExpress(6, "pasaje 6");

        rcomida.asignarRepartidor("Juan");
        System.out.println();
        rencomienda.asignarRepartidor("Julio");
        System.out.println();
        rexpress.asignarRepartidor("Jaime");
    }
}