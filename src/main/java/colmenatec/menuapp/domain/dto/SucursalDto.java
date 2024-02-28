package colmenatec.menuapp.domain.dto;

import colmenatec.menuapp.domain.entities.Categoria;
import colmenatec.menuapp.domain.entities.Direccion;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class SucursalDto extends BaseDto{
    private String nombre;
    private DireccionDto direccion;
    private Set<CategoriaDto> categorias = new HashSet<>();
    private Long empresaId;
}
