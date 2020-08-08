package info.microdev.ejb;

import info.microdev.entidad.Empleado;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EmpleadoFacade extends AbstractFacade<Empleado> {

    @PersistenceContext(unitName = "veterinaria")
    private EntityManager entityManager;

    public EmpleadoFacade(){
        super(Empleado.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return null;
    }
}
