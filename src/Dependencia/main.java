package Dependencia;

import Inyeccion.ServicioEnvio;
import Inyeccion.ServicioImpresion;
import Inyeccion.ServicioPDF;
import Inyectado.ServicioEnvioAspecto;
import Inyectado.ServiciosImpresion;

public class main {
    public static void main(String[] args) {
        Depend midepend= new Depend();
        midepend.imprimir();

        ServicioImpresion miseries= new ServicioImpresion();
        miseries.imprimir();

        ServiciosImpresion miServicio = new ServiciosImpresion(new ServicioEnvio(),new ServicioPDF());
        miServicio.imprimir();
//Indicamos que cuando inyecte la dependencia no inyecte el servicioenvio que inyecte el servicio aspecto
        ServiciosImpresion miService = new ServiciosImpresion(new ServicioEnvioAspecto(),new ServicioPDF());
        miService.imprimir();
    }
}


/*La inyección de dependencia nos permite inyectar otras clases y
añadir funcionalidad transversal a medida.
Este patrón de diseño es el que abre la puerta a frameworks como Spring
utilizando el concepto de inyección de dependencia de una forma más avanzada.
En estos framework los aspectos que se añaden a nuestras clases son múltiples y la complejidad alta.*/
