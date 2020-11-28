package com.example.pokedex;

public class HTTPRequestController {
    public static Pokemon run(int id){
        /**
         * Envoyer la requête à l'api avec l'id du pokémon
         */
        HTTPRequest httpRequest = new HTTPRequest();
        String response = "";
        response = httpRequest.get("https://pokeapi.co/api/v2/pokemon/"+id);
        /**
         * Convertir la réponse json en objet Pokemon
         */
        PokemonFromJSON pokemonFromJSON = new PokemonFromJSON();
        Pokemon pokemon;
        pokemon = pokemonFromJSON.parse(response , id);

        return pokemon;
    }
}
