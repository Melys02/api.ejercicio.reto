package grupo.api.rest.api.ejercicio.reto.cotroller;

import grupo.api.rest.api.ejercicio.reto.modelos.Orden;
import grupo.api.rest.api.ejercicio.reto.service.OrdenService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/ordenes")
public class OrdenController {

    @Autowired
    private OrdenService ordenService;

    @GetMapping
    public List<Orden> obtenerOrdenes() {
        return ordenService.obtenerOrdenes();
    }

    @PostMapping
    public ResponseEntity<Orden> agregarOrden(@RequestBody Orden orden) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ordenService.agregarOrden(orden));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarOrden(@PathVariable Long id) {
        ordenService.eliminarOrden(id);
        return ResponseEntity.noContent().build();
    }
}
