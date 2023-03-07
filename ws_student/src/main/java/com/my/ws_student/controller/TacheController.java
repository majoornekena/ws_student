package com.example.demo.controller;

import com.example.demo.models.community.Publication;
import com.example.demo.models.projects.Projet;
import com.example.demo.models.projects.Tache;
import com.example.demo.utils.ToJsonData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tache")
@CrossOrigin(methods = {RequestMethod.DELETE, RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.OPTIONS})
public class TacheController {

    Tache t = new Tache();

    @GetMapping("/pourcentage/{id}")
    public double getPourcentageTache(@PathVariable int id) throws Exception {
        double result = t.getSousTachesTermineesPourcentage(id);
        return result;
    }

    @PostMapping("/recherche")
    public ResponseEntity<List<Object[]>> recherche(@RequestParam("motcle") String motcle, @RequestParam("dateplanning") String dateplanning) throws Exception
    {
        return new ResponseEntity<List<Object[]>>(t.rechercheParMotCle(motcle,dateplanning),HttpStatus.OK);
    }

}
