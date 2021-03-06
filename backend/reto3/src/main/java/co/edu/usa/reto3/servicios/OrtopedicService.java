/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.reto3.servicios;

import co.edu.usa.reto3.modelo.Ortopedic;
import co.edu.usa.reto3.repositorios.OrtopedicRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author henry
 */
@Service
public class OrtopedicService {
    
    @Autowired
    private OrtopedicRepository OrtopedicRepository;
    
    public List<Ortopedic> getAll(){
        return OrtopedicRepository.getAll();
    }
    
    public Ortopedic save(Ortopedic Ortopedic){
        return OrtopedicRepository.save(Ortopedic);
    }
    
    public Ortopedic getById(int id){
        Optional<Ortopedic> Ortopedic = OrtopedicRepository.getById(id);
        return Ortopedic.orElse(new Ortopedic());
//        if (categoria.isPresent()){
//            return categoria.get();
//        }else{
//            return new Categoria();
//        }
    }
}
