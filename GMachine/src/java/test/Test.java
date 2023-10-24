/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.IDao;
import entities.Machine;
import service.MachineService;


/**
 *
 * @author HP
 */
public class Test {
    public static void main (String [] args){
    
       
            IDao<Machine> dao = new MachineService();
           
            
           
            
            
//            dao.create(new Machine("machine1", "HP", 10000));
//            dao.create(new Machine("machine2", "MAC", 20000));
//            dao.create(new Machine("machine3", "DELL", 30000));
             dao.create(new Machine("machine2", "HP", 1000));
             dao.create(new Machine("machine3", "MAC", 1000));
             dao.create(new Machine("machine4", "DELL", 1000));
//            
//            for(Machine m : dao.findAll())
//                System.out.println(m);  
            
            
       
     
     
     
    }
   
}
