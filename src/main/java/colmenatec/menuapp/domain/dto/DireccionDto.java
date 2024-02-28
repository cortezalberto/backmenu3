package colmenatec.menuapp.domain.dto;

import lombok.Data;

@Data
public class DireccionDto extends BaseDto{
    private String calle;
    private Integer numero;
}
