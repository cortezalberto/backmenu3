package colmenatec.menuapp.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ProductoCategoriaDto extends BaseDto{

    private String nombre;
    private String descripcion;
    private String imagen;
    private String categoria;
    private Integer precio;

}
