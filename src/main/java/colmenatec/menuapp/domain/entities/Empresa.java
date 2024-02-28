package colmenatec.menuapp.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Data
@Entity
public class Empresa extends Base{

    private String razonSocial;
    private String nombre;
    @OneToMany
    private Set<Sucursal> sucursales = new HashSet<>();
}
