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
        Pedido comida = new PedidoComida(1, "pasaje 1", 1.0);
        Pedido encomienda = new PedidoEncomienda(2, "pasaje 2", 3.0);
        Pedido express = new PedidoExpress(3, "pasaje 3", 6.0);
        //no tienen el calcularTiempoEntrega() porque el resumen lo muestra
        System.out.println("---------");
        System.out.println("[Pedido comida]");
        comida.mostrarResumen();
        System.out.println("---------");
        System.out.println("[Pedido encomienda]");
        encomienda.mostrarResumen();
        System.out.println("---------");
        System.out.println("[Pedido express]");
        express.mostrarResumen();
        System.out.println("---------");
    }
}