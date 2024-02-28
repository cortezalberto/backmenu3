package colmenatec.menuapp.business.facade.impl;

import colmenatec.menuapp.business.facade.ISucursalFacade;
import colmenatec.menuapp.business.mapper.IBaseMapper;
import colmenatec.menuapp.business.mapper.ISucursalMapper;
import colmenatec.menuapp.business.services.IBaseService;
import colmenatec.menuapp.business.services.ISucursalService;
import colmenatec.menuapp.domain.dto.SucursalCategoriaDto;
import colmenatec.menuapp.domain.dto.SucursalDto;
import colmenatec.menuapp.domain.entities.Sucursal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalFacadeImpl extends BaseFacadeImpl<Sucursal, SucursalDto,Long> implements ISucursalFacade {

    @Autowired
    private ISucursalService sucursalService;
    @Autowired
    private ISucursalMapper sucursalMapper;

    public SucursalFacadeImpl(IBaseService<Sucursal, Long> baseService, IBaseMapper<Sucursal, SucursalDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Override
    public SucursalDto asignarDireccion(Long id, Long idDireccion) {
        return sucursalMapper.toDTO(sucursalService.asignarDireccion(id,idDireccion));
    }

    @Override
    public SucursalDto asignarCategorias(Long id, List<Long> idsCategorias) {
        return sucursalMapper.toDTO(sucursalService.asignarCategorias(id,idsCategorias));
    }

    @Override
    public SucursalCategoriaDto obtenerCategorias(Long id) {
        SucursalCategoriaDto sucursalCategoriaDto = new SucursalCategoriaDto();
        var sucursal = sucursalService.getById(id);
        sucursalCategoriaDto.setId(sucursal.getId());
        sucursalCategoriaDto.setNombre(sucursal.getNombre());
        sucursal.getCategorias().forEach(categoria -> {
            sucursalCategoriaDto.getCategorias().add(categoria.getNombre());
        });
        return sucursalCategoriaDto;
    }
}
