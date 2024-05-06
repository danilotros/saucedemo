package utils;

import java.util.HashMap;
import java.util.Map;

public class Almacen {
    private Almacen(){}
    private static Almacen almacen;

    private Map<String,String> bovedaValores=new HashMap<>();

    public void almacenar(String llave, String valor){
        bovedaValores.put(llave,valor);
    }

    public String obtenerValores(String llave){
        return bovedaValores.get(llave);
    }

    public static Almacen getAlmacen(){
        if (almacen==null){
            almacen=new Almacen();
        }
        return almacen;
    }
}
