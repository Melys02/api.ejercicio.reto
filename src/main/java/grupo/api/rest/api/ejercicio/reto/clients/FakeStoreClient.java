package grupo.api.rest.api.ejercicio.reto.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "fakeStoreClient", url = "https://fakestoreapi.com")
public interface FakeStoreClient {
    @GetMapping("/products")
    List<Producto> obtenerProductos();
}