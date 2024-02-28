package colmenatec.menuapp.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Producto extends Base{
    private String nombre;
    private Integer precio;
    private String descripcion;
    private String imagenUrl;

}