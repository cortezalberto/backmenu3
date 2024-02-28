package colmenatec.menuapp.business.mapper;

import colmenatec.menuapp.domain.dto.ComboDto;
import colmenatec.menuapp.domain.entities.Combo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IComboMapper extends IBaseMapper<Combo, ComboDto> {

    ComboDto toDTO(Combo source);
    Combo toEntity(ComboDto source);
    List<ComboDto> toDTOsList(List<Combo> source);
    List<Combo> toEntitiesList(List<ComboDto> source);
}
