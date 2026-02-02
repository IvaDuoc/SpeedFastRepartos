package Model;

public abstract class Pedido implements Despachable,Cancelable{
    protected int idPedido;
    protected String direccionEntrega;
    protected String tipoPedido;
    protected double distanciaKm;
    protected String repartidorAsignado;

    public Pedido(int idPedido, String direccionEntrega, String tipoPedido, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido; //se lo deje porque creo que no da mucho problema que este presente
        this.distanciaKm = distanciaKm;
        repartidorAsignado = "No asignado";
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
    public void asignarRepartidor(String nombre) {
        this.repartidorAsignado = nombre;
        System.out.println("Repartidor " + nombre + " asignado al pedido #" + idPedido);
    }
    public void mostrarResumen(){
        System.out.println("ID: " + idPedido);
        System.out.println("Direccion: " + direccionEntrega);
        System.out.println("Tipo: " + tipoPedido); //ya que no lo quite lo deje
        System.out.println("Distancia: " + distanciaKm + " km");
        System.out.println("Tiempo: " + calcularTiempoEntrega() + " minutos");
    }
    //estos son solo para tener una idea de lo que debe hacer en las otras clases que lo heredan
    public void asignarRepartidor(){
        System.out.println("[Pedido]");
    }
}
