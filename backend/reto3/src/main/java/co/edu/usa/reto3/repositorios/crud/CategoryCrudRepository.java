/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.usa.reto3.repositorios.crud;

import co.edu.usa.reto3.modelo.Category;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author henry
 */
public interface CategoryCrudRepository extends CrudRepository<Category,Integer> {
    
}
