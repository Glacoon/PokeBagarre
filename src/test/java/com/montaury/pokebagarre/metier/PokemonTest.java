package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
   /* Pokemon pokemon1 = new ConstructeurDePokemon().avecAttaque(100).avecDefense(100).construire();
    @Test
    void premier_pokemon_gagne_avec_attaque_superieur() {
        //GIVEN
        Pokemon pokemon = new ConstructeurDePokemon().avecAttaque(50).avecDefense(100).construire();

        //WHEN
        Boolean vainqueur = pokemon1.estVainqueurContre(pokemon);

        //THEN
        assertEquals(true, vainqueur);
    }

    @Test
    void premier_pokemon_perd_avec_attaque_inferieur() {
        //GIVEN
        Pokemon pokemon = new ConstructeurDePokemon().avecAttaque(150).avecDefense(100).construire();
        //WHEN
        Boolean vainqueur = pokemon1.estVainqueurContre(pokemon);

        //THEN
        assertEquals(false, vainqueur);
    }

    @Test
    void premier_pokemon_gagne_avec_defense_superieur_et_attaque_identique() {
        //GIVEN
        Pokemon pokemon = new ConstructeurDePokemon().avecAttaque(100).avecDefense(50).construire();
        //WHEN
        Boolean vainqueur = pokemon1.estVainqueurContre(pokemon);

        //THEN
        assertEquals(true, vainqueur);
    }

    @Test
    void premier_pokemon_perd_avec_defense_inferieur_et_attaque_identique() {
        //GIVEN
        Pokemon pokemon = new ConstructeurDePokemon().avecAttaque(100).avecDefense(150).construire();
        //WHEN
        Boolean vainqueur = pokemon1.estVainqueurContre(pokemon);

        //THEN
        assertEquals(false, vainqueur);
    }

    @Test
    void premier_pokemon_gagne_avec_attaque_et_defense_identiques() {
        //GIVEN
        Pokemon pokemon = new ConstructeurDePokemon().avecAttaque(100).avecDefense(100).construire();

        //WHEN
        Boolean vainqueur = pokemon1.estVainqueurContre(pokemon);

        //THEN
        assertEquals(true, vainqueur);
    }*/

    Pokemon pokemonTest = new ConstructeurDePokemon().avecAttaque(100).avecDefense(100).construire();

    @Test
    void premier_pkmn_gagne_avec_attaque_sup(){
        //GIVEN
        Pokemon pokemon = new ConstructeurDePokemon().avecAttaque(50).avecDefense(100).construire();

        //WHEN
        Boolean vainqueur = pokemonTest.estVainqueurContre(pokemon);

        //THEN
        assertEquals(true, vainqueur);
    }

    @Test
    void premier_pkmn_perd_avec_attaque_inf(){
        //GIVEN
        Pokemon pokemon = new ConstructeurDePokemon().avecAttaque(150).avecDefense(100).construire();

        //WHEN
        Boolean vainqueur = pokemonTest.estVainqueurContre(pokemon);

        //THEN
        assertEquals(false, vainqueur);
    }

    @Test
    void premier_pkmn_gagne_avec_defense_supp(){
        Pokemon pokemon = new ConstructeurDePokemon().avecAttaque(100).avecDefense(10).construire();

        //WHEN
        Boolean vainqueur = pokemonTest.estVainqueurContre(pokemon);

        //THEN
        assertEquals(true, vainqueur);
    }

    @Test
    void premier_pkmn_perd_avec_defense_inf(){
        Pokemon pokemon = new ConstructeurDePokemon().avecAttaque(100).avecDefense(150).construire();

        //WHEN
        Boolean vainqueur = pokemonTest.estVainqueurContre(pokemon);

        //THEN
        assertEquals(false, vainqueur);
    }

    @Test
    void premier_pokemon_gagne_avec_attaque_et_defense_identiques() {
        //GIVEN
        Pokemon pokemon = new ConstructeurDePokemon().avecAttaque(100).avecDefense(100).construire();

        //WHEN
        Boolean vainqueur = pokemonTest.estVainqueurContre(pokemon);

        //THEN
        assertEquals(true, vainqueur);
    }
}