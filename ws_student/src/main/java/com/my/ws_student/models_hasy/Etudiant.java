package com.my.ws_student.models_hasy;

import annotation.DBAnnotation;
import persistence.ObjectBdd;

import java.sql.Date;

@DBAnnotation.Table(name="etudiant")
public class Etudiant extends ObjectBdd {

    @DBAnnotation.Id
    private int idEtudiant;
    @DBAnnotation.Column
    private String Nom;
    @DBAnnotation.Column
    private String Prenom;
    @DBAnnotation.Column
    private String Email;
    @DBAnnotation.Column
    private String motdepasse;
    @DBAnnotation.Column
    private Date DateNaissance;
    @DBAnnotation.Column
    private Date DateInscription;
    @DBAnnotation.Column
    private String CarteEtudiant;

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public Date getDateNaissance() {
        return DateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        DateNaissance = dateNaissance;
    }

    public Date getDateInscription() {
        return DateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        DateInscription = dateInscription;
    }

    public String getCarteEtudiant() {
        return CarteEtudiant;
    }

    public void setCarteEtudiant(String carteEtudiant) {
        CarteEtudiant = carteEtudiant;
    }
}