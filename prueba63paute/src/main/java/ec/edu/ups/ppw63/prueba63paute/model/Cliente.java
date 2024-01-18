package ec.edu.ups.ppw63.prueba63paute.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cliente {

	@Id
	private int codigo;
	private String ci;
	private String nombre;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codifo) {
		this.codigo = codifo;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String dni) {
		this.ci = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", dni=" + ci + ", nombre=" + nombre  + "]";
	}
	
	
}
