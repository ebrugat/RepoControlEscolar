/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import model.Carrera;
/**
 *
 * @author Mati
 */
public class Sql {
    
    private Carrera car;
    private Connection conexion;

    public Sql(){}
    public Sql(Carrera car, Connection conexion) {
        setCar(car);
        setConexion(conexion);
    }
 
    public static void deleteData(String table, int id, Connection con){
        try {
            String SQLQuery = "DELETE FROM " + table + " WHERE id = ?";
            PreparedStatement pt = con.prepareStatement(SQLQuery);
            pt.setInt(1, id);
            int filasAfectadas = pt.executeUpdate();
            System.out.println("Insertado, columnas eliminada: " + filasAfectadas);
            pt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  /*public static void updateData(String nombreAntiguo, String nombreNuevo) {       
        
       try {
            String query = "UPDATE " + table + " SET nombreAntiguo = ? WHERE id = ?";
            // Prepare the SQL statement
            PreparedStatement pt = con.prepareStatement(query);
            pt.setInt(1, id);
            pt.setString(2, nombreNuevo);
            pt.executeUpdate();
            System.out.println("Datos actualizados correctamente3.");
            pt.close();
        } catch (SQLException e) {
            System.err.println("Error actualizando los datos: " + e.getMessage());
        }
    }*/
    public Carrera getCar() {
        return car;
    }

    public void setCar(Carrera car) {
        this.car = car;
    }

    public Connection getCon(){
        return conexion;
    }
            
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
}
