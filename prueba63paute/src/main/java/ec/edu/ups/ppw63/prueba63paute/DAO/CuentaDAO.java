package ec.edu.ups.ppw63.prueba63paute.DAO;


import java.util.List;

import ec.edu.ups.ppw63.prueba63paute.model.Cuenta;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class CuentaDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void insert(Cuenta cuenta) {
		em.persist(cuenta);
	}
	
	public void update(Cuenta cuenta) {
		em.merge(cuenta);
	}
	
	public void remove(int codigo) {
		Cuenta cuenta = em.find(Cuenta.class, codigo);
		em.refresh(cuenta);
	}
	
	public Cuenta read(int codigo) {
		Cuenta cuenta = em.find(Cuenta.class, codigo);
		return cuenta;
	}
	
	public List<Cuenta> getAll(){
		String jpql = "SELECT c FROM Factura c";
		Query q = em.createQuery(jpql, Cuenta.class);
		return q.getResultList();
	}
}
