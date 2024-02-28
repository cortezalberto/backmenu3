package colmenatec.menuapp.business.facade.impl;

import colmenatec.menuapp.business.facade.ICategoriaFacade;
import colmenatec.menuapp.business.facade.IProductoFacade;
import colmenatec.menuapp.business.mapper.IBaseMapper;
import colmenatec.menuapp.business.mapper.ICategoriaMapper;
import colmenatec.menuapp.business.services.IBaseService;
import colmenatec.menuapp.domain.dto.ProductoCategoriaDto;
import colmenatec.menuapp.domain.dto.ProductoDto;
import colmenatec.menuapp.domain.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoFacadeImpl extends BaseFacadeImpl<Producto, ProductoDto,Long> implements IProductoFacade {

    @Autowired
    private ICategoriaFacade categoriaFacade;
    @Autowired
    private ICategoriaMapper categoriaMapper;

    public ProductoFacadeImpl(IBaseService<Producto, Long> baseService, IBaseMapper<Producto, ProductoDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Override
    public List<ProductoCategoriaDto> filtrarProductos() {
        List<ProductoCategoriaDto> productoCategoriaDtoList = new ArrayList<>();
        var categorias = categoriaMapper.toEntitiesList(categoriaFacade.getAll());
        categorias.forEach(categoria -> {
            categoria.getProductos().forEach(producto -> {
                    var productoCategoriaDto = new ProductoCategoriaDto();
                    productoCategoriaDto.setId(producto.getId());
                    productoCategoriaDto.setNombre(producto.getNombre());
                    productoCategoriaDto.setDescripcion(producto.getDescripcion());
                    productoCategoriaDto.setPrecio(producto.getPrecio());
                    productoCategoriaDto.setImagen(producto.getImagenUrl());
                    productoCategoriaDto.setCategoria(categoria.getNombre());

                    productoCategoriaDtoList.add(productoCategoriaDto);
            });
            }
        );
        return productoCategoriaDtoList;
    }
}
