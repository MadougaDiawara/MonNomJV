/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package monnom;
import java.util.Scanner;
/**
*
* @author Madouga Diawara Groupe
*/
public class MonNom {
    
    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez votre nom : ");
    String nom = sc.nextLine();
    System.out.println("Entrez votre prénom : ");
    String prenom = sc.nextLine();
    System.out.println(prenom + " " + nom);
    }
}