package info.microdev.ejb;

import info.microdev.entidad.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ClienteFacade extends AbstractFacade<Cliente> {

    @PersistenceContext(unitName = "veterinaria")
    private EntityManager entityManager;

    public ClienteFacade(){
        super(Cliente.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return null;
    }
}
