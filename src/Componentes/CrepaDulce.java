
package Componentes;

public class CrepaDulce extends Crepa {
    
    
    // Base de una crepa dulce
    public CrepaDulce(String sabor){
        descripcion="Crepa DULCE con:\n - "+ sabor + "\n";
        
        tipo="Dulce";
    }
    // Precio base de las crepas dulces
    // aquí podemos modificar el precio siempre que queramos
    // sin afectar el código (en claso de que se use una bd)
    @Override
     public int precio(){
      return 25;
     }
    
}
