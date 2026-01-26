package Ui;

import Model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //uso casi el mismo "Main" que el ejemplo de la semana para demostrar el funcionamiento, solo unas pocas modificaciones para mejor revision
        // poner en marcha
        ControladorDeEnvios controlador = new ControladorDeEnvios();

        // Creación de pedidos
        PedidoComida pedidoComida = new PedidoComida(101, "Av. Providencia 123", 5);
        PedidoEncomienda pedidoEncomienda = new PedidoEncomienda(102, "Av. Santa Rosa 567", 7);
        PedidoExpress pedidoExpress = new PedidoExpress(103, "Av. Apoquindo 890", 3);

        // Asignación automática (polimorfismo por sobrescritura)
        System.out.println("------------");
        System.out.println("[Asignación automática (polimorfismo por sobrescritura)]");
        pedidoComida.asignarRepartidor();
        pedidoEncomienda.asignarRepartidor();
        pedidoExpress.asignarRepartidor();

        // Asignación manual (sobrecarga en la clase base)
        System.out.println("------------");
        System.out.println("[Asignación manual (sobrecarga en la clase base)]");
        pedidoEncomienda.asignarRepartidor("Daniela Tapia");

        // Mostrar resumen y tiempos
        System.out.println("------------");
        System.out.println("[Asignación manual (sobrecarga en la clase base)]");
        pedidoComida.mostrarResumen();
        System.out.println("\n[calcularTiempoEntrega()]");
        System.out.println("Tiempo estimado: " + pedidoComida.calcularTiempoEntrega() + " minutos\n");

        pedidoEncomienda.mostrarResumen();
        System.out.println();

        // Despachar pedidos
        System.out.println("------------");
        System.out.println("[Despachar pedidos]");
        pedidoEncomienda.despachar();
        controlador.agregarAlHistorial(pedidoEncomienda);

        // Cancelar un express
        System.out.println("------------");
        System.out.println("[Cancelar un express]");
        System.out.println("Cancelando Pedido Express #103...");
        pedidoExpress.cancelar();

        // Agregar comida al historial como entregado
        controlador.agregarAlHistorial(pedidoComida);

        // Ver historial, puse que en cada pedido aparte de mostrar
        System.out.println("------------");
        controlador.verHistorial();
    }
}