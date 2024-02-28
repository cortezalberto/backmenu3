package colmenatec.menuapp.domain.dto;

import colmenatec.menuapp.domain.entities.ProductoCombo;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class ComboDto extends BaseDto{
    private String nombre;
    private Integer descuento;
    private Integer precio;
    private String descripcion;
    private String imagenUrl;
    private Set<ProductoComboDto> productoCombos = new HashSet<>();

}
