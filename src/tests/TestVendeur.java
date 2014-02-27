package tests;
import bestdeal.dao.VendeurDAO;
import bestdeal.entities.Vendeur;
public class TestVendeur {

    public static void main(String[] args) {
        Vendeur vendeur= new Vendeur("souplesse", 15, "sfsdfs", "sdljsdfù","ll","sdf");
        VendeurDAO dAO= new VendeurDAO();
        dAO.insertVendeur(vendeur);
        System.out.println("la liste est"+dAO.DisplayAllVendeur()); 
    }

}
