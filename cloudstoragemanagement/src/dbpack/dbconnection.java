/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbpack;

/**
 *
 * @author Lenovo
 */
import java.sql.*;

public class dbconnection 
{
    public dbconnection()
    {
        
    }
    
    public Connection connect()
    {
        Connection con=null;
        try
        {
//            Class.forName("com.mysql.jdbc.Driver");
//            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudstorage","root","root");      for running in local system
            
            
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://ENTER_IP_ADD_OF_SERVER_PC_:3306/cloudstorage","root","root");    //For SERVER Connection
            
        }
        catch(Exception e)
        {
            
        }
        
        return con;
    }
    
}
