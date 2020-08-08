package info.microdev.ejb;

import info.microdev.entidad.FacturaDetalle;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class FacturaDetalleFacade extends AbstractFacade<FacturaDetalle> {

    @PersistenceContext(unitName = "veterinaria")
    private EntityManager entityManager;

    public FacturaDetalleFacade(){
        super(FacturaDetalle.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return null;
    }
}
