/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.reto3.servicios;

import co.edu.usa.reto3.modelo.Client;
import co.edu.usa.reto3.repositorios.ClientRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jeison Altamar
 */
@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    
    public List<Client> getAll(){
        return clientRepository.getAll();
    }
    
    public Client save(Client client){
        return clientRepository.save(client);
    }
    
    public Client getById(int id){
        Optional<Client> client = clientRepository.getById(id);
        return client.orElse(new Client());
//        if (client.isPresent()){
//            return client.get();
//        }else{
//            return new Client();
//        }
    }
    
}
