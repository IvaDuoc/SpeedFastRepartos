package Model;

public class PedidoEncomienda extends Pedido{
    public PedidoEncomienda(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Pedido Encomienda");
    }
    @Override //usa los mismos textos que el ejemplo
    public void asignarRepartidor(){
        System.out.println("[Pedido Encomienda]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Validando peso y embalaje... OK");
    }

    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("[Pedido Encomienda]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Validando peso y embalaje... OK");
        System.out.println("→ Pedido asignado a " + nombreRepartidor);
    }
}
