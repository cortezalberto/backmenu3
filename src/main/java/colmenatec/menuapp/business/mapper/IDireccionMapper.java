package colmenatec.menuapp.business.mapper;

import colmenatec.menuapp.domain.dto.DireccionDto;
import colmenatec.menuapp.domain.entities.Direccion;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IDireccionMapper extends IBaseMapper<Direccion, DireccionDto>{

    DireccionDto toDTO(Direccion source);
    Direccion toEntity(DireccionDto source);
    List<DireccionDto> toDTOsList(List<Direccion> source);
    List<Direccion> toEntitiesList(List<DireccionDto> source);
}
