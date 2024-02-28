package colmenatec.menuapp.business.services;

import colmenatec.menuapp.domain.entities.Categoria;

import java.util.List;

public interface ICategoriaService extends IBaseService<Categoria,Long>{
    Categoria asignarProductos(Long id, List<Long> idsProductos);
    Categoria asignarSubcategorias(Long id,List<Categoria> subcategorias);
}
