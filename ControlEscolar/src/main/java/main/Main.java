package main;
import db.*;
import model.Carrera;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license


/**
 *
 * @author Mati
 */
public class Main {

    public static void main(String[] args) {
        try{
        Scanner in = new Scanner(System.in);
        Carrera car = new Carrera();
        DbConnect.loadDriver();
        DbConnect dbConnect = new DbConnect();
        Connection con = dbConnect.getConexion();
        Sql controlEscolar = new Sql(car, con);
        controlEscolar.deleteData(car.getTable(), NULL, con);
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }   
    }
}
