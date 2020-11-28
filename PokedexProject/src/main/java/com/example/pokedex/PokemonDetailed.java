package com.example.pokedex;

public class PokemonDetailed extends Pokemon{
    private String description;
    public PokemonDetailed(String name, int id, String weight, String height,
                           String description) {
        super(name, id, weight, height);
        this.description = description;
    }

    /**
     * Edit how we want our object to be displayed in a String format
     */
    public String toString(){
        return "Pokémon #"+this.getId()+"\nNom : "+this.getName()+
                "\nTaille : "+ this.getHeight()+"\nPoids : "+this.getWeight()+
                "\nDescription :"+this.getDescription();
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
