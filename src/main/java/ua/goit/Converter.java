package ua.goit;

import com.google.gson.Gson;

public class Converter {
    public String toJson(Object o){
       Gson gson = new Gson();
       return gson.toJson(o);
    }
}
