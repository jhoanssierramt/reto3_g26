/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.reto3.web;

import co.edu.usa.reto3.modelo.ProductoMessage;
import co.edu.usa.reto3.servicios.ProductoMessageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juvinao
 */
@RestController
@RequestMapping("/api/productos")
public class ProductoMessageController {
    @Autowired
    private ProductoMessageService productoService;
    
    @GetMapping("/all")
    public List<ProductoMessage> getAll(){
        return productoService.getAll();
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public ProductoMessage save(@RequestBody ProductoMessage producto) {
        return productoService.save(producto);
    }
    
    
}