/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.reto3.repositorios;

import co.edu.usa.reto3.modelo.Message;
import co.edu.usa.reto3.repositorios.crud.MessageCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository
public class MessageRepository {
    @Autowired
    private MessageCrudRepository crud;
    
    public List<Message> getAll(){
        return (List<Message>) crud.findAll();
    }
    public Optional<Message> getById(int id){
        return crud.findById(id);
    }

    public Message save(Message Message){
        return crud.save(Message);
    }
    public void delete(Message Message){
       crud.delete(Message);
    }
    
}
