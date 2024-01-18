package ec.edu.ups.ppw63.prueba63paute.business;

import java.util.Date;
import java.util.List;

import ec.edu.ups.ppw63.prueba63paute.DAO.ClienteDAO;
import ec.edu.ups.ppw63.prueba63paute.DAO.CuentaDAO;
import ec.edu.ups.ppw63.prueba63paute.model.Cliente;
import ec.edu.ups.ppw63.prueba63paute.model.Cuenta;
import ec.edu.ups.ppw63.prueba63paute.model.Factura;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class GestionDatos {

	@Inject
	private ClienteDAO daoCliente;
	
	@Inject
	private CuentaDAO daoCuenta;
	
	@PostConstruct
	public void init() {
		System.out.println("iniciando");
		
		Cliente cliente = new Cliente();
		cliente.setCodigo(1);
		cliente.setCi("0987654321");
		cliente.setNombre("Andres Leon");
		
		daoCliente.insert(cliente);
		
		cliente = new Cliente();
		cliente.setCodigo(2);
		cliente.setCi("0151166725");
		cliente.setNombre("Marcelo Flores");
		
		daoCliente.insert(cliente);
		
		Cuenta cuenta = new Cuenta();
		cuenta.setCliente(cliente);
		cuenta.setNumero("0001");
		cuenta.setFechaEmision(new Date());
		
				
		Factura det = new Factura();
		det.setMes("Enero");
		det.setCantidad(200);
		
		cuenta.addDetalle(det);
		
		det = new Factura();
		det.setMes("Junio");
		det.setCantidad(100);
		
		cuenta.addDetalle(det);
		
		
		daoCuenta.insert(cuenta);
				
		}
}