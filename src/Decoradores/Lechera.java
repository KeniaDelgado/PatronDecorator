/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decoradores;

import Componentes.Crepa;

/**
 *
 * @author kenia
 */
public class Lechera extends AdicionalesDecorator{
    Crepa crepa;
    
    public Lechera(Crepa crepa){
        this.crepa = crepa;
    }
    
    @Override
    public String getDescripcion() {
            return crepa.getDescripcion()+" + Lechera\n";
    }
    
    @Override
    public String getTipo() {
     String tipoAn = crepa.getTipo();
     if(tipoAn.equals("Salada")){
         return tipoAn="Mixta";
     }else{
       return tipoAn;
     }
    }

    @Override
    public int precio() {
     return crepa.precio()+10;
    }
}
