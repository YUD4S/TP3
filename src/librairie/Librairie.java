/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librairie;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author 1808310
 */
public class Librairie {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        Livre[] tabLivre = generationTableau();
        
        for (int i = 0; i < tabLivre.length; i++) {
            System.out.println(tabLivre[i].getAuteur());
            System.out.println("");
        }
    }

    private static Livre[] generationTableau() throws FileNotFoundException, IOException {
        String inputFile = "Livres.data";

        DataInputStream inputStream = new DataInputStream(new FileInputStream(inputFile));
        String stringRead;

        double prix;
        int nb;
        int nombreLivre = 0;
//        System.out.println(inputStream.available());

        while (inputStream.available() > 0) {

            stringRead = inputStream.readUTF(); // titre
            System.out.println(stringRead);

            stringRead = inputStream.readUTF(); // ISBN
            System.out.println(stringRead);

            stringRead = inputStream.readUTF();// nom de l'auteur
            System.out.println(stringRead);

            stringRead = inputStream.readUTF(); // date de naissance et date de parutition
            System.out.println(stringRead);

            stringRead = inputStream.readUTF(); // nom d'éditeur
            System.out.println(stringRead);

            nb = inputStream.readInt(); // nombre de exemplaire
            System.out.println(nb);

            prix = inputStream.readDouble(); // prix unitaire
            System.out.println(prix);

            nombreLivre += 1;
            System.out.println("");
        }

        DataInputStream inputStream2 = new DataInputStream(new FileInputStream(inputFile));

        Livre[] tabLivre = new Livre[nombreLivre];
        Auteur[] tabAuteur = new Auteur[nombreLivre];
        
        
        
        for (int i = 0; i < tabLivre.length; i++) {
            tabLivre[i] = new Livre();
        }
        
        for (int i = 0; i < tabAuteur.length; i++) {
            tabAuteur[i] = new Auteur();
        }

        
        int i = 0;

        while (inputStream2.available() > 0) {

            stringRead = inputStream2.readUTF(); // titre
            tabLivre[i].setTitre(stringRead);

            stringRead = inputStream2.readUTF(); // ISBN
            tabLivre[i].setIsnb(stringRead);

            stringRead = inputStream2.readUTF();// nom de l'auteur
            tabAuteur[i].setNom(stringRead);
            tabLivre[i].setAuteur(tabAuteur[i]);

            stringRead = inputStream2.readUTF(); // date de naissance et date de parutition
            tabLivre[i].setParution(stringRead);
            tabAuteur[i].setDateNaissance(stringRead);

            stringRead = inputStream2.readUTF(); // nom d'éditeur
            tabLivre[i].setEditeur(stringRead);

            nb = inputStream2.readInt(); // nombre de exemplaire
            tabLivre[i].setNbExemplaire(nb);

            prix = inputStream2.readDouble(); // prix unitaire
            tabLivre[i].setPrixUnit(prix);

            i += 1;
//            System.out.println("");
        }
        System.out.println(tabLivre[0].getAuteur());
        return tabLivre;
    }

}
