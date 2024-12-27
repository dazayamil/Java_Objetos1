package Distribuidora;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Sistema {
    private List<Cliente> clientes;
    private List<Producto> productos;

    public Sistema(){
        this.clientes = new ArrayList<Cliente>();
        this.productos = new ArrayList<Producto>();
    }

    public Cliente registrarCliente(String nombre, String mail){
        Cliente client = new Cliente(nombre, mail);
        this.clientes.add(client);
        return client;
    }

    private void agregarProducto(Producto prod){
        this.productos.add(prod);
    }

    public ProductoNacional registrarProductoNacional(String nombre, double costoUnitario, String descripcion){
        ProductoNacional productoNacional = new ProductoNacional(nombre, costoUnitario, descripcion);
        this.agregarProducto(productoNacional);
        return productoNacional;
    }

    public ProductoImportado registrarProductoImportado(String nombre, double costoUnitario, String descripcion, String paisOrigen){
        ProductoImportado productoImportado = new ProductoImportado(nombre, costoUnitario, descripcion, paisOrigen);
        this.agregarProducto(productoImportado);
        return productoImportado;
    }

    public int cantidadSolicitadaDeUnProducto(Producto producto){
        return this.clientes.stream()
                .mapToInt(cliente -> cliente.cantidadPedida(producto))
                .sum();
    }

    public double costoTotalCliente(Cliente cliente, LocalDate fechaInicio, LocalDate fechaFin){
        return cliente.costoTotal(fechaInicio, fechaFin);
    }
}
