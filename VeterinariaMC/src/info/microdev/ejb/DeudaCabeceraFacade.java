package info.microdev.ejb;

import info.microdev.entidad.DeudaCabecera;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DeudaCabeceraFacade extends AbstractFacade<DeudaCabecera> {

    @PersistenceContext(unitName = "veterinaria")
    private EntityManager entityManager;

    public DeudaCabeceraFacade(){
        super(DeudaCabecera.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return null;
    }
}
