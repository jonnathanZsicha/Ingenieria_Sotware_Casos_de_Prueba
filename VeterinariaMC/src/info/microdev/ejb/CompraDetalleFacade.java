package info.microdev.ejb;

import info.microdev.entidad.CompraCabecera;
import info.microdev.entidad.CompraDetalle;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CompraDetalleFacade extends AbstractFacade<CompraDetalle> {

    @PersistenceContext(unitName = "veterinaria")
    private EntityManager entityManager;

    public CompraDetalleFacade(){
        super(CompraDetalle.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return null;
    }
}
