package Model;

public class PedidoExpress extends Pedido{
    public PedidoExpress(int idPedido, String direccionEntrega, double distanciaKm){
        super(idPedido, direccionEntrega, "Pedido Express", distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        if (getDistanciaKm() > 5){
            return 15;
        }
        else {
            return 10;
        }
    }

    @Override //usa los mismos textos que el ejemplo

    public void asignarRepartidor(){
        System.out.println("[Pedido Express]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Repartidor más cercano con disponibilidad inmediata encontrado.");
    }

    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("[Pedido Express]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Repartidor más cercano con disponibilidad inmediata encontrado.");
        System.out.println("→ Pedido asignado a " + nombreRepartidor);
    }
}
