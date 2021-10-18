/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.reto3.repositorios;

import co.edu.usa.reto3.modelo.Client;
import co.edu.usa.reto3.repositorios.crud.ClientCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jeison Altamar
 */
@Repository
public class ClientRepository {
    @Autowired
    private ClientCrudRepository crud;
    
    public List<Client> getAll(){
        return (List<Client>) crud.findAll();
    }
    public Optional<Client> getById(int id){
        return crud.findById(id);
    }

    public Client save(Client Client){
        return crud.save(Client);
    }
    public void delete(Client Client){
       crud.delete(Client);
    }
}
