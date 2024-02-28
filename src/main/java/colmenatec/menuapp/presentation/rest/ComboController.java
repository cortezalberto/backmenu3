package colmenatec.menuapp.presentation.rest;

import colmenatec.menuapp.business.facade.impl.ComboFacadeImpl;
import colmenatec.menuapp.domain.dto.ComboDto;
import colmenatec.menuapp.domain.entities.Combo;
import colmenatec.menuapp.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/combos")
public class ComboController extends BaseControllerImpl<Combo, ComboDto,Long, ComboFacadeImpl>  {

    public ComboController(ComboFacadeImpl facade) {
        super(facade);
    }

}
