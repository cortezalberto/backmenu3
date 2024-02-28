package colmenatec.menuapp.business.facade;

import colmenatec.menuapp.domain.dto.CategoriaDto;

import java.util.List;

public interface ICategoriaFacade extends IBaseFacade<CategoriaDto,Long>{
    CategoriaDto asignarProductos(Long id, List<Long> idsProductos);
    CategoriaDto asignarSubcategorias(Long id,List<CategoriaDto> subcategorias);
}
