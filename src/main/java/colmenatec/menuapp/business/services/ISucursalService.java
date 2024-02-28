package colmenatec.menuapp.business.services;

import colmenatec.menuapp.domain.entities.Sucursal;

import java.util.List;

public interface ISucursalService extends IBaseService<Sucursal,Long> {

    Sucursal asignarDireccion(Long id, Long idDireccion);
    Sucursal asignarCategorias(Long id, List<Long> idsCategorias);
}
