
package Decoradores;

import Componentes.Crepa;

public abstract class AdicionalesDecorator extends Crepa{
    // Nuestro decorador base hereda de crepa
    // Ya que de aquí partimos para comenzar a dar funcionabilidad
    public abstract String getDescripcion();
    public abstract String getTipo();
    public abstract int precio();
}
