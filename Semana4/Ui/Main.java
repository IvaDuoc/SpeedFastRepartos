package Ui;

import Model.*;

import java.lang.Runnable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // copie todas las instrucciones de la clase para demostrar que sirven como corresponde
        // 1. Crear pedidos, les quite a los que tenian un cuarto elemento porque mis clases no lo piden
        Pedido pedido1 = new PedidoComida(101, "Av. Siempre Viva 123", 2.5);
        Pedido pedido2 = new PedidoExpress(102, "Calle Falsa 456", 5.0);
        Pedido pedido3 = new PedidoEncomienda(201, "Las Flores 789", 10.0);
        Pedido pedido4 = new PedidoComida(202, "Los Olivos 321", 3.0);
        Pedido pedido5 = new PedidoEncomienda(301, "Av. Central 654", 7.5);
        Pedido pedido6 = new PedidoExpress(302, "Pasaje Norte 111", 1.0);

        // 2. Asignar pedidos a repartidores
        List<Pedido> pedidosAna = Arrays.asList(pedido1, pedido3);
        List<Pedido> pedidosLuis = Arrays.asList(pedido2, pedido5);
        List<Pedido> pedidosCamila = Arrays.asList(pedido4, pedido6);

        Repartidor repartidorAna = new Repartidor("Ana", pedidosAna);
        Repartidor repartidorLuis = new Repartidor("Luis", pedidosLuis);
        Repartidor repartidorCamila = new Repartidor("Camila", pedidosCamila);

        // 3. Crear ExecutorService con un pool de 3 hilos
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // 4. Enviar los repartidores (tareas) al ExecutorService
        executor.submit(repartidorAna);
        executor.submit(repartidorLuis);
        executor.submit(repartidorCamila);

        // 5. Indicar que no se enviarán más tareas
        executor.shutdown();

        try {
            // 6. Esperar a que todos los repartidores terminen (máx 1 minuto)
            if (!executor.awaitTermination(1, TimeUnit.MINUTES)) {
                System.out.println("Tiempo de espera agotado. Se forzará la finalización.");
                executor.shutdownNow();
            } else {
                System.out.println("Todas las entregas han sido completadas.");
            }
        } catch (InterruptedException e) {
            System.out.println("El hilo principal fue interrumpido mientras esperaba.");
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}