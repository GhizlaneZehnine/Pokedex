package com.example.pokedex;

public class Pokemon {
    private String name;
    private int id;
    private String weight;
    private String height;

    public Pokemon(String name, int id, String weight, String height) {
        this.name = name;
        this.id = id;
        this.weight = weight;
        this.height = height;
    }
    /**
     * Edit how we want our object to be displayed in a String format
     */
    public String toString(){
        return "Pokémon #"+this.getId()+"\nNom : "+this.getName()+"\nTaille : " +
                this.getHeight()+"\nPoids : "+this.getWeight();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public String getHeight() {
        return height;
    }
    public void setHeight(String height) {
        this.height = height;
    }
}
