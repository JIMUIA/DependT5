package Inyectado;

import Inyeccion.ServicioEnvio;
import Inyeccion.ServicioPDF;

public class ServiciosImpresion {

    ServicioEnvio servicioA;
    ServicioPDF servicioB;

    public ServiciosImpresion(ServicioEnvio servicioA, ServicioPDF servicioB) {
        this.servicioA = servicioA;
        this.servicioB = servicioB;
    }

    public  void imprimir(){
        servicioA.enviar();
        servicioB.PDF();
    }

}
