/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.reto3.servicios;

import co.edu.usa.reto3.modelo.ProductoMessage;
import co.edu.usa.reto3.repositorios.ProductoMessageRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author IsaacArandiaMT
 */
@Service
public class ProductoMessageService {
    @Autowired
    private ProductoMessageRepository productoRepository;
    
    public List<ProductoMessage> getAll(){
        return productoRepository.getAll();
    }
    
    public ProductoMessage getById(int id){
        Optional<ProductoMessage> producto = productoRepository.getById(id);
        return producto.orElse(new ProductoMessage());
    }
    
    public ProductoMessage save(ProductoMessage producto){
        return productoRepository.save(producto);
    }
}