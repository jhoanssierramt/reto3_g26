/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.reto3.repositorios;

import co.edu.usa.reto3.modelo.Category;
import co.edu.usa.reto3.repositorios.crud.CategoryCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author henry
 */
@Repository
public class CategoryRepository {
  
    @Autowired
    private CategoryCrudRepository crud;
    public List<Category> getAll(){
        return (List<Category>) crud.findAll();
    }
    public Optional<Category> getById(int id){
        return crud.findById(id);
    }

    public Category save(Category Category){
        return crud.save(Category);
    }
    public void delete(Category Category){
       crud.delete(Category);
    }
    
}
