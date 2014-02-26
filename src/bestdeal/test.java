/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bestdeal;

import bestdeal.dao.ClientDao;
import bestdeal.entities.Client;
import java.util.Date;

/**
 *
 * @author KarimBY
 */
public class test {
    
    public static void main(String[] args) 
    {Client cl=new Client (3,"qsd","qsd","karim","C@32fe621e","qsffs","qsf","qsdf","afss",null);
    ClientDao ClientDao=new ClientDao();
    ClientDao.insertClient(cl);
    //ClientDao.deleteClient(1);
        System.out.println(ClientDao.findClient("karim","karim"));
    if (ClientDao.findClient("karim","karim").equals(cl)) 
        System.out.println("karim");
            
            else System.out.println("vide");
        
    }   
    
}
