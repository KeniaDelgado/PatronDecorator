
package Decoradores;

import Componentes.Crepa;

public class Chocolate extends AdicionalesDecorator{
    
    Crepa crepa;
    // Aqui recibimos nuestra crepa base
    public Chocolate(Crepa crepa){
        this.crepa = crepa;
    }
    
    // Acá ya es cuando decoramos nuestra crepa base con el ingrediente
    // decorador, en este caso chocolate
    @Override
    public String getDescripcion() {
            return crepa.getDescripcion()+" + Chocolate\n";
    }
    
    // El tipo se utiliza para determinar si se vuelvue 
    // una crepa mixta o no
    @Override
    public String getTipo() {
     String tipoAn = crepa.getTipo();
     if(tipoAn.equals("Salada")){
         return tipoAn="Mixta";
     }else{
       return tipoAn;
     }
    }
    // Aquí agregamos al precio base el costo del ingrediente extra
    // Todo utilizando la información de la crepa base que se envió
    @Override
    public int precio() {
     return crepa.precio()+10;
    }
    
    
}
