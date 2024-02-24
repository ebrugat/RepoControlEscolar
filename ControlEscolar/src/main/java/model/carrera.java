/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Mati
 */
public class Carrera {
    private static final String TABLE_NAME = "carreras";
    private String nombre;
    private String table; 
    int id;
    
    public Carrera(){
        setTable(TABLE_NAME);
    }
    public Carrera(int idp, String nombrep){
        setId(idp);
        setNombre(nombrep);
        setTable(TABLE_NAME);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getTable(){
        return table;
    }
    
    public void setTable(String table){
        this.table = table;
    }
}
