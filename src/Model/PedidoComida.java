package Model;

public class PedidoComida extends Pedido{
    public PedidoComida(int idPedido, String direccionEntrega, double distanciaKm){
        super(idPedido, direccionEntrega, "Pedido Comida", distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        return (int) (15 + (2 * ((getDistanciaKm()) - (getDistanciaKm() % 1)))); //decidi restarle el resto para que solo mostrara los minutos (no aproxima)
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
