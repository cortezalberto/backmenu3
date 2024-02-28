package colmenatec.menuapp.presentation.rest;

import colmenatec.menuapp.business.facade.impl.EmpresaFacadeImpl;
import colmenatec.menuapp.domain.dto.EmpresaDto;
import colmenatec.menuapp.domain.entities.Empresa;
import colmenatec.menuapp.presentation.rest.base.BaseControllerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController extends BaseControllerImpl<Empresa, EmpresaDto,Long, EmpresaFacadeImpl> {

    private static final Logger logger = LoggerFactory.getLogger(EmpresaController.class);
    public EmpresaController(EmpresaFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarSucursales/{id}")
    public EmpresaDto asignarSucursales(@RequestParam List<Long> sucursalesIds, @PathVariable Long id){
        logger.info("INICIO ASIGNAR SUCURSALES A EMPRESA");
        return facade.asignarSucursales(id,sucursalesIds);
    }

}
