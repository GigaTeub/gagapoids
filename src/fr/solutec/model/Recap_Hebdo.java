
package fr.solutec.model;

import java.util.Date;


public class Recap_Hebdo {
    private int id;
    private String intitule;
    private boolean reussite;
    private Date semaine;
    private User user;

    public Recap_Hebdo() {
    }

    public Recap_Hebdo(int id, String intitule, boolean reussite, Date semaine, User user) {
        this.id = id;
        this.intitule = intitule;
        this.reussite = reussite;
        this.semaine = semaine;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public boolean isReussite() {
        return reussite;
    }

    public void setReussite(boolean reussite) {
        this.reussite = reussite;
    }

    public Date getSemaine() {
        return semaine;
    }

    public void setSemaine(Date semaine) {
        this.semaine = semaine;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Recap_Hebdo{" + "id=" + id + ", intitule=" + intitule + ", reussite=" + reussite + ", semaine=" + semaine + ", user=" + user + '}';
    }
    
    
}
