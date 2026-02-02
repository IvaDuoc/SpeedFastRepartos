package Model;

public class PedidoEncomienda extends Pedido implements Despachable, Cancelable{
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

    @Override
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("[Pedido Encomienda]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Validando peso y embalaje... OK");
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
