package colmenatec.menuapp.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Sucursal extends Base{

    private String nombre;

    private String empresaId;
    @OneToOne
    private Direccion direccion;
    @OneToMany
    private Set<Categoria> categorias = new HashSet<>();
}