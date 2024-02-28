package colmenatec.menuapp.business.services;

import colmenatec.menuapp.domain.entities.Empresa;

import java.util.List;

public interface IEmpresaService extends IBaseService<Empresa,Long> {
    Empresa asignarSucursales(Long id,List<Long> sucursalesIds);
}
