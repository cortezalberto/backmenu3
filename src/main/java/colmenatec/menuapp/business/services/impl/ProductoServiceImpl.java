package colmenatec.menuapp.business.services.impl;

import colmenatec.menuapp.business.services.IProductoService;
import colmenatec.menuapp.domain.entities.Producto;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl extends BaseServiceImpl<Producto,Long> implements IProductoService {
}
