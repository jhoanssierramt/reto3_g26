/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.reto3.repositorios;

import co.edu.usa.reto3.modelo.Ortopedic;
import co.edu.usa.reto3.repositorios.crud.OrtopedicCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author henry
 */
@Repository
public class OrtopedicRepository {
    
    @Autowired
    private OrtopedicCrudRepository crud;
    public List<Ortopedic> getAll(){
        return (List<Ortopedic>) crud.findAll();
    }
    public Optional<Ortopedic> getById(int id){
        return crud.findById(id);
    }

    public Ortopedic save(Ortopedic Ortopedic){
        return crud.save(Ortopedic);
    }
    public void delete(Ortopedic Ortopedic){
       crud.delete(Ortopedic);
    }
    
}
