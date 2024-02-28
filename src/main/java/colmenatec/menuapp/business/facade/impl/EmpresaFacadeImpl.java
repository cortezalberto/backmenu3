package colmenatec.menuapp.business.facade.impl;

import colmenatec.menuapp.business.facade.IEmpresaFacade;
import colmenatec.menuapp.business.mapper.IBaseMapper;
import colmenatec.menuapp.business.mapper.IEmpresaMapper;
import colmenatec.menuapp.business.services.IBaseService;
import colmenatec.menuapp.business.services.IEmpresaService;
import colmenatec.menuapp.domain.dto.EmpresaDto;
import colmenatec.menuapp.domain.entities.Empresa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaFacadeImpl extends BaseFacadeImpl<Empresa, EmpresaDto,Long> implements IEmpresaFacade {


    private IEmpresaService empresaService;
    private IEmpresaMapper empresaMapper;
    public EmpresaFacadeImpl(IBaseService<Empresa, Long> baseService, IBaseMapper<Empresa, EmpresaDto> baseMapper, IEmpresaService empresaService, IEmpresaMapper empresaMapper) {
        super(baseService, baseMapper);
        this.empresaService = empresaService;
        this.empresaMapper = empresaMapper;
    }

    @Override
    public EmpresaDto asignarSucursales(Long id, List<Long> sucursalesIds) {
        return empresaMapper.toDTO(empresaService.asignarSucursales(id, sucursalesIds)) ;
    }

}
