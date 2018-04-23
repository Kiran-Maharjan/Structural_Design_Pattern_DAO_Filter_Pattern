/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingkong.dataabstraction.dao;

import com.kingkong.dataabstraction.entities.Employee;

/*
    --Mediator is created so that it will not be problem in printing log, report, file 
printing in web

*/

/**
 *
 * @author kiran
 */
public class EmployeeMediator {
    
    public static void print(EmployeeDAO empDAO){
        for(Employee e:empDAO.getAll()){
           System.out.println(e.getFirstName()+" "+e.getLastName());
       }
    }
    
   /*
    public static void loadFromFile(String Filename){
        
    }*/
}
