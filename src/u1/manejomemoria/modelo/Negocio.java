/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1.manejomemoria.modelo;

import java.util.ArrayList;

/**
 *
 * @author Boris Perez
 */
public class Negocio {
    
    private ArrayList<Persona> personas;
    private int indice;
    
    public Negocio(){
        personas = new ArrayList<Persona>();
        
    }
    
    public int obtenerCantidadPersonas(){
        return personas.size();
    }
    
    public String crearPersona(String nombre, int edad){
        Persona p = new Persona();
        p.setNombre(nombre);
        p.setEdad(edad);
        
        int random = (int)(Math.random()*1000);
        p.setId(""+random);
        
        personas.add(p);
        
        return p.getId();
    }
    
    public Persona cargarPersona(String id){
        
        for(Persona p : personas){
            if(p.getId().equals(id))
                return p;
        }
        return null;
    }
    
    public Persona cargarPersonaIndice(int indice){
        
        return personas.get(indice);
    }

    public void actualizarPersona(String id, String nombre, int edad) {
         for(Persona p : personas){
            if(p.getId().equals(id)){
                p.setNombre(nombre);
                p.setEdad(edad);
                return;
            }
        }
    }

    public void igualarPersona(String id) {
        for(Persona p : personas){
            if(p.getId().equals(id)){
                Persona p1 = p;
                personas.add(p1);
                return;
            }
        }
    }
    
}
