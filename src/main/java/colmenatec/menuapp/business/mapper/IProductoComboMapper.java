package colmenatec.menuapp.business.mapper;

import colmenatec.menuapp.domain.dto.ProductoComboDto;
import colmenatec.menuapp.domain.entities.ProductoCombo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IProductoComboMapper extends IBaseMapper<ProductoCombo, ProductoComboDto> {

    ProductoComboDto toDTO(ProductoCombo source);
    ProductoCombo toEntity(ProductoComboDto source);
    List<ProductoComboDto> toDTOsList(List<ProductoCombo> source);
    List<ProductoCombo> toEntitiesList(List<ProductoComboDto> source);
}
