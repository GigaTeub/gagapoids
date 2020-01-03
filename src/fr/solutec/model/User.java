
package fr.solutec.model;

import java.util.Date;


public class User {
    private int id;
    private String nom;
    private String prenom;
    private String mail;
    private String mdp;
    private int age;
    private double poids;
    private double taille;
    private String sexe;
    private Date date_deco;

    public User() {
    }

    public User(String nom, String prenom, String mail, String mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.mdp = mdp;
    }

    public User(String nom, String prenom, String mail, String mdp, int age, double poids, double taille, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.mdp = mdp;
        this.age = age;
        this.poids = poids;
        this.taille = taille;
        this.sexe = sexe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Date getDate_deco() {
        return date_deco;
    }

    public void setDate_deco(Date date_deco) {
        this.date_deco = date_deco;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", mdp=" + mdp + ", age=" + age + ", poids=" + poids + ", taille=" + taille + ", sexe=" + sexe + ", date_deco=" + date_deco + '}';
    }
    
    
    
}
