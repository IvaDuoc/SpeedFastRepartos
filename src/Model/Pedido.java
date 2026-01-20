package Model;

public class Pedido {
    private int idPedido;
    private String direccionEntrega;
    private String tipoPedido;
    private double distanciaKm;

    public Pedido(int idPedido, String direccionEntrega, String tipoPedido, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
        this.distanciaKm = distanciaKm;
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
    public double getDistanciaKm() {
        return distanciaKm;
    }
    public void setDistanciaKm(int distanciaKm) {
        this.distanciaKm = distanciaKm;
    }
    public int calcularTiempoEntrega() {
        return 0;
    }
    public void mostrarResumen(){
        System.out.println("ID: " + idPedido);
        System.out.println("Direccion: " + direccionEntrega);
        System.out.println("Tipo: " + tipoPedido);
        System.out.println("Distancia: " + distanciaKm + " km");
        System.out.println("Tiempo: " + calcularTiempoEntrega() + " minutos");
    }
    //estos son solo para tener una idea de lo que debe hacer en las otras clases que lo heredan
    public void asignarRepartidor(){
        System.out.println("[Pedido]");
    }
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("Repartidor: " + nombreRepartidor);
    }
}
