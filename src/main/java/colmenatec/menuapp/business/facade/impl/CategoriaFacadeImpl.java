package colmenatec.menuapp.business.facade.impl;

import colmenatec.menuapp.business.facade.ICategoriaFacade;
import colmenatec.menuapp.business.mapper.IBaseMapper;
import colmenatec.menuapp.business.mapper.ICategoriaMapper;
import colmenatec.menuapp.business.services.IBaseService;
import colmenatec.menuapp.business.services.ICategoriaService;
import colmenatec.menuapp.domain.dto.CategoriaDto;
import colmenatec.menuapp.domain.entities.Categoria;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaFacadeImpl extends BaseFacadeImpl<Categoria, CategoriaDto,Long> implements ICategoriaFacade {

    private ICategoriaMapper categoriaMapper;
    private ICategoriaService categoriaService;
    public CategoriaFacadeImpl(IBaseService<Categoria, Long> baseService, IBaseMapper<Categoria, CategoriaDto> baseMapper, ICategoriaMapper categoriaMapper, ICategoriaService categoriaService) {
        super(baseService, baseMapper);
        this.categoriaMapper = categoriaMapper;
        this.categoriaService = categoriaService;
    }

    @Override
    public CategoriaDto asignarProductos(Long id, List<Long> idsProductos) {
        return categoriaMapper.toDTO(categoriaService.asignarProductos(id,idsProductos));
    }

    @Override
    public CategoriaDto asignarSubcategorias(Long id, List<CategoriaDto> subcategorias) {
        return categoriaMapper.toDTO(categoriaService.asignarSubcategorias(id, categoriaMapper.toEntitiesList(subcategorias)));
    }
}
