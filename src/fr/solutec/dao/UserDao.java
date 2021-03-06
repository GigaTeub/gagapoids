
package fr.solutec.dao;

import fr.solutec.model.User;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class UserDao {
    public static User getByLoginAndPass(String log, String mdp) throws SQLException{
        User u = null;
        String sql = "SELECT * FROM user WHERE mail=? AND mdp=?";
        Connection connexion = AccessDB.getConnection();
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, log);
        requete.setString(2, mdp);
        ResultSet rs = requete.executeQuery();
        if(rs.next()){
            u = new User();
            u.setId(rs.getInt("idUser"));
            u.setNom(rs.getString("nom"));
            u.setPrenom(rs.getString("prenom"));
            u.setMail(rs.getString("mail"));
        }
        return u;
    }
    
    public static void inscription(User personne) throws SQLException{
        String sql = "INSERT INTO user (nom, prenom, mail, mdp) VALUES (?, ?, ?, ?)";
        Connection connexion = AccessDB.getConnection();
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, personne.getNom());
        requete.setString(2, personne.getPrenom());
        requete.setString(3, personne.getMail());
        requete.setString(4, personne.getMdp());
        requete.execute();
        
    
        
    }
    
}
