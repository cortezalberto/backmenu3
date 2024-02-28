package colmenatec.menuapp.business.facade;

import colmenatec.menuapp.domain.dto.EmpresaDto;

import java.util.List;

public interface IEmpresaFacade extends IBaseFacade<EmpresaDto,Long>{
    EmpresaDto asignarSucursales(Long id, List<Long> sucursalesIds);
}
