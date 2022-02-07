package Inyectado;

import Inyeccion.ServicioEnvio;

public class ServicioEnvioAspecto extends ServicioEnvio {

    @Override
    public void enviar(){
        System.out.println("HACIENDO LOG DEL CORREO QUE VAMOS A ENVIAR");
        System.out.println("EJEMPLO COMPLETO ");
        super.enviar();
    }
}
