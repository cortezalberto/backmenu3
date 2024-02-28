package colmenatec.menuapp.domain.dto;

import lombok.Data;

@Data
public class ProductoDto extends BaseDto{
    private String nombre;
    private Integer precio;
    private String descripcion;
    private String imagenUrl;
}
