/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacen;

import informacion.Convertir;
import informacion.Datos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class archivos {
     List<Datos> contenido = new ArrayList<>();
    
    public List<Datos> leer(){
        String linea;
        Datos datos;
        if (verificar()){
        try { 
            FileReader archivo = new FileReader("datos.vic");
            BufferedReader br = new BufferedReader(archivo);
            while((linea = br.readLine()) != null){
                datos = new datos();
                Convertir convertir = new Convertir();
                datos = convertir.aclase(linea);
                contenido.add(datos);               
            }
            br.close();
            archivo.close();
            if (!(contenido.size()>0)){
                contenido = null;
            }
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
        }else{
            contenido = null;
        }
        return contenido;
        
}
    public boolean grabar(List<datos> lista){
        Convertir convertir = new Convertir();
        boolean estado = true;
        try {
            FileWriter archivo = new FileWriter("datos.vic");
            BufferedWriter bw = new BufferedWriter(archivo);
            for (Datos cadena : lista)
            bw.write(convertir.ajson(cadena)+"\n");
            bw.close();
            archivo.close();
            
        } catch (IOException ex) {
           ex.printStackTrace();
           estado = false;
        }
        return estado;
    }
   private boolean verificar(){
       File archivo = new File("datos.txt");
       if (archivo.exists())
           return true;
       else
           return false;
   }
}


