/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librairie;

/**
 *
 * @author AElKharraz
 */
public class Auteur {

    private String nom;
    private String dateNaissance;

    public Auteur() {
    }

    public Auteur(String nom, String dateNaissance) {
        this.nom = nom;
        this.dateNaissance = dateNaissance;

    }

    public String getNom() {
        return nom;
    }

    public String getDateNaissance() {
        return this.dateNaissance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return " nom de l'auteur : " + getNom() + "\n"
                + " prenom de l'auteur : " + getDateNaissance();

    }

}
