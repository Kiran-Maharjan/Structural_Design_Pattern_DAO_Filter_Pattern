/*--Data Access--CRUD operation
Structural design patterns are concerned with how classes and objects can be composed
, to form larger structures.

The structural design patterns simplifies the structure by identifying the 
relationships.


These patterns focus on, how the classes inherit from each other and how they are 
composed from other classes.
----
    DAO acts as backend.. 

*/
/*
** *****************kiranmaharjan8888@gmail.com

 */
package com.kingkong.dataabstraction;


import com.kingkong.dataabstraction.dao.EmployeeDAO;
import com.kingkong.dataabstraction.dao.EmployeeMediator;
import com.kingkong.dataabstraction.entities.Employee;
import com.kingkong.dataabstraction.impl.EmployeeDAOimpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kiran
 */
public class Program {

    public static void main(String[] args) {
     
        EmployeeDAO empDAO=new EmployeeDAOimpl();
//--1. Create List ###############################################
     System.out.println("Create---------");
        empDAO.insert(new Employee(0, "Kriti", "Maharjan",'F',true));
        empDAO.insert(new Employee(1, "Ashish", "Maharjan",'M', true));
        empDAO.insert(new Employee(2, "Beekesh", "Maharjan",'M', true));        

        
        
     //--2.Retrive getting all records--###############################
        System.out.println("Retrive---------");
        EmployeeMediator.print(empDAO);

     
     //--3.Update --##################################
        System.out.println("Updated------------");
        //empDAO.update(new Employee(0, "Amooda","" ,' ', null));
        Employee emp=empDAO.getById(0);
        emp.setFirstName("Amooda");
                EmployeeMediator.print(empDAO);

        
     //--4.Delete---#################################
        System.out.println("Delete-------");
        empDAO.delete(2);
                EmployeeMediator.print(empDAO);

    
    }
}
