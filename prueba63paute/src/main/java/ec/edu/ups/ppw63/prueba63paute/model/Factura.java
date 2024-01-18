package ec.edu.ups.ppw63.prueba63paute.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Factura {

	@Id
	@GeneratedValue
	private int codigo;
	private String mes;
	private int cantidad;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String nombre) {
		this.mes = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "DetalleFactura [codigo=" + codigo + ", nombre=" + mes + ", cantidad=" + cantidad + ", precio=" + "]";
	}
	
	
}

