package com.example.demo.models_hasy.fichiers;

import annotation.DBAnnotation;
import com.example.demo.models_hasy.Etudiant;
import com.example.demo.models_hasy.repertoire.Repertoire;
import persistence.ObjectBdd;

@DBAnnotation.Table(name="fichier")
public class Fichier extends ObjectBdd {
    @DBAnnotation.Id
    int id_fichier;
    @DBAnnotation.Column
    String  nom_fichier;
    @DBAnnotation.Column
    int id_etudiant;
    @DBAnnotation.Column
    String value;
    @DBAnnotation.Column
    int id_repertoire;

    @DBAnnotation.FK(id = "id_etudiant")
    Etudiant etudiant;
    @DBAnnotation.FK(id="id_repertoire")
    Repertoire repertoire;

    public int getId_fichier() {
        return id_fichier;
    }

    public void setId_fichier(int id_fichier) {
        this.id_fichier = id_fichier;
    }

    public String getNom_fichier() {
        return nom_fichier;
    }

    public void setNom_fichier(String nom_fichier) {
        this.nom_fichier = nom_fichier;
    }

    public int getId_etudiant() {
        return id_etudiant;
    }

    public void setId_etudiant(int id_etudiant) {
        this.id_etudiant = id_etudiant;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId_repertoire() {
        return id_repertoire;
    }

    public void setId_repertoire(int id_repertoire) {
        this.id_repertoire = id_repertoire;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Repertoire getRepertoire() {
        return repertoire;
    }

    public void setRepertoire(Repertoire repertoire) {
        this.repertoire = repertoire;
    }

    @Override
    public String toString() {
        return "Fichier{" +
                "id_fichier=" + id_fichier +
                ", nom_fichier='" + nom_fichier + '\'' +
                ", id_etudiant=" + id_etudiant +
                ", value='" + value + '\'' +
                ", id_repertoire=" + id_repertoire +
                '}';
    }
}
