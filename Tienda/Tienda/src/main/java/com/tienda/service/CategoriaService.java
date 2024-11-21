
package com.tienda.service;
import com.tienda.domain.Categoría;
import java.util.List;

public interface CategoriaService {
     // Se obtiene un listado de categorias en un List
    public List<Categoría> getCategorias(boolean activos);
    
}
