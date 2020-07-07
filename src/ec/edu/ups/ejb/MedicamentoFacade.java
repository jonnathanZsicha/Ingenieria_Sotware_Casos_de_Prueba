package ec.edu.ups.ejb;


import ec.edu.ups.entidad_ingre_egre_rep.Medicamento;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class MedicamentoFacade extends AbstractFacade<Medicamento>{

    @PersistenceContext(unitName = "Practica03.EJB.JSF.JPA")
    private EntityManager entityManager;

    public MedicamentoFacade() {
        super(Medicamento.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}