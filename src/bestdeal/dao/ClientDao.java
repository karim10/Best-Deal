package bestdeal.dao;

import bestdeal.entities.Client;
import bestdeal.util.MyConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientDao {
    
    public void insertClient(Client cl){
           // DepotDAO depdao=new DepotDAO();

         String requete = "insert into client (id,nom,prenom,username,pwd,mail,code_postal,adresse,ville,date_naissance)  values (?,?,?,?,?,?,?,?,?,?)";
        try { //dep=depdao.findDepotById(st.getDepot().getId_dep());
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,cl.getId());
            ps.setString(2,cl.getNom());
            ps.setString(3,cl.getPrenom());
            ps.setString(4,cl.getUsername());
            ps.setString(5,cl.getPwd());
            ps.setString(6,cl.getMail());
            ps.setString(7,cl.getCode_postal());
            ps.setString(8,cl.getAdresse());
            ps.setString(9,cl.getVille());
            ps.setDate(10, (Date) cl.getDate_naissance());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
    public void deleteClient(int id){
        String requete = "delete from Client where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Client supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
    public Client findClient(String username,String pwd){
    Client client = new Client();
     String requete = "select * from client where username = ? and pwd = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, username);
            ps.setString(2, pwd);
            ResultSet resultat = ps.executeQuery();
            while(resultat.next())
            {
                client.setId(resultat.getInt(1));
                client.setNom(resultat.getString(2));
                client.setPrenom(resultat.getString(3));
                client.setUsername(resultat.getString(4));
                client.setPwd(resultat.getString(5));
                client.setMail(resultat.getString(6));
                client.setCode_postal(resultat.getString(7));
                client.setAdresse(resultat.getString(8));
                client.setVille(resultat.getString(9));
                client.setDate_naissance(resultat.getDate(10));
                
            }
            return client;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du client "+ex.getMessage());
            return null;
        }
    }

    public boolean findClient(String login, char[] pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
