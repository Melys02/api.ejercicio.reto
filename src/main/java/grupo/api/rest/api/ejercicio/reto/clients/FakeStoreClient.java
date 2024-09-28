package grupo.api.rest.api.ejercicio.reto.clients;

import grupo.api.rest.api.ejercicio.reto.modelos.Producto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "fakeStoreClient", url = "https://fakestoreapi.com")
public interface FakeStoreClient {
    @GetMapping("/products")
    List<Producto> obtenerProductos();
}