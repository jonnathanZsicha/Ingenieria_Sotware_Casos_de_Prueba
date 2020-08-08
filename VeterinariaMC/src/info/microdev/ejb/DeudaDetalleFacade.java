package info.microdev.ejb;

import info.microdev.entidad.DeudaDetalle;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DeudaDetalleFacade extends AbstractFacade<DeudaDetalle> {

    @PersistenceContext(unitName = "veterinaria")
    private EntityManager entityManager;

    public DeudaDetalleFacade(){
        super(DeudaDetalle.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return null;
    }
}
