package Model;

public class Pedido {
    private int idPedido;
    private String direccionEntrega;
    private String tipoPedido;

    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }
    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    public String getDireccionEntrega() {
        return direccionEntrega;
    }
    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }
    public String getTipoPedido() {
        return tipoPedido;
    }
    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }
    //estos son solo para tener una idea de lo que debe hacer en las otras clases que lo heredan
    public void asignarRepartidor(){
        System.out.println("[Pedido]");
    }
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("Repartidor: " + nombreRepartidor);
    }
}
