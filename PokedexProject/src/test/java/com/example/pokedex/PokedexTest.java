package com.example.pokedex;
import org.junit.Assert;
import org.junit.Test;

/**
 * Un test unitaire pour les deux méthodes getFromAPI et geFromSQLLite
 * à partir de ces deux méthodes on peut savoir si notre application marche bien
 * et retourne les résultats attendus
 */
public class PokedexTest {
    @Test
    public void getFromAPI() {
        Pokedex pokedex = new Pokedex();
        Assert.assertEquals("Pokémon #1\n" +
                "Nom : bulbasaur\n" +
                "Taille : 7\n" +
                "Poids : 69",pokedex.getFromAPI(1));
    }
    @Test
    public void  getFromSQLLite(){
        Pokedex pokedex = new Pokedex();
        Assert.assertEquals( "Pokémon #5\n" +
                "Nom : Reptincel\n" +
                "Taille : 11\n" +
                "Poids : 190\n" +
                "Description :En agitant sa queue, il peut augmenter le niveau " +
                        "de la température à un degré incroyable",
                pokedex.getFromSQLLite(5,
                        "C:/Users/HP/Desktop/pokemondatabase.sqlite"));
    }
}
