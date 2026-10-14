package ejercicio5.ejercicio5;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {

    @PostMapping("/pedidos")
    public RespuestaPedido procesarPedido(@RequestBody Pedido pedido) {
        int totalProductos = 0;
        double precioTotal = 0.0;

        if (pedido.getProductos() != null) {
            for (Producto producto : pedido.getProductos()) {
                totalProductos += producto.getCantidad();
                precioTotal += producto.getCantidad() * producto.getPrecioUnitario();
            }
        }
        String nombreCliente = (pedido.getCliente() != null) ? pedido.getCliente().getNombre() : "Desconocido";

        return new RespuestaPedido(
                nombreCliente,
                totalProductos,
                precioTotal,
                "Pedido recibido correctamente"
        );
    }
}