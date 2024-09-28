package grupo.api.rest.api.ejercicio.reto.cotroller;

import grupo.api.rest.api.ejercicio.reto.modelos.Inventario;
import grupo.api.rest.api.ejercicio.reto.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {

    @Autowired
    private InventarioService inventarioService;

    @GetMapping
    public List<Inventario> obtenerInventario() {
        return inventarioService.obtenerInventario();
    }

    @PostMapping
    public ResponseEntity<Inventario> agregarProducto(@RequestBody Inventario inventario) {
        return ResponseEntity.status(HttpStatus.CREATED).body(inventarioService.agregarProducto(inventario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable Long id) {
        inventarioService.eliminarProducto(id);
        return ResponseEntity.noContent().build();
    }
}
