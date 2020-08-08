package info.microdev.ejb;

import info.microdev.entidad.Producto;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ProductoFacade extends AbstractFacade<Producto> {

    @PersistenceContext(unitName = "veterinaria")
    private EntityManager entityManager;

    public ProductoFacade(){
        super(Producto.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return null;
    }
}
