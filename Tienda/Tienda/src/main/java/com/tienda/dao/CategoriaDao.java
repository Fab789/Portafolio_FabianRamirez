
package com.tienda.dao;
import com.tienda.domain.Categoría;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository <Categoría,Long> {
    
}
