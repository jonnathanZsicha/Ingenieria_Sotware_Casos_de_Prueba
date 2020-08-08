package info.microdev.ejb;

import info.microdev.entidad.Paciente;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PacienteFacade extends AbstractFacade<Paciente> {

    @PersistenceContext(unitName = "veterinaria")
    private EntityManager entityManager;

    public PacienteFacade(){
        super(Paciente.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return null;
    }
}
