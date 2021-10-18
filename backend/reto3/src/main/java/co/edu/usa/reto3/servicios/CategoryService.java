/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.reto3.servicios;

import co.edu.usa.reto3.modelo.Category;
import co.edu.usa.reto3.repositorios.CategoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author henry
 */
@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;
    
    public List<Category> getAll(){
        return categoryRepository.getAll();
    }
    
    public Category save(Category category){
        return categoryRepository.save(category);
    }
    
    public Category getById(int id){
        Optional<Category> category = categoryRepository.getById(id);
        return category.orElse(new Category());
//        if (categoria.isPresent()){
//            return categoria.get();
//        }else{
//            return new Categoria();
//        }
    }
}
