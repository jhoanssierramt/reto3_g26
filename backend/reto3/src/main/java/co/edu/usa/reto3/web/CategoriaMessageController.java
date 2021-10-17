/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.reto3.web;

import co.edu.usa.reto3.modelo.CategoriaMessage;
import co.edu.usa.reto3.servicios.CategoriaMessageService;
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
 * @author IsaacArandiaMT
 */
@RestController
@RequestMapping("/api/categorias")
public class CategoriaMessageController {
    
    @Autowired
    private CategoriaMessageService categoriaService;
    
    @GetMapping("/all")
    public List<CategoriaMessage> getAll(){
        return categoriaService.getAll();
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public CategoriaMessage save(@RequestBody CategoriaMessage categoria){
        return categoriaService.save(categoria);
    }
    
}