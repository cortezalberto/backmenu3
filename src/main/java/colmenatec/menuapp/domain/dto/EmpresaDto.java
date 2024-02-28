package colmenatec.menuapp.domain.dto;


import lombok.Data;

import java.util.HashSet;
import java.util.Set;
@Data
public class EmpresaDto extends BaseDto{
    private String razonSocial;
    private String nombre;
    private Set<SucursalDto> sucursales = new HashSet<>();
}
