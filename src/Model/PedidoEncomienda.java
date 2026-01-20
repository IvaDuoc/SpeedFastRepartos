package Model;

public class PedidoEncomienda extends Pedido{
    public PedidoEncomienda(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, "Pedido Encomienda", distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        return (int) (20 + (1.5 * ((getDistanciaKm()) - (getDistanciaKm() % 1)))); //decidi restarle el resto para que solo mostrara los minutos (no aproxima)
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
