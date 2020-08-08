package info.microdev.ejb;

import info.microdev.entidad.RegistroMedico;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class RegistroMedicoFacade extends AbstractFacade<RegistroMedico> {

    @PersistenceContext(unitName = "veterinaria")
    private EntityManager entityManager;

    public RegistroMedicoFacade(){
        super(RegistroMedico.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return null;
    }
}
