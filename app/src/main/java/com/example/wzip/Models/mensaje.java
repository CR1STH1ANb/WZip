package com.example.wzip.Models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class mensaje {
    public String nombre;

    public String asunto;



    public String getAsunto() {
        return asunto;
    }

    public String getNombre() {

        return nombre;
    }




    public mensaje(JSONObject a) throws JSONException {
        this.nombre = a.getString("nombre").toString();
        this.asunto = a.getString("asunto").toString();

    }
    //Metodo para parsear los datos
    public static ArrayList<mensaje> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<mensaje> mensaje = new ArrayList<>();
        for (int i = 0; i < datos.length() && i<20; i++) {
            mensaje.add(new mensaje(datos.getJSONObject(i)));
        }
        return mensaje;
    }

}
