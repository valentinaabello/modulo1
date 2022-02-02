package fuente;

import java.util.ArrayList;

public class Compra {
	private int id_compra;
	private Proveedor proveedor;
	private ArrayList<Producto> productos;
	
	public Compra(int id_compra, Proveedor proveedor, ArrayList<Producto> productos) {
		this.id_compra = id_compra;
		this.proveedor = proveedor;
		this.productos = productos;
	}

	public int getId_compra() {
		return id_compra;
	}

	public void setId_compra(int id_compra) {
		this.id_compra = id_compra;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	

}
