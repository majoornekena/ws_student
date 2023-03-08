package com.example.demo.service;

import com.example.demo.models_hasy.repertoire.Repertoire;

import java.util.List;

public class RepertoireService {
    public List<Repertoire> listeRepertoire(int id_repertoire) throws Exception{
        List<Repertoire> repertoires=new Repertoire().findAllFromView("select * from sous_repertoire_view where id_repertoire="+id_repertoire);
        return repertoires;
    }



    public static void main(String p[]) throws Exception {
        Repertoire re=new Repertoire();
        for (Repertoire r: new RepertoireService().listeRepertoire(1)){
            System.out.println(r);
        }
    }


    public void nouveauDossier(Repertoire repertoire) throws Exception {
        repertoire.save();
    }
}
