package colmenatec.menuapp.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ProductoCombo extends Base{
    private Integer cantidad;
    @OneToOne
    private Producto producto;
}