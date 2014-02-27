
package bestdeal.dao;

import bestdeal.entities.Deal;
import bestdeal.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DealDAO {


    public void insertDeal(Deal st){
           // DepotDAO depdao=new DepotDAO();

         String requete = "insert into deal (nomDeal,descDeal,prix,remise,dateDebut,dateFin,nomVendeur, quantite) values (?,?,?,?,?,?,?,?)";
        try { //dep=depdao.findDepotById(st.getDepot().getId_dep());
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, st.getNomDeal());
            ps.setString(2, st.getDescDeal());
            ps.setFloat(3,st.getPrix() );
            ps.setFloat(4,st.getRemise() );
            ps.setString(5, st.getDateDebut());
            ps.setString(6, st.getDateFin());
           ps.setString(7, st.getV().getNomVendeur());
            ps.setInt(8, st.getQuantite());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

    public void updateDeal(Deal st){
        String requete = "update deal set nomDeal=?, descDeal=?, prix=? , remise=?,dateDebut=?,dateFin=?,nomVendeur=?, quantite=?,idDeal=?,  where idDeal=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, st.getNomDeal());
            ps.setString(2, st.getDescDeal());
            ps.setFloat(3,st.getPrix() );
            ps.setFloat(4,st.getRemise() );
            ps.setString(5, st.getDateDebut());
            ps.setString(6, st.getDateFin());
            ps.setString(7, st.getV().getNomVendeur());
            ps.setInt(8, st.getQuantite());
            ps.setInt(9, st.getIdDeal());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }

     public void deleteDeal(int num){

          String requete = "delete from deal where idDeal=?";
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


      public Deal findDealByNum(int num){

        String requete = "select * from deal where idDeal=?";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ResultSet resultat = ps.executeQuery();
        DealDAO depotDAO = new DealDAO();
        Deal st = new Deal();
        while (resultat.next()){

             ps.setString(1, st.getNomDeal());
            ps.setString(2, st.getDescDeal());
            ps.setFloat(3,st.getPrix() );
            ps.setFloat(4,st.getRemise() );
            ps.setString(5, st.getDateDebut());
            ps.setString(6, st.getDateFin());
            ps.setString(7, st.getV().getNomVendeur());
            ps.setInt(8, st.getQuantite());
            ps.setInt(9, st.getIdDeal());
            
            
        }
        return st;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }

       public List<Deal> DisplayAllDeals (){

  List<Deal> listedeal = new ArrayList<Deal>();

        String requete = "select * from deal";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                Deal stock = new Deal();
                stock.setIdDeal(resultat.getInt(1));
                stock.setNomDeal(resultat.getString(2));
                stock.setDescDeal(resultat.getString(3));
                 stock.setPrix(resultat.getFloat(4));
                stock.setRemise(resultat.getFloat(5));
                stock.setDateDebut(resultat.getString(6));
                stock.setDateFin(resultat.getString(7));
               // stock.setV(resultat.getObject(8, Vendeur));
                stock.setPrix(resultat.getFloat(9));
                
                
                
                
                listedeal.add(stock);
            }
            return listedeal;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }


}