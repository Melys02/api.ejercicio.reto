package grupo.api.rest.api.ejercicio.reto.repository;

import grupo.api.rest.api.ejercicio.reto.modelos.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository extends JpaRepository<Inventario, Long> {
}