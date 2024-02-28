package colmenatec.menuapp.business.facade.impl;

import colmenatec.menuapp.business.facade.IDireccionFacade;
import colmenatec.menuapp.business.mapper.IBaseMapper;
import colmenatec.menuapp.business.services.IBaseService;
import colmenatec.menuapp.domain.dto.DireccionDto;
import colmenatec.menuapp.domain.entities.Direccion;
import org.springframework.stereotype.Service;

@Service
public class DireccionFacadeImpl extends BaseFacadeImpl<Direccion, DireccionDto,Long> implements IDireccionFacade {
    public DireccionFacadeImpl(IBaseService<Direccion, Long> baseService, IBaseMapper<Direccion, DireccionDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
