/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.reto3.repositorios;

import co.edu.usa.reto3.modelo.CategoriaMessage;
import co.edu.usa.reto3.repositorios.crud.CategoriaMessageCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author juvinao
 */
@Repository
public class CategoriaMessageRepository {
    @Autowired
    private CategoriaMessageCrudRepository repo;
    
    public List<CategoriaMessage> getAll(){
        return (List<CategoriaMessage>)repo.findAll();
    }
    
    public Optional<CategoriaMessage> getById(int id) {
        return repo.findById(id);
    }
    
    public CategoriaMessage save(CategoriaMessage categoria){
        return repo.save(categoria);
    }
}