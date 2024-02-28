package colmenatec.menuapp.business.facade;

import colmenatec.menuapp.domain.dto.ProductoCategoriaDto;
import colmenatec.menuapp.domain.dto.ProductoDto;

import java.util.List;

public interface IProductoFacade extends IBaseFacade<ProductoDto,Long>{

    List<ProductoCategoriaDto> filtrarProductos();
}
