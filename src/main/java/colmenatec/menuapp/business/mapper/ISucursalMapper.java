package colmenatec.menuapp.business.mapper;

import colmenatec.menuapp.domain.dto.SucursalCategoriaDto;
import colmenatec.menuapp.domain.dto.SucursalDto;
import colmenatec.menuapp.domain.entities.Sucursal;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ISucursalMapper extends IBaseMapper<Sucursal, SucursalDto>{
    SucursalDto toDTO(Sucursal source);
    Sucursal toEntity(SucursalDto source);
    List<SucursalDto> toDTOsList(List<Sucursal> source);
    List<Sucursal> toEntitiesList(List<SucursalDto> source);

}
