package info.microdev.ejb;

import info.microdev.entidad.CompraCabecera;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CompraCabeceraFacade extends AbstractFacade<CompraCabecera> {

    @PersistenceContext(unitName = "veterinaria")
    private EntityManager entityManager;

    public CompraCabeceraFacade(){
        super(CompraCabecera.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return null;
    }
}
