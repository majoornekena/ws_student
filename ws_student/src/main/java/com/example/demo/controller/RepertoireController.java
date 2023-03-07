package com.example.demo.controller;


import com.example.demo.models_hasy.repertoire.Repertoire;
import com.example.demo.service.RepertoireService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/repertoire")
@CrossOrigin
public class RepertoireController {
    RepertoireService rs=new RepertoireService();
    @GetMapping("/{id}")
    public List<Repertoire> getAllRepertoire(@PathVariable(name="id") int id) throws Exception {
        List<Repertoire> result=rs.listeRepertoire(id);
        return result;
    }
    @PostMapping("/nouveau")
    public void ajout(@RequestBody Repertoire repertoire) throws Exception {
        rs.nouveauDossier(repertoire);
    }
}
