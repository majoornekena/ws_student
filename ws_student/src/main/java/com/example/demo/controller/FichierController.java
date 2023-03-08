package com.example.demo.controller;


import com.example.demo.models_hasy.fichiers.Fichier;
import com.example.demo.service.FichierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fichier")
@CrossOrigin
public class FichierController {
    FichierService fs=new FichierService();
    @GetMapping("/{id}")
    public List<Fichier> getAllFichier(@PathVariable(name="id") int id) throws Exception {
        List<Fichier> result=fs.listeFiles(id);
        return result;
    }

    @PostMapping("/ajout")
    public void ajout(@RequestBody List<Fichier> fichier) throws Exception {
        fs.ajouterFichier(fichier);
    }

}
