package grupo.api.rest.api.ejercicio.reto.service;

import grupo.api.rest.api.ejercicio.reto.modelos.Inventario;
import grupo.api.rest.api.ejercicio.reto.repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    public List<Inventario> obtenerInventario() {
        return inventarioRepository.findAll();
    }

    public Inventario agregarProducto(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    public void eliminarProducto(Long id) {
        inventarioRepository.deleteById(id);
    }
}