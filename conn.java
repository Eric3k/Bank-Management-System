/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagementsystem;


import java.sql.*;
/**
 *
 * @author sarve
 */
public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///program6","root","");
            s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
