
package Componentes;

public abstract class Crepa {
 
    //Nuestra clase crepa nos establece lo que debe ser una crepa
    // Aquí podemos incluit metódos abstractos a los cuales no 
    // tengo porque agregar comportamiento, solo declararlos
    
 String descripcion = "";
 String tipo="";
 
 public String getDescripcion() 
 {
  return descripcion;
 }
 
 public String getTipo()
 {
  return tipo;
 }

 // Función abstracta
 public abstract int precio();

}
