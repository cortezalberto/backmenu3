package colmenatec.menuapp.presentation.rest;

import colmenatec.menuapp.business.facade.IEmpresaFacade;
import colmenatec.menuapp.business.facade.impl.SucursalFacadeImpl;
import colmenatec.menuapp.domain.dto.SucursalCategoriaDto;
import colmenatec.menuapp.domain.dto.SucursalDto;
import colmenatec.menuapp.domain.entities.Sucursal;
import colmenatec.menuapp.presentation.rest.base.BaseControllerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sucursales")
public class SucursalController extends BaseControllerImpl<Sucursal, SucursalDto,Long, SucursalFacadeImpl> {
    private static final Logger logger = LoggerFactory.getLogger(SucursalController.class);
    @Autowired
    private IEmpresaFacade empresaFacade;
    public SucursalController(SucursalFacadeImpl facade) {
        super(facade);
    }


    @Override
    public SucursalDto create(SucursalDto entity) {
        if(entity.getEmpresaId() == null){
            logger.info("Creando Sucursal sin asignarle una empresa");
            return super.create(entity);
        }else {
            logger.info("Creando Sucursal y asignandole una empresa");
            var empresa = empresaFacade.getById(entity.getEmpresaId());
            var sucursal = super.create(entity);
            var listaIds = new ArrayList<Long>();
            listaIds.add(sucursal.getId());
            empresaFacade.asignarSucursales(empresa.getId(),listaIds);
            return sucursal;
        }
    }

    @PutMapping("/asignarDireccion/{id}")
    public SucursalDto asignarDireccion(@RequestParam Long idDireccion, @PathVariable Long id){
        logger.info("INICIO ASIGNAR DIRECCION {} A SUCURSAL {}",idDireccion,id);
        return facade.asignarDireccion(id,idDireccion);
    }

    @PutMapping("/asignarCategorias/{id}")
    public SucursalDto asignarCategorias(@RequestParam List<Long> idsCategorias, @PathVariable Long id){
        logger.info("INICIO ASIGNAR CATEGORIAS A SUCURSAL {}",id);
        return facade.asignarCategorias(id,idsCategorias);
    }
    @GetMapping("/obtenerCategorias/{id}")
    public SucursalCategoriaDto obtenerCategorias( @PathVariable Long id){
        logger.info("INICIO OBTENER CATEGORIAS DE LA SUCURSAL {}",id);
        return facade.obtenerCategorias(id);
    }

}
