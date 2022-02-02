package fuente;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// Se crean trabajadores
		Trabajador trabajador1 = new Trabajador(1, "Miguel");
		Trabajador trabajador2 = new Trabajador(2, "Lucia");
		
		Trabajador trabajador3 = new Trabajador(3, "Ana");
		Trabajador trabajador4 = new Trabajador(4, "Pedro");
				
		// Se crean áreas de trabajo
		// Área de preparación
		ArrayList<Trabajador> trabajadoresp = new ArrayList<Trabajador>();
		trabajadoresp.add(trabajador1);
		trabajadoresp.add(trabajador2);
		
		Area preparacion = new Area(1, "Área de Preparación", trabajadoresp);
		
		// Área de despacho
		ArrayList<Trabajador> trabajadoresd = new ArrayList<Trabajador>();
		trabajadoresd.add(trabajador3);
		trabajadoresd.add(trabajador4);

		Area despacho = new Area(2, "Área de Despacho", trabajadoresd);
		
		// Se crean productos que vende la Empresa
		Producto producto1 = new Producto(1, "Plátano", 990);
		Producto producto2 = new Producto(2, "Manzana", 1490);
		Producto producto3 = new Producto(3, "Lechuga", 790);
		Producto producto4 = new Producto(4, "Zanahoria", 690);
				
		// Se crean proveedores y sus productos disponibles
		Proveedor proveedor1 = new Proveedor(1, "La Vega Central", "Calle 1", 33445);
		Producto producto5 = new Producto(5, "Plátano", 490);
		Producto producto6 = new Producto(6, "Manzana", 990);
		
		ArrayList<Producto> productosp1 = new ArrayList<Producto>();
		productosp1.add(producto5);
		productosp1.add(producto6);
		
		Proveedor proveedor2 = new Proveedor(2, "Lo Valledor", "Calle 2", 26777);
		Producto producto7 = new Producto(7, "Lechuga", 390);
		Producto producto8 = new Producto(8, "Zanahoria", 490);
		
		ArrayList<Producto> productosp2 = new ArrayList<Producto>();
		productosp2.add(producto7);
		productosp2.add(producto8);
		
		// Se crean clientes y sus respectivos productos del pedido
		Cliente cliente1 = new Cliente(3, "Jaime", "Esquina 3", 678983);
		
		ArrayList<Producto> productosc1 = new ArrayList<Producto>();
		productosc1.add(producto1);
		productosc1.add(producto2);
		
		Cliente cliente2 = new Cliente(4, "Maria", "Esquina 4", 444667);
		
		ArrayList<Producto> productosc2 = new ArrayList<Producto>();
		productosc2.add(producto3);
		productosc2.add(producto4);
		
		//Estructura de control for para mostrar productos de los pedidos
		String lista1 = "";
		for(int i = 0; i < productosc1.size(); i++) {
			lista1 = lista1 + productosc1.get(i).getNombre() + " con un precio por kilo de $" + productosc1.get(i).getPrecio() + "\n";
		}
		
		String lista2 = "";
		for(int i = 0; i < productosc2.size(); i++) {
			lista2 = lista2 + productosc2.get(i).getNombre() + " con un precio por kilo de $" + productosc2.get(i).getPrecio() + "\n";
		}
		
		// Se crea una compra a cada uno de los proveedores
		Compra compra1 = new Compra(1, proveedor1, productosp1);
		Compra compra2 = new Compra(2, proveedor2, productosp2);
		
		//Se crea un pedido (venta) para cada cliente
		Pedido pedido1 = new Pedido(1, cliente1, productosc1);
		Pedido pedido2 = new Pedido(2, cliente2, productosc2);
		
		//
		System.out.println("--------------------------------------------------------");
		System.out.println("------------------------- VENTAS -----------------------");
		System.out.println("Se ha realizado el pedido " + pedido1.getId_pedido() + " por el cliente " + pedido1.getCliente().getNombre());
		System.out.println("Los productos del pedido son: \n" + lista1);
		System.out.println("Deben ser enviados a " + pedido1.getCliente().getDireccion() + "; Telefono de contacto: " + pedido1.getCliente().getTelefono());
		System.out.println("--------------------------------------------------------");
		System.out.println("Se ha realizado el pedido " + pedido2.getId_pedido() + " por el cliente " + pedido2.getCliente().getNombre());
		System.out.println("Los productos del pedido son: \n" + lista1);
		System.out.println("Deben ser enviados a " + pedido2.getCliente().getDireccion() + "; Telefono de contacto: " + pedido2.getCliente().getTelefono());
	
		System.out.println("--------------------------------------------------------");
		System.out.println("---------------------- TRABAJADORES --------------------");
		System.out.println("El " + preparacion.getNombre() + " tiene a los trabajadores: \n" 
							+ preparacion.getTrabajadores().get(0).getNombre() + " RUT: " + preparacion.getTrabajadores().get(0).getRut() + "\n"
							+ preparacion.getTrabajadores().get(1).getNombre() + " RUT: " + preparacion.getTrabajadores().get(1).getRut());
		System.out.println("El " + despacho.getNombre() + " tiene a los trabajadores: \n" 
							+ despacho.getTrabajadores().get(0).getNombre() + " RUT: " + despacho.getTrabajadores().get(0).getRut() + "\n"
							+ despacho.getTrabajadores().get(1).getNombre() + " RUT: " + despacho.getTrabajadores().get(1).getRut());
		
		System.out.println("--------------------------------------------------------");
		System.out.println("------------------------- COMPRAS ----------------------");
		System.out.println("Se realizó una compra al proveedor " + compra1.getProveedor().getNombre());
		System.out.println("	Detalle:");
		System.out.println("1. " + compra1.getProductos().get(0).getNombre() + " | $" + compra1.getProductos().get(0).getPrecio() + " x kg.");
		System.out.println("2. " + compra1.getProductos().get(1).getNombre() + " | $" + compra1.getProductos().get(1).getPrecio() + " x kg.");
		System.out.println("Se realizó otra compra al proveedor " + compra2.getProveedor().getNombre());
		System.out.println("	Detalle:");
		System.out.println("1. " + compra2.getProductos().get(0).getNombre() + "   | $" + compra2.getProductos().get(0).getPrecio() + " x kg.");
		System.out.println("2. " + compra2.getProductos().get(1).getNombre() + " | $" + compra2.getProductos().get(1).getPrecio() + " x kg.");
		
	
	}

}
