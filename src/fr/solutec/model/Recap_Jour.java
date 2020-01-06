
package fr.solutec.model;

import java.sql.Time;


public class Recap_Jour {
    private int id;
    private String objectif;
    private boolean reussite;
    private Time temps_exo;
    private User user;

    public Recap_Jour() {
    }

    public Recap_Jour(int id, String objectif, boolean reussite, Time temps_exo, User user) {
        this.id = id;
        this.objectif = objectif;
        this.reussite = reussite;
        this.temps_exo = temps_exo;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public boolean isReussite() {
        return reussite;
    }

    public void setReussite(boolean reussite) {
        this.reussite = reussite;
    }

    public Time getTemps_exo() {
        return temps_exo;
    }

    public void setTemps_exo(Time temps_exo) {
        this.temps_exo = temps_exo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Recap_Jour{" + "id=" + id + ", objectif=" + objectif + ", reussite=" + reussite + ", temps_exo=" + temps_exo + ", user=" + user + '}';
    }
    
    
}
