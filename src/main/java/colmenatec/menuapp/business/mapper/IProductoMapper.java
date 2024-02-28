package colmenatec.menuapp.business.mapper;

import colmenatec.menuapp.domain.dto.ProductoDto;
import colmenatec.menuapp.domain.entities.Producto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IProductoMapper extends IBaseMapper<Producto, ProductoDto>{
    ProductoDto toDTO(Producto source);
    Producto toEntity(ProductoDto source);
    List<ProductoDto> toDTOsList(List<Producto> source);
    List<Producto> toEntitiesList(List<ProductoDto> source);
}
