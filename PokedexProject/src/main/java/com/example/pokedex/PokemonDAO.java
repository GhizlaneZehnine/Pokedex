package com.example.pokedex;

import java.nio.charset.StandardCharsets;
import java.sql.*;

/**
 * This class is responsible of accessing the database and sending SQL requests
 */
public class PokemonDAO {
    PokemonDetailed pokemon;
    public PokemonDetailed get(int id, DBconnectionInterface db){
        PreparedStatement stmt  = null;
        try {
            stmt = db.establish().prepareStatement("SELECT name, description , " +
                    "height , weight FROM pokemons WHERE id = ?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            String descriptionWithEncodingProblem = rs.getString("description");
            String description = new String(descriptionWithEncodingProblem.getBytes(StandardCharsets.UTF_8));
            pokemon = new PokemonDetailed(rs.getString("name"),
                    id, rs.getString("weight"), rs.getString("height"),description );
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return pokemon;
    }
}
