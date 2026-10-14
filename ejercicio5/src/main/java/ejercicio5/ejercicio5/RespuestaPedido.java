package ejercicio5.ejercicio5;

import java.util.ArrayList;

public class RespuestaPedido {
    private String cliente;
    private int totalProductos;
    private double preciototal;
    private String mensaje;

    public RespuestaPedido(String cliente, int totalProductos, double preciototal, String mensaje) {
        this.cliente = cliente;
        this.totalProductos = totalProductos;
        this.preciototal = preciototal;
        this.mensaje = mensaje;
    }

    public RespuestaPedido() {
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getTotalProductos() {
        return totalProductos;
    }

    public void setTotalProductos(int totalProductos) {
        this.totalProductos = totalProductos;
    }

    public double getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(double preciototal) {
        this.preciototal = preciototal;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}

