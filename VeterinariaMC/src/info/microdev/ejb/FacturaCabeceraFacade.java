package info.microdev.ejb;

import info.microdev.entidad.FacturaCabecera;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class FacturaCabeceraFacade extends AbstractFacade<FacturaCabecera> {

    @PersistenceContext(unitName = "veterinaria")
    private EntityManager entityManager;

    public FacturaCabeceraFacade(){
        super(FacturaCabecera.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return null;
    }
}
