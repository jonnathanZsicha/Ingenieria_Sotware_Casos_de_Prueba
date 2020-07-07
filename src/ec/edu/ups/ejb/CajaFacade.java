package ec.edu.ups.ejb;

import ec.edu.ups.entidad_ingre_egre_rep.Caja;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CajaFacade extends AbstractFacade<Caja>{

    @PersistenceContext(unitName = "Practica03.EJB.JSF.JPA")
    private EntityManager entityManager;

    public CajaFacade() {
        super(Caja.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
