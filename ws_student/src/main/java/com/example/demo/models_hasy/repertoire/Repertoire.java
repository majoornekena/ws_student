package com.example.demo.models_hasy.repertoire;

import annotation.DBAnnotation;
import persistence.ObjectBdd;

@DBAnnotation.Table(name = "repertoire")
public class Repertoire extends ObjectBdd {
    @DBAnnotation.Id
    public int id_repertoire;
    @DBAnnotation.Column
    public int id_etudiant;
    @DBAnnotation.Column
    String nom_repertoire;

    public int getId_repertoire() {
        return id_repertoire;
    }

    public void setId_repertoire(int id_repertoire) {
        this.id_repertoire = id_repertoire;
    }

    public int getId_etudiant() {
        return id_etudiant;
    }

    public void setId_etudiant(int id_etudiant) {
        this.id_etudiant = id_etudiant;
    }

    public String getNom_repertoire() {
        return nom_repertoire;
    }

    public void setNom_repertoire(String nom_repertoire) {
        this.nom_repertoire = nom_repertoire;
    }

    @Override
    public String toString() {
        return "Repertoire{" +
                "id_repertoire=" + id_repertoire +
                ", id_etudiant=" + id_etudiant +
                ", nom_repertoire='" + nom_repertoire + '\'' +
                '}';
    }
}
