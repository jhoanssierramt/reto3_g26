/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.reto3.repositorios;

import co.edu.usa.reto3.modelo.ProductoMessage;
import co.edu.usa.reto3.repositorios.crud.ProductoMessageCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author IsaacArandiaMT
 */
@Repository
public class ProductoMessageRepository {
    @Autowired
    private ProductoMessageCrudRepository repo;
    
    public List<ProductoMessage> getAll(){
        return (List<ProductoMessage>) repo.findAll();
    }
    
    public List<ProductoMessage> getByIdCategoria(int idCategoria) {
        return (List<ProductoMessage>) repo.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }
    
    public Optional<ProductoMessage> getById(int id) {
        return repo.findById(id);
    }
    
    public ProductoMessage save(ProductoMessage producto){
        return repo.save(producto);
    }
    
}
