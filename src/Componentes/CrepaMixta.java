package Componentes;

public class CrepaMixta extends Crepa{
    
    public CrepaMixta(String sabor){
        descripcion="Crepa MIXTA con: \n - " + sabor + "\n";
        tipo="Mixta";
    }
    
    @Override
     public int precio(){
      return 20;
     }
}
