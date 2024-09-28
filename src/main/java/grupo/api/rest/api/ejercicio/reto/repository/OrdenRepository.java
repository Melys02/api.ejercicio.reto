package grupo.api.rest.api.ejercicio.reto.repository;

import grupo.api.rest.api.ejercicio.reto.modelos.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenRepository extends JpaRepository<Orden, Long> {
}