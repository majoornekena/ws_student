package com.my.ws_student.models_hasy;

import annotation.DBAnnotation;
import persistence.ObjectBdd;

@DBAnnotation.Table(name="etudiant")
public class Etudiant extends ObjectBdd {
    @DBAnnotation.Id
    int id_etudiant;
    @DBAnnotation.Column
    String nom_etudiant;

    public int getId_etudiant() {
        return id_etudiant;
    }

    public void setId_etudiant(int id_etudiant) {
        this.id_etudiant = id_etudiant;
    }

    public String getNom_etudiant() {
        return nom_etudiant;
    }

    public void setNom_etudiant(String nom_etudiant) {
        this.nom_etudiant = nom_etudiant;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id_etudiant=" + id_etudiant +
                ", nom_etudiant='" + nom_etudiant + '\'' +
                '}';
    }
}