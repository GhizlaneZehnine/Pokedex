package com.example.pokedex;

public class SQLLite {
    public static PokemonDetailed run(int id, String url){
        /**
         * We start by establishing the connection to DB
         */
        DBconnection dbConnection = new DBconnection(url);
        dbConnection.establish();
        /**
         * Retrieve data from the database
         */
        PokemonDAO pokemonDAO = new PokemonDAO();
        PokemonDetailed pokemon;
        pokemon = pokemonDAO.get(id , dbConnection);

        return pokemon;

    }
}
