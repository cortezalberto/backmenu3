package colmenatec.menuapp.domain.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Combo extends Base{

    private String nombre;
    private Integer descuento;
    private Integer precio;
    private String descripcion;
    private String imagenUrl;

    @OneToMany
    private Set<ProductoCombo> productoCombos = new HashSet<>();
}
