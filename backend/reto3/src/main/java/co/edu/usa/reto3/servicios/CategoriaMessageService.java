/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.reto3.servicios;

import co.edu.usa.reto3.modelo.CategoriaMessage;
import co.edu.usa.reto3.repositorios.CategoriaMessageRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author IsaacArandiaMT
 */
@Service
public class CategoriaMessageService {
    @Autowired
    private CategoriaMessageRepository categoriaRepository;
    
    public List<CategoriaMessage> getAll(){
        return categoriaRepository.getAll();
    }
    
    public CategoriaMessage save(CategoriaMessage categoria){
        return categoriaRepository.save(categoria);
    }
    
    public CategoriaMessage getById(int id){
        Optional<CategoriaMessage> categoria = categoriaRepository.getById(id);
        return categoria.orElse(new CategoriaMessage());

    }
}