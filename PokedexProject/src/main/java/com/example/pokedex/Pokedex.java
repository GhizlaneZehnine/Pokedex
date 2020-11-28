package com.example.pokedex;

/** Pokedex is an application that displays information about a specific Pokemon.
 * The user is invited to enter the id of the pokemon he wishes to display.
 * If the user wants to use the SQL database as a source
 * he should enter the url to the local DB as well.
 */
public class Pokedex {
    public static Pokemon pokemon;

    public static void main(String[] args) {

        if (args.length > 0) {

            if (args.length > 1) {
                // SQLLite.run() retourne PokemonDetailed
                pokemon = SQLLite.run(Integer.parseInt(args[0]) , args[1]);
                System.out.println("=====================================");
                System.out.println(pokemon.toString());
                System.out.println("=====================================");
            } else {
                //HttpRequestController.run() retourne Pokemon
                pokemon = HTTPRequestController.run(Integer.parseInt(args[0]));
                System.out.println("=====================================");
                System.out.println(pokemon.toString());
                System.out.println("=====================================");
            }
        } else {
            System.out.println("You should enter the pokemon id !");
        }
    }

    /**
     * The method getFromSQLLite calls the procedure to get Pokemon data from SQL database
     * @param id the pokemon id to show
     * @param url the local database url
     * @return the description of the pokemon
     */
    public String getFromSQLLite(int id, String url){
        pokemon = SQLLite.run(id , url);
        return pokemon.toString();
    }

    /**
     * The method getFromAPI calls the HTTPRequestController
     * @param id the pokemon id to show
     * @return the description of the pokemon
     */
    public  String getFromAPI(int id){
        pokemon = HTTPRequestController.run(id);
        return pokemon.toString();
    }

}
