package colmenatec.menuapp.presentation.rest;

import colmenatec.menuapp.business.facade.impl.CategoriaFacadeImpl;
import colmenatec.menuapp.domain.dto.CategoriaDto;
import colmenatec.menuapp.domain.entities.Categoria;
import colmenatec.menuapp.presentation.rest.base.BaseControllerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController extends BaseControllerImpl<Categoria, CategoriaDto,Long, CategoriaFacadeImpl> {

    private static final Logger logger = LoggerFactory.getLogger(CategoriaController.class);
    public CategoriaController(CategoriaFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarProductos/{id}")
    public CategoriaDto asignarProductos(@RequestParam List<Long> idsProductos, @PathVariable Long id){
        return facade.asignarProductos(id,idsProductos);
    }

    @Override
    public CategoriaDto create(CategoriaDto entity) {
        if(entity.getCategoriaPadreId() == null){
            return super.create(entity);
        }else{
            logger.info("Creando subcategoria y asignandola a la categoria {}",entity.getCategoriaPadreId());
            var categoriaPadre = facade.getById(entity.getCategoriaPadreId());
            var subcategoria = super.create(entity);
            var listaSubcategorias = new ArrayList<CategoriaDto>();
            listaSubcategorias.add(subcategoria);
            facade.asignarSubcategorias(categoriaPadre.getId(), listaSubcategorias);
            return subcategoria;
        }
    }
}
