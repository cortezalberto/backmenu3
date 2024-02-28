package colmenatec.menuapp.business.facade.impl;

import colmenatec.menuapp.business.facade.IProductoComboFacade;
import colmenatec.menuapp.business.facade.IProductoFacade;
import colmenatec.menuapp.business.mapper.IBaseMapper;
import colmenatec.menuapp.business.services.IBaseService;
import colmenatec.menuapp.domain.dto.ProductoComboDto;
import colmenatec.menuapp.domain.entities.ProductoCombo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoComboFacadeImpl extends BaseFacadeImpl<ProductoCombo, ProductoComboDto,Long> implements IProductoComboFacade {

    @Autowired
    private IProductoFacade productoFacade;

    public ProductoComboFacadeImpl(IBaseService<ProductoCombo, Long> baseService, IBaseMapper<ProductoCombo, ProductoComboDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Override
    public ProductoComboDto createNew(ProductoComboDto request) {
        var producto = productoFacade.getById(request.getProductoId());
        request.setProducto(producto);
        return super.createNew(request);
    }
}
