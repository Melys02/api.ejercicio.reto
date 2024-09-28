package grupo.api.rest.api.ejercicio.reto.service;

import grupo.api.rest.api.ejercicio.reto.clients.FakeStoreClient;
import grupo.api.rest.api.ejercicio.reto.modelos.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private FakeStoreClient fakeStoreClient;

    public List<Producto> obtenerProductos() {
        return fakeStoreClient.obtenerProductos();
    }
}