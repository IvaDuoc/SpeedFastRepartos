package Model;

public class PedidoComida extends Pedido{
    public PedidoComida(int idPedido, String direccionEntrega){
        super(idPedido, direccionEntrega, "Pedido Comida");
    }
    @Override //usa los mismos textos que el ejemplo
    public void asignarRepartidor(){
        System.out.println("[Pedido Comida]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Verificando mochila térmica... OK");
    }
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("[Pedido Comida]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Verificando mochila térmica... OK");
        System.out.println("→ Pedido asignado a " + nombreRepartidor);
    }
}
