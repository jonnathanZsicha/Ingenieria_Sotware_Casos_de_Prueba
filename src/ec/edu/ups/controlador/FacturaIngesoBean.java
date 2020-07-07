package ec.edu.ups.controlador;

import ec.edu.ups.ejb.FacturaIngresoFacade;
import ec.edu.ups.ejb.RolFacade;
import ec.edu.ups.entidad_cit_cons_cert.Rol;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class FacturaIngesoBean implements Serializable {
    private static final long serialVersionUID = 1L;
    @EJB
    private FacturaIngresoFacade ejbFacturaIngreso;
    private List<FacturaIngesoBean> list;
    public FacturaIngesoBean(){

    }
    @PostConstruct
    public void init(){

        // list=ejbRolFacade.findAll();
    }



    public void prueba(){
       // ejbFacturaIngreso.create();
    }
}
