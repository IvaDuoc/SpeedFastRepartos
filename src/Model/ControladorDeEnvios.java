package Model;
import java.util.ArrayList;
import java.util.List;

public class ControladorDeEnvios implements Rasteable{
    private List<Pedido> historial;

    public ControladorDeEnvios() {
        historial = new ArrayList<>();
    }
    public void agregarAlHistorial(Pedido pedido) {
        historial.add(pedido);
    }
    public void borrarAlHistorial(Pedido pedido) {
        System.out.println("Cancelando " + pedido.getTipoPedido() + " #" + pedido.getIdPedido() + "...");
        pedido.cancelar();
        historial.remove(pedido);
    }
    @Override
    public void verHistorial() {
        System.out.println("[Historial]");
        for (Pedido pedido : historial) {
            pedido.mostrarResumen();
            System.out.println("-----");
            pedido.despachar(); //decidi colocar aqui el despachar para mostralo en el ejemplo
            System.out.println("-----");
        }
    }
}
