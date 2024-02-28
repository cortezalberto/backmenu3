package colmenatec.menuapp.presentation.rest;

import colmenatec.menuapp.business.facade.impl.DireccionFacadeImpl;
import colmenatec.menuapp.domain.dto.DireccionDto;
import colmenatec.menuapp.domain.entities.Direccion;
import colmenatec.menuapp.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/direcciones")
public class DireccionController extends BaseControllerImpl<Direccion, DireccionDto,Long, DireccionFacadeImpl> {

    public DireccionController(DireccionFacadeImpl facade) {
        super(facade);
    }

}
