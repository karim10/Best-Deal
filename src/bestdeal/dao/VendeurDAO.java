/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bestdeal.dao;

import bestdeal.entities.Vendeur;
import bestdeal.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Karray
 */
public class VendeurDAO {


    public void insertVendeur(Vendeur st){
           // DepotDAO depdao=new DepotDAO();

         String requete = "insert into vendeur (nomVendeur,numPermission,datePermission,userName,pswd,mail) values (?,?,?,?,?,?)";
        try { //dep=depdao.findDepotById(st.getDepot().getId_dep());
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, st.getNomVendeur());
            ps.setInt(2, st.getNumPersmission());
            ps.setString(3,st.getDatePermission() );
            ps.setString(4,st.getUsername() );
            ps.setString(5, st.getPswd());
            ps.setString(6, st.getMail());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

    public void updateVendeur(Vendeur st){
        String requete = "update vendeur set nomVendeur=?, numPermission=?, datePermission=? , userName=?,pswd=?,mail=?,  where idVendeur=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
           ps.setString(1, st.getNomVendeur());
            ps.setInt(2, st.getNumPersmission());
            ps.setString(3,st.getDatePermission() );
            ps.setString(4,st.getUsername() );
            ps.setString(5, st.getPswd());
            ps.setString(6, st.getMail());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }

     public void deleteVendeur(int num){

          String requete = "delete from vendeur where idVendeur=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, num);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


      public Vendeur findVendeurByNum(int num){

        String requete = "select * from vendeur where idVendeur=?";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ResultSet resultat = ps.executeQuery();
        Vendeur st = new Vendeur();
        while (resultat.next()){

             ps.setString(1, st.getNomVendeur());
            ps.setInt(2, st.getNumPersmission());
            ps.setString(3,st.getDatePermission() );
            ps.setString(4,st.getUsername() );
            ps.setString(5, st.getPswd());
            ps.setString(6, st.getMail());
            ps.setInt(7, st.getIdVendeur());
            
            
        }
        return st;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }

    public List<Vendeur> DisplayAllVendeur (){


        List<Vendeur> listevendeur = new ArrayList<Vendeur>();

        String requete = "select * from vendeur";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                Vendeur stock = new Vendeur();
                stock.setIdVendeur(resultat.getInt(1));
                stock.setNomVendeur(resultat.getString(2));
                stock.setNumPersmission(resultat.getInt(3));
                stock.setDatePermission(resultat.getString(4));
                stock.setUsername(resultat.getString(5));
                stock.setPswd(resultat.getString(6));
                stock.setMail(resultat.getString(7));
                
                
                
                
                listevendeur.add(stock);
            }
            return listevendeur;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }


}