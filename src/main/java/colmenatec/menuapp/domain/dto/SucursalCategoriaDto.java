package colmenatec.menuapp.domain.dto;


import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class SucursalCategoriaDto extends BaseDto {
    private String nombre;
    private Set<String> categorias = new HashSet<>();
}
