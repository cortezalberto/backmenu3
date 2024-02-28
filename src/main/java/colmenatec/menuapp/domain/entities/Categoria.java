package colmenatec.menuapp.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Categoria extends Base{

    private String nombre;
    private Long categoriaPadreId;
    @OneToMany
    private Set<Producto> productos = new HashSet<>();

    @OneToMany
    private Set<Combo> combos = new HashSet<>();

    @OneToMany
    private Set<Categoria> subcategorias = new HashSet<>();
}
