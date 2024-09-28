package grupo.api.rest.api.ejercicio.reto.service;

import grupo.api.rest.api.ejercicio.reto.modelos.Orden;
import grupo.api.rest.api.ejercicio.reto.repository.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenService {

    @Autowired
    private OrdenRepository ordenRepository;

    public List<Orden> obtenerOrdenes() {
        return ordenRepository.findAll();
    }

    public Orden agregarOrden(Orden orden) {
        return ordenRepository.save(orden);
    }

    public void eliminarOrden(Long id) {
        ordenRepository.deleteById(id);
    }
}
