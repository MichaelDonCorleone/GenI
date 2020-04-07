/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geni;

/**
 *
 * @author PCuser
 */
public class pokedex {
    //base stats will be accessible here, all we will need is a class that will have an Identifier and that will return all data needed.
    //Type 1,Type 2,Total,HP,Attack,Defense,Sp. Atk,Sp. Def,Speed
    public enum pokemon {
        Bulbasaur(type.Grass,type.Poison,new int[]{45,49,49,65,65,45}), 
        Ivysaur(type.Grass, type.Poison,new int[]{318,45,49,49,65,65,45,1}), 
        Venusaur(type.Grass,type.Poison, new int[]{}), 
        Charmander(type.Fire,type.Fire,new int[]{}), 
        Charmeleon(type.Fire,type.Fire,new int[]{}), 
        Charizard(type.Fire,type.Flying,new int[]{}), 
        Squirtle(type.,type.,new int[]{}), 
        Wartortle(type.,type.,new int[]{}), 
        Blastoise(type.,type.,new int[]{}), 
        Caterpie(type.,type.,new int[]{}), 
        Metapod(type.,type.,new int[]{}), 
        Butterfree(type.,type.,new int[]{}), 
        Weedle(type.,type.,new int[]{}), 
        Kakuna(type.,type.,new int[]{}), 
        Beedrill(type.,type.,new int[]{}), 
        Pidgey(type.,type.,new int[]{}), 
        Pidgeotto(type.,type.,new int[]{}), 
        Pidgeot(type.,type.,new int[]{}), 
        Rattata(type.,type.,new int[]{}), 
        Raticate(type.,type.,new int[]{}), 
        Spearow(type.,type.,new int[]{}), 
        Fearow(type.,type.,new int[]{}), 
        Ekans(type.,type.,new int[]{}), 
        Arbok(type.,type.,new int[]{}), 
        Pikachu(type.,type.,new int[]{}), 
        Raichu(type.,type.,new int[]{}), 
        Sandshrew(type.,type.,new int[]{}), 
        Sandslash(type.,type.,new int[]{}), 
        Nidoran(type.,type.,new int[]{}), 
        Nidorina(type.,type.,new int[]{}), 
        Nidoqueen(type.,type.,new int[]{}), 
        Nidorino(type.,type.,new int[]{}),
        Nidoking(type.,type.,new int[]{}), 
        Clefairy(type.,type.,new int[]{}), 
        Clefable(type.,type.,new int[]{}), 
        Vulpix(type.,type.,new int[]{}), 
        Ninetales(type.,type.,new int[]{}), 
        Jigglypuff(type.,type.,new int[]{}), 
        Wigglytuff(type.,type.,new int[]{}), 
        Zubat(type.,type.,new int[]{}), 
        Golbat(type.,type.,new int[]{}), 
        Oddish(type.,type.,new int[]{}), 
        Gloom(type.,type.,new int[]{}), 
        Vileplume(type.,type.,new int[]{}), 
        Paras(type.,type.,new int[]{}), 
        Parasect(type.,type.,new int[]{}), 
        Venonat(type.,type.,new int[]{}), 
        Venomoth(type.,type.,new int[]{}), 
        Diglett(type.,type.,new int[]{}), 
        Dugtrio(type.,type.,new int[]{}), 
        Meowth(type.,type.,new int[]{}), 
        Persian(type.,type.,new int[]{}), 
        Psyduck(type.,type.,new int[]{}), 
        Golduck(type.,type.,new int[]{}), 
        Mankey(type.,type.,new int[]{}), 
        Primeape(type.,type.,new int[]{}), 
        Growlithe(type.,type.,new int[]{}), 
        Arcanine(type.,type.,new int[]{}), 
        Poliwag(type.,type.,new int[]{}), 
        Poliwhirl(type.,type.,new int[]{}), 
        Poliwrath(type.,type.,new int[]{}), 
        Abra(type.,type.,new int[]{}), 
        Kadabra(type.,type.,new int[]{}), 
        Alakazam(type.,type.,new int[]{}), 
        Machop(type.,type.,new int[]{}), 
        Machoke(type.,type.,new int[]{}), 
        Machamp(type.,type.,new int[]{}), 
        Bellsprout(type.,type.,new int[]{}), 
        Weepinbell(type.,type.,new int[]{}), 
        Victreebel(type.,type.,new int[]{}), 
        Tentacool(type.,type.,new int[]{}), 
        Tentacruel(type.,type.,new int[]{}), 
        Geodude(type.,type.,new int[]{}), 
        Graveler(type.,type.,new int[]{}), 
        Golem(type.,type.,new int[]{}), 
        Ponyta(type.,type.,new int[]{}), 
        Rapidash(type.,type.,new int[]{}), 
        Slowpoke(type.,type.,new int[]{}), 
        Slowbro(type.,type.,new int[]{}), 
        Magnemite(type.,type.,new int[]{}), 
        Magneton(type.,type.,new int[]{}), 
        Farfetchd(type.,type.,new int[]{}), 
        Doduo(type.,type.,new int[]{}), 
        Dodrio(type.,type.,new int[]{}), 
        Seel(type.,type.,new int[]{}), 
        Dewgong(type.,type.,new int[]{}), 
        Grimer(type.,type.,new int[]{}), 
        Muk(type.,type.,new int[]{}), 
        Shellder(type.,type.,new int[]{}), 
        Cloyster(type.,type.,new int[]{}), 
        Gastly(type.,type.,new int[]{}), 
        Haunter(type.,type.,new int[]{}), 
        Gengar(type.,type.,new int[]{}), 
        Onix(type.,type.,new int[]{}), 
        Drowzee(type.,type.,new int[]{}), 
        Hypno(type.,type.,new int[]{}), 
        Krabby(type.,type.,new int[]{}), 
        Kingler(type.,type.,new int[]{}), 
        Voltorb(type.,type.,new int[]{}),
        Electrode(type.,type.,new int[]{}), 
        Exeggcute(type.,type.,new int[]{}), 
        Exeggutor(type.,type.,new int[]{}), 
        Cubone(type.,type.,new int[]{}), 
        Marowak(type.,type.,new int[]{}), 
        Hitmonlee(type.,type.,new int[]{}), 
        Hitmonchan(type.,type.,new int[]{}), 
        Lickitung(type.,type.,new int[]{}), 
        Koffing(type.,type.,new int[]{}), 
        Weezing(type.,type.,new int[]{}), 
        Rhyhorn(type.,type.,new int[]{}), 
        Rhydon(type.,type.,new int[]{}), 
        Chansey(type.,type.,new int[]{}), 
        Tangela(type.,type.,new int[]{}), 
        Kangaskhan(type.,type.,new int[]{}), 
        Horsea(type.,type.,new int[]{}), 
        Seadra(type.,type.,new int[]{}), 
        Goldeen(type.,type.,new int[]{}), 
        Seaking(type.,type.,new int[]{}), 
        Staryu(type.,type.,new int[]{}), 
        Starmie(type.,type.,new int[]{}), 
        MrMime(type.,type.,new int[]{}), 
        Scyther(type.,type.,new int[]{}), 
        Jynx(type.,type.,new int[]{}), 
        Electabuzz(type.,type.,new int[]{}), 
        Magmar(type.,type.,new int[]{}), 
        Pinsir(type.,type.,new int[]{}), 
        Tauros(type.,type.,new int[]{}), 
        Magikarp(type.,type.,new int[]{}), 
        Gyarados(type.,type.,new int[]{}), 
        Lapras(type.,type.,new int[]{}), 
        Ditto(type.,type.,new int[]{}), 
        Eevee(type.,type.,new int[]{}), 
        Vaporeon(type.,type.,new int[]{}), 
        Jolteon(type.,type.,new int[]{}), 
        Flareo(type.,type.,new int[]{}), 
        Porygon(type.,type.,new int[]{}), 
        Omanyte(type.,type.,new int[]{}), 
        Omastar(type.,type.,new int[]{}), 
        Kabuto(type.,type.,new int[]{}), 
        Kabutops(type.,type.,new int[]{}), 
        Aerodactyl(type.,type.,new int[]{}), 
        Snorlax(type.,type.,new int[]{}), 
        Articuno(type.,type.,new int[]{}), 
        Zapdos(type.,type.,new int[]{}), 
        Moltres(type.,type.,new int[]{}), 
        Dratini(type.,type.,new int[]{}), 
        Dragonair(type.,type.,new int[]{}), 
        Dragonite(type.,type.,new int[]{}), 
        Mewtwo(type.,type.,new int[]{}), 
        Mew(type.,type.,new int[]{});
        
        private final type type1;
        private final type type2;
        private final int[] battleData;
        
        private pokemon(type type1, type2, int[] battleData) {
            
        }
        
    } 
        
    }
    
    public enum type {
        Normal(new double[]{1,1,1,1,1,1,1,1,1,1,1,1,0.5,0,1}),
        Fire(new double[]{1,0.5,0.5,1,2,2,1,1,1,1,1,2,0.5,1,0.5}),
        Water(new double[]{1,2,0.5,1,0.5,1,1,1,2,1,1,1,2,1,0.5}),
        Electric(new double[]{1,1,2,0.5,0.5,1,1,1,0,2,1,1,1,1,0.5}),
        Grass(new double[]{1,0.5,2,1,0.5,1,1,0.5,2,0.5,1,0.5,2,1,0.5}),
        Ice(new double[]{1,1,0.5,1,2,0.5,1,1,2,2,1,1,1,1,2}),
        Fighting(new double[]{2,1,1,1,1,2,1,0.5,1,0.5,0.5,0.5,2,0,1}),
        Poison(new double[]{1,1,1,1,2,1,1,0.5,0.5,1,1,2,0.5,0.5}),
        Ground(new double[]{1,2,1,2,0.5,1,1,2,1,0,1,0.5,2,1,1}),
        Flying(new double[]{1,1,1,0.5,2,1,2,1,1,1,1,2,0.5,1,1}),
        Psychic(new double[]{1,1,1,1,1,1,2,2,1,1,0.5,1,1,1,1}),
        Bug(new double[]{1,0.5,1,1,2,1,0.5,2,1,0.5,2,1,1,0.5,1}),
        Rock(new double[]{1,2,1,1,1,2,0.5,1,0.5,2,1,2,1,1,1}),
        Ghost(new double[]{0,1,1,1,1,1,1,1,1,1,0,1,1,2,1}),
        Dragon(new double[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,2});
        
        private final double[] battleCoefficients;
        private type(double[] battleCoefficients){
            this.battleCoefficients = battleCoefficients;
        }
        
        private double[] getBattleCoefficients() {
            return this.battleCoefficients;
        }
    }
}