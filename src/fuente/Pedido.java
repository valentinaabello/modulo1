package fuente;

import java.util.ArrayList;

public class Pedido {
	private int id_pedido;
	private Cliente cliente;
	private ArrayList<Producto> productos;
	
	public Pedido(int id_pedido, Cliente cliente, ArrayList<Producto> productos) {
		this.id_pedido = id_pedido;
		this.cliente = cliente;
		this.productos = productos;
	}

	public int getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	

}
