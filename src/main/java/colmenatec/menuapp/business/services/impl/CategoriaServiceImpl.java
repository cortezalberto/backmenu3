package colmenatec.menuapp.business.services.impl;

import colmenatec.menuapp.business.services.ICategoriaService;
import colmenatec.menuapp.business.services.IProductoService;
import colmenatec.menuapp.domain.entities.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriaServiceImpl extends BaseServiceImpl<Categoria,Long> implements ICategoriaService {
    @Autowired
    private IProductoService productoService;

    @Override
    public Categoria asignarProductos(Long id, List<Long> idsProductos) {
        var categoria = getById(id);
        var productos = productoService.getAll().stream()
                .filter(producto -> idsProductos.contains(producto.getId()))
                .collect(Collectors.toList());
        productos.forEach(producto -> {
            categoria.getProductos().add(producto);
        });
        return update(categoria);
    }

    @Override
    public Categoria asignarSubcategorias(Long id, List<Categoria> subcategorias) {
        var categoria = getById(id);
        subcategorias.forEach(subcategoria ->{
            categoria.getSubcategorias().add(subcategoria);
        });
        return update(categoria);
    }
}
