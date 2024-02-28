package colmenatec.menuapp.business.facade;

import colmenatec.menuapp.domain.dto.SucursalCategoriaDto;
import colmenatec.menuapp.domain.dto.SucursalDto;

import java.util.List;

public interface ISucursalFacade extends IBaseFacade<SucursalDto,Long>{
    SucursalDto asignarDireccion(Long id, Long idDireccion);
    SucursalDto asignarCategorias(Long id, List<Long> idsCategorias);
    SucursalCategoriaDto obtenerCategorias(Long id);
}
