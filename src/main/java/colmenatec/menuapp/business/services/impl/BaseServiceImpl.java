package colmenatec.menuapp.business.services.impl;


import colmenatec.menuapp.business.services.IBaseService;
import colmenatec.menuapp.domain.entities.Base;
import colmenatec.menuapp.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public abstract class BaseServiceImpl<E extends Base,ID extends Serializable> implements IBaseService<E, ID> {

    @Autowired
    protected BaseRepository<E,ID> baseRepository;

    @Override
    public E create(E entity) {
        return baseRepository.save(entity);
    }

    @Override
    public E getById(ID id) {
        var optionalEntity = baseRepository.findById(id);

        if (optionalEntity.isEmpty()){
            throw new RuntimeException("No se encontro una entidad con el id " + id);
        }
        return optionalEntity.get();
    }

    @Override
    public List<E> getAll() {
        return baseRepository.findAll();
    }

    @Override
    public void deleteById(ID id) {
        baseRepository.deleteById(id);
    }

    @Override
    public E update(E entity) {
        var optionalEntity = baseRepository.findById((ID) entity.getId());
        if (optionalEntity.isEmpty()){
            throw new RuntimeException("No se encontro una entidad con el id " + entity.getId());
        }
        return baseRepository.save(entity);
    }

}
