/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tests;

import bestdeal.dao.DealDAO;
import bestdeal.entities.Deal;
import bestdeal.entities.Vendeur;

public class TestDeal {
    
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Vendeur vendeur= new Vendeur("souplesse", 15, "sfsdfs", "sdljsdfù","ll","sdf");
        Deal deal = new Deal();
        deal.setDateDebut("sdfsd");
        deal.setDateFin("dsfsdf");
        deal.setDescDeal("fgfd");
        deal.setNomDeal("l");
        deal.setPrix(5);
        deal.setQuantite(45);
        deal.setRemise(84);
    
        deal.setV(vendeur);
        DealDAO dAO= new DealDAO();
        dAO.insertDeal(deal);
    }
    
}
