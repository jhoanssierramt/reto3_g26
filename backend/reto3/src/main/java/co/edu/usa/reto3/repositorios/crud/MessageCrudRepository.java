/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.usa.reto3.repositorios.crud;

import co.edu.usa.reto3.modelo.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Usuario
 */
public interface MessageCrudRepository extends CrudRepository<Message,Integer>{
  
}
