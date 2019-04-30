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
public class Livre {

    private String titre;
    private String editeur;
    private Auteur auteur;
    private String parution;

    private String isnb;
    private double prixUnit;
    private int nExemplaire;

    public Livre() {
    }

    public Livre(String titre, Auteur a, String isnb, String editeur, String parution, double prixUnit, int nExemplaire) {
        this.titre = titre;
        this.editeur = editeur;
        this.parution = parution;
        this.auteur = a;
        this.isnb = isnb;
        this.prixUnit = prixUnit;
        this.nExemplaire = nExemplaire;

    }

    public String getParution() {
        return parution;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public String getEditeur() {
        return editeur;
    }

    public String getIsnb() {
        return isnb;
    }

    public String getTitre() {
        return titre;
    }

    public int getNbExemplaire() {
        return this.nExemplaire;
    }

    public double getPrixUnit() {
        return this.prixUnit;

    }

    public void setNbExemplaire(int nExemplaire) {
        this.nExemplaire = nExemplaire;
    }

    public void setIsnb(String isnb) {
        this.isnb = isnb;
    }

    public void setPrixUnit(double setPrixUnit) {
        this.prixUnit = setPrixUnit;

    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public void setParution(String paru) {
        this.parution = paru;
    }

    public void setEditeur(String praution) {
        this.editeur = praution;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Titre livre : " + getTitre() + "\n"
                + " Editeur : " + getEditeur() + "\n"
                + getAuteur();
    }
}
