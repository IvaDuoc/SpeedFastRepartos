package Model;

public class PedidoComida extends Pedido implements Despachable, Cancelable{
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

    @Override
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("[Pedido Comida]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Verificando mochila térmica... OK");
        repartidorAsignado = nombreRepartidor;
        System.out.println("→ Pedido asignado a " + nombreRepartidor);
    }

    @Override
    public void despachar(){
        if (repartidorAsignado.equals("No asignado")){
            System.out.println(tipoPedido + " pendiente por falta de repartidor.");
        }
        else {
            System.out.println("Pedido despachado por " + repartidorAsignado + ".");
        }
    }

    @Override
    public void cancelar(){
        System.out.println("→ Pedido #" + idPedido + " cancelado exitosamente.");
    }
}
