package info.microdev.ejb;

import info.microdev.entidad.Proveedor;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ProveedorFacade extends AbstractFacade<Proveedor> {

    @PersistenceContext(unitName = "veterinaria")
    private EntityManager entityManager;

    public ProveedorFacade(){
        super(Proveedor.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return null;
    }
}
