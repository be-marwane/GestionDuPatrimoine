package com.example.mesi.equipe5.gestionMonuments.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.mesi.equipe5.gestionMonuments.Model.Monument;
import com.example.mesi.equipe5.gestionMonuments.repository.MonumentRepository;

@Controller
@RequestMapping("/monument")
public class MonumentController {
	
	@Autowired
    MonumentRepository monumentRepository ;
    
    //METHODE GET 
    
     @RequestMapping("/{id}")
     @ResponseBody
     public Monument getMonument(@PathVariable("id") Long id) {
         
         return monumentRepository.findById(id).get();
     }

     @RequestMapping("/all")
     @ResponseBody
     public Iterable<Monument> getMonuments() {
         
         return monumentRepository.findAll();}
     
     @RequestMapping(value = "/ajouter",method = RequestMethod.POST)
     @ResponseBody
     public Monument setMonument(@RequestBody Monument m) {
         
         return monumentRepository.save(m);}
     
     @RequestMapping(value = "/modifier", method = RequestMethod.PUT)
     @ResponseBody
     public Monument changeMonument(@RequestBody Monument m) {
         
         return monumentRepository.save(m);}
     
   //METHODE DELETE
     
     @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
     @ResponseBody
     public void deleteMonument(@PathVariable("id") Long id) {
         Monument result = monumentRepository.findById(id).get();
         monumentRepository.delete(result);
     }
     
     
	

}
