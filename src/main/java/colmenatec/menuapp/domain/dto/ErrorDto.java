package colmenatec.menuapp.domain.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ErrorDto {
    private String errorMsg;
    private String errorClass;
}
