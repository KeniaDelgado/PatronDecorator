
package Componentes;

public class CrepaSalada extends Crepa{
    
    String arr[]={"Jamón","Pepperoni"};
    
    public CrepaSalada(String sabor){
        descripcion="Crepa SALADA con:\n - "+ sabor + "\n";
        tipo="Salada";
    }
    
    @Override
     public int precio(){
      return 25;
     }
}
