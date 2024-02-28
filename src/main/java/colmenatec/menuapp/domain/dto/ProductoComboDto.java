package colmenatec.menuapp.domain.dto;

import colmenatec.menuapp.domain.entities.Producto;
import lombok.Data;

@Data
public class ProductoComboDto extends BaseDto{
    private Integer cantidad;
    private Long productoId;
    private ProductoDto producto;
}
