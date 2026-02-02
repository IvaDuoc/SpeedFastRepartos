package Model;
import java.util.List;

public class Repartidor implements Runnable {
    private String nombre;
    private List<Pedido> pedidos;

    public Repartidor(String nombre, List<Pedido> pedidos) {
        this.nombre = nombre;
        this.pedidos = pedidos;
    }
    public void getPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    public void getNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void run() {
        for (Pedido pedido : pedidos) {
            try {
                // le copie las salidas a terminal de la clase pero las cambie para que se pareciera mas al ejemplo de la tarea
                System.out.println("Repartidor " + this.nombre + " entregando " + pedido.getTipoPedido() + " " + pedido.getIdPedido() + " | Tiempo estimado: " + pedido.calcularTiempoEntrega() + " min.");
                long pausa = (long) (Math.random() * 5000); // 0 a 5000 ms, lo mismo que en la clase
                Thread.sleep(pausa);
                System.out.println("Repartidor " + this.nombre + " " + pedido.getTipoPedido() + " " + pedido.getIdPedido() + " entregado.");
            } catch (InterruptedException e) {
                System.out.println("Repartidor " + this.nombre + " fue interrumpido durante la entrega de " + pedido.getTipoPedido() + " " + pedido.getIdPedido());
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
