/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.reto3.repositorios.crud;

import co.edu.usa.reto3.modelo.ProductoMessage;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author IsaacArandiaMT
 */
public interface ProductoMessageCrudRepository extends CrudRepository<ProductoMessage, Integer> {
    
    @Query(value="select * from productos where categoria_id = ? order by nombre ASC", nativeQuery = true)
    public List<ProductoMessage> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    
}