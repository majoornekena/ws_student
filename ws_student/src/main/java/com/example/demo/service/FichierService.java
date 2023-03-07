package com.example.demo.service;

import com.example.demo.models_hasy.fichiers.Fichier;

import java.util.List;

public class FichierService {
    public void ajouterFichier(Fichier fichier) throws Exception{
        fichier.save();
    }
    public void ajouterFichier(List<Fichier> fichiers) throws Exception{
        for (Fichier f: fichiers){
            f.save();
        }
    }

    public List<Fichier> listeFiles(int id) throws Exception {
        Fichier f=new Fichier();
        List<Fichier> results=f.findAllWhere("where id_repertoire="+f);
        return results;
    }
}
