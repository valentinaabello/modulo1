package fuente;

import java.util.ArrayList;

public class Area {
	private int id_area;
	private String nombre;
	private ArrayList<Trabajador> trabajadores;
	
	public Area(int id_area, String nombre, ArrayList<Trabajador> trabajadores) {
		this.id_area = id_area;
		this.nombre = nombre;
		this.trabajadores = trabajadores;
	}

	public int getId_area() {
		return id_area;
	}

	public void setId_area(int id_area) {
		this.id_area = id_area;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Trabajador> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
	}
	

}
