/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.reto3.servicios;

import co.edu.usa.reto3.modelo.Message;
import co.edu.usa.reto3.repositorios.MessageRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class MessageService {
    @Autowired
    private MessageRepository MessageRepository;
    
    public List<Message> getAll(){
        return MessageRepository.getAll();
    }
    
    public Message save(Message Message){
        return MessageRepository.save(Message);
    }
    
    public Message getById(int id){
        Optional<Message> Message = MessageRepository.getById(id);
        return Message.orElse(new Message());
//        if (client.isPresent()){
//            return client.get();
//        }else{
//            return new Client();
//        }
    }
    
}
