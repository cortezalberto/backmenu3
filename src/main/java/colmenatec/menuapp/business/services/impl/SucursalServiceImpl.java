package colmenatec.menuapp.business.services.impl;

import colmenatec.menuapp.business.services.ICategoriaService;
import colmenatec.menuapp.business.services.IDireccionService;
import colmenatec.menuapp.business.services.ISucursalService;
import colmenatec.menuapp.domain.entities.Sucursal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SucursalServiceImpl extends BaseServiceImpl<Sucursal,Long> implements ISucursalService {

    @Autowired
    private IDireccionService direccionService;
    @Autowired
    private ICategoriaService categoriaService;

    @Override
    public Sucursal asignarDireccion(Long id, Long idDireccion) {
        var sucursal = getById(id);
        var direccion = direccionService.getById(idDireccion);
        sucursal.setDireccion(direccion);
        return update(sucursal);
    }

    @Override
    public Sucursal asignarCategorias(Long id, List<Long> idsCategorias) {
        var sucursal = getById(id);
        var categorias = categoriaService.getAll().stream()
                .filter(categoria -> idsCategorias.contains(categoria.getId()))
                .collect(Collectors.toList());
        categorias.forEach(categoria -> {
            sucursal.getCategorias().add(categoria);
        });
        return update(sucursal);
    }

}
