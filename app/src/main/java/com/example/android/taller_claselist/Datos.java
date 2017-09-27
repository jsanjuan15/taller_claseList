package com.example.android.taller_claselist;

import java.util.ArrayList;

/**
 * Created by android on 26/09/2017.
 */

public class Datos {
    private static ArrayList<Celular> base= new ArrayList();

    public static void guardar(Celular p ){ base.add(p);
    }

    public static ArrayList<Celular> obtener(){
        return base;
    }
}
