package com.example.pokedex;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PokemonFromJSON {
    Pokemon pokemon;

    /**
     * Convertir l'objet json on objet Pokemon
     */
    public Pokemon parse(String json , int id){
        JSONParser parser = new JSONParser();
        Object resultObject = null;
        try {
            resultObject = parser.parse(json);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (resultObject instanceof JSONObject) {
            JSONObject obj =(JSONObject)resultObject;
            pokemon = new Pokemon(obj.get("name").toString() , id ,
                    obj.get("weight").toString() , obj.get("height").toString());
        } else {
            System.err.println("Error, we expected a JSON Object from the API");
        }
        return pokemon;
    }
}
