package colmenatec.menuapp.presentation.rest;

import colmenatec.menuapp.business.facade.impl.ProductoFacadeImpl;
import colmenatec.menuapp.domain.dto.ProductoCategoriaDto;
import colmenatec.menuapp.domain.dto.ProductoDto;
import colmenatec.menuapp.domain.dto.SucursalDto;
import colmenatec.menuapp.domain.entities.Producto;
import colmenatec.menuapp.presentation.rest.base.BaseControllerImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController extends BaseControllerImpl<Producto, ProductoDto,Long, ProductoFacadeImpl> {

    public ProductoController(ProductoFacadeImpl facade) {
        super(facade);
    }
    @GetMapping("/filtrar")
    public ResponseEntity<List<ProductoCategoriaDto>>  asignarDireccion(){
        return ResponseEntity.ok().body(facade.filtrarProductos());
    }
}
