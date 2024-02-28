package colmenatec.menuapp.business.facade.impl;

import colmenatec.menuapp.business.facade.IComboFacade;
import colmenatec.menuapp.business.facade.IProductoComboFacade;
import colmenatec.menuapp.business.mapper.IBaseMapper;
import colmenatec.menuapp.business.services.IBaseService;
import colmenatec.menuapp.domain.dto.ComboDto;
import colmenatec.menuapp.domain.dto.ProductoComboDto;
import colmenatec.menuapp.domain.entities.Combo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ComboFacadeImpl extends BaseFacadeImpl<Combo, ComboDto,Long> implements IComboFacade {

    @Autowired
    private IProductoComboFacade productoComboFacade;

    public ComboFacadeImpl(IBaseService<Combo, Long> baseService, IBaseMapper<Combo, ComboDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Override
    public ComboDto createNew(ComboDto request) {
        Set<ProductoComboDto> productoCombos = new HashSet<>();
        request.getProductoCombos().forEach( productoComboDto -> {
            productoCombos.add(productoComboFacade.createNew(productoComboDto));
        });
        request.setProductoCombos(productoCombos);
        return super.createNew(request);
    }

}
