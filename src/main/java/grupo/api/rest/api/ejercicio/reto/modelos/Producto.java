package grupo.api.rest.api.ejercicio.reto.modelos;

import lombok.Data;

@Data
public class Producto {
    private Long id;
    private String title;
    private String price;
    private String description;
    private String category;
    private String image;
}
