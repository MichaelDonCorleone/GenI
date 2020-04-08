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
        Ivysaur(type.Grass, type.Poison,new int[]{318,45,49,49,65,65,45}), 
        Venusaur(type.Grass,type.Poison, new int[]{525,80,82,83,100,100,80}), 
        Charmander(type.Fire,type.Fire,new int[]{309,39,52,43,60,50,65}), 
        Charmeleon(type.Fire,type.Fire,new int[]{405,58,64,58,80,65,80}), 
        Charizard(type.Fire,type.Flying,new int[]{534,78,84,78,109,85,100}), 
        Squirtle(type.Water,type.Water,new int[]{314,44,48,65,50,64,43}), 
        Wartortle(type.Water,type.Water,new int[]{405,59,63,80,65,80,58}), 
        Blastoise(type.Water,type.Water,new int[]{530,79,83,100,85,105,78}), 
        Caterpie(type.Bug,type.Bug,new int[]{195,45,30,35,20,20,45}), 
        Metapod(type.Bug,type.Bug,new int[]{205,50,20,55,25,25,30}), 
        Butterfree(type.Bug,type.Flying,new int[]{395,60,45,50,90,80,70}), 
        Weedle(type.Bug,type.Poison,new int[]{195,40,35,30,20,20,50}), 
        Kakuna(type.Bug,type.Poison,new int[]{205,45,25,50,25,25,35}), 
        Beedrill(type.Bug,type.Poison,new int[]{395,65,90,40,45,80,75}), 
        Pidgey(type.Normal,type.Flying,new int[]{495,65,150,40,15,80,145}), 
        Pidgeotto(type.Normal,type.Flying,new int[]{349,63,60,55,50,50,71}), 
        Pidgeot(type.Normal,type.Flying,new int[]{479,83,80,75,70,70,101}), 
        Rattata(type.Normal,type.Normal,new int[]{253,30,56,35,25,35,72}), 
        Raticate(type.Normal,type.Normal,new int[]{413,55,81,60,50,70,97}), 
        Spearow(type.Normal,type.Flying,new int[]{262,40,60,30,31,31,70}), 
        Fearow(type.Normal,type.Flying,new int[]{442,65,90,65,61,61,100}), 
        Ekans(type.Poison,type.Poison,new int[]{288,35,60,44,40,54,55}), 
        Arbok(type.Poison,type.Poison,new int[]{438,60,85,69,65,79,80}), 
        Pikachu(type.Electric,type.Electric,new int[]{320,35,55,40,50,50,90}), 
        Raichu(type.Electric,type.Electric,new int[]{485,60,90,55,90,80,110}), 
        Sandshrew(type.Ground,type.Ground,new int[]{300,50,75,85,20,30,40}), 
        Sandslash(type.Ground,type.Ground,new int[]{450,75,100,110,45,55,65}), 
        NidoranF(type.Poison,type.Poison,new int[]{275,55,47,52,40,40,41}), 
        Nidorina(type.Poison,type.Poison,new int[]{365,70,62,67,55,55,56}), 
        Nidoqueen(type.Poison,type.Ground,new int[]{505,90,92,87,75,85,76}),
        NidoranM(type.Poison,type.Poison,new int[]{273,46,57,40,40,40,50}),
        Nidorino(type.Poison,type.Poison,new int[]{365,61,72,57,55,55,65}),
        Nidoking(type.Poison,type.Ground,new int[]{505,81,102,77,85,75,85}), 
        Clefairy(type.Normal,type.Normal,new int[]{323,70,45,48,60,65,35}), 
        Clefable(type.Normal,type.Normal,new int[]{483,95,70,73,95,90,60}), 
        Vulpix(type.Fire,type.Fire,new int[]{299,38,41,40,50,65,65}), 
        Ninetales(type.Fire,type.Fire,new int[]{505,73,76,75,81,100,100}), 
        Jigglypuff(type.Normal,type.Normal,new int[]{270,115,45,20,45,25,20}), 
        Wigglytuff(type.Normal,type.Normal,new int[]{435,140,70,45,85,50,45}), 
        Zubat(type.Poison,type.Flying,new int[]{245,40,45,35,30,40,55}), 
        Golbat(type.Poison,type.Flying,new int[]{455,75,80,70,65,75,90}), 
        Oddish(type.Grass,type.Poison,new int[]{320,45,50,55,75,65,30}), 
        Gloom(type.Grass,type.Poison,new int[]{395,60,65,70,85,75,40}), 
        Vileplume(type.Grass,type.Poison,new int[]{490,75,80,85,110,90,50}), 
        Paras(type.Bug,type.Grass,new int[]{285,35,70,55,45,55,25}), 
        Parasect(type.Bug,type.Grass,new int[]{405,60,95,80,60,80,30}), 
        Venonat(type.Bug,type.Poison,new int[]{305,60,55,50,40,55,45}), 
        Venomoth(type.Bug,type.Poison,new int[]{450,70,65,60,90,75,90}), 
        Diglett(type.Ground,type.Ground,new int[]{265,10,55,25,35,45,95}), 
        Dugtrio(type.Ground,type.Ground,new int[]{405,35,80,50,50,70,120}), 
        Meowth(type.Normal,type.Normal,new int[]{290,40,45,35,40,40,90}), 
        Persian(type.Normal,type.Normal,new int[]{440,65,70,60,65,65,115}), 
        Psyduck(type.Water,type.Water,new int[]{320,50,52,48,65,50,55}), 
        Golduck(type.Water,type.Water,new int[]{500,80,82,78,95,80,85}), 
        Mankey(type.Fighting,type.Fighting,new int[]{305,40,80,35,35,45,70}), 
        Primeape(type.Fighting,type.Fighting,new int[]{455,65,105,60,60,70,95}), 
        Growlithe(type.Fire,type.Fire,new int[]{350,55,70,45,70,50,60}), 
        Arcanine(type.Fire,type.Fire,new int[]{555,90,110,80,100,80,95}), 
        Poliwag(type.Water,type.Water,new int[]{300,40,50,40,40,40,90}), 
        Poliwhirl(type.Water,type.Water,new int[]{385,65,65,65,50,50,90}), 
        Poliwrath(type.Water,type.Fighting,new int[]{510,90,95,95,70,90,70}), 
        Abra(type.Psychic,type.Psychic,new int[]{310,25,20,15,105,55,90}), 
        Kadabra(type.Psychic,type.Psychic,new int[]{400,40,35,30,120,70,105}), 
        Alakazam(type.Psychic,type.Psychic,new int[]{500,55,50,45,135,95,120}), 
        Machop(type.Fighting,type.Fighting,new int[]{305,70,80,50,35,35,35}), 
        Machoke(type.Fighting,type.Fighting,new int[]{405,80,100,70,50,60,45}), 
        Machamp(type.Fighting,type.Fighting,new int[]{505,90,130,80,65,85,55}), 
        Bellsprout(type.Grass,type.Poison,new int[]{300,50,75,35,70,30,40}), 
        Weepinbell(type.Grass,type.Poison,new int[]{390,65,90,50,85,45,55}), 
        Victreebel(type.Grass,type.Poison,new int[]{490,80,105,65,100,70,70}), 
        Tentacool(type.Water,type.Poison,new int[]{335,40,40,35,50,100,70}), 
        Tentacruel(type.Water,type.Poison,new int[]{515,80,70,65,80,120,100}), 
        Geodude(type.Rock,type.Ground,new int[]{300,40,80,100,30,30,20}), 
        Graveler(type.Rock,type.Ground,new int[]{390,55,95,115,45,45,35}), 
        Golem(type.Rock,type.Ground,new int[]{495,80,120,130,55,65,45}), 
        Ponyta(type.Fire,type.Fire,new int[]{410,50,85,55,65,65,90}), 
        Rapidash(type.Fire,type.Fire,new int[]{500,65,100,70,80,80,105}), 
        Slowpoke(type.Water,type.Psychic,new int[]{490,95,75,110,100,80,30}), 
        Slowbro(type.Water,type.Psychic,new int[]{490,95,75,110,100,80,30}), 
        Magnemite(type.Electric,type.Electric,new int[]{325,25,35,70,95,55,45}), 
        Magneton(type.Electric,type.Electric,new int[]{465,50,60,95,120,70,70}), 
        Farfetchd(type.Normal,type.Flying,new int[]{352,52,65,55,58,62,60}), 
        Doduo(type.Normal,type.Flying,new int[]{310,35,85,45,35,35,75}), 
        Dodrio(type.Normal,type.Flying,new int[]{460,60,110,70,60,60,100}), 
        Seel(type.Water,type.Water,new int[]{325,65,45,55,45,70,45}), 
        Dewgong(type.Water,type.Ice,new int[]{475,90,70,80,70,95,70}), 
        Grimer(type.Poison,type.Poison,new int[]{325,80,80,50,40,50,25}), 
        Muk(type.Poison,type.Poison,new int[]{500,105,105,75,65,100,50}), 
        Shellder(type.Water,type.Water,new int[]{305,30,65,100,45,25,40}), 
        Cloyster(type.Water,type.Ice,new int[]{525,50,95,180,85,45,70}), 
        Gastly(type.Ghost,type.Poison,new int[]{310,30,35,30,100,35,80}), 
        Haunter(type.Ghost,type.Poison,new int[]{405,45,50,45,115,55,95}), 
        Gengar(type.Ghost,type.Poison,new int[]{500,60,65,60,130,75,110}), 
        Onix(type.Rock,type.Ground,new int[]{385,35,45,160,30,45,70}), 
        Drowzee(type.Psychic,type.Psychic,new int[]{328,60,48,45,43,90,42}), 
        Hypno(type.Psychic,type.Psychic,new int[]{483,85,73,70,73,115,67}), 
        Krabby(type.Water,type.Water,new int[]{325,30,105,90,25,25,50}), 
        Kingler(type.Water,type.Water,new int[]{475,55,130,115,50,50,75}), 
        Voltorb(type.Electric,type.Electric,new int[]{330,40,30,50,55,55,100}),
        Electrode(type.Electric,type.Electric,new int[]{480,60,50,70,80,80,140}), 
        Exeggcute(type.Grass,type.Psychic,new int[]{325,60,40,80,60,45,40}), 
        Exeggutor(type.Grass,type.Psychic,new int[]{520,95,95,85,125,65,55}), 
        Cubone(type.Ground,type.Ground,new int[]{320,50,50,95,40,50,35}), 
        Marowak(type.Ground,type.Ground,new int[]{425,60,80,110,50,80,45}), 
        Hitmonlee(type.Fighting,type.Fighting,new int[]{455,50,120,53,35,110,87}), 
        Hitmonchan(type.Fighting,type.Fighting,new int[]{455,50,105,79,35,110,76}), 
        Lickitung(type.Normal,type.Normal,new int[]{385,90,55,75,60,75,30}), 
        Koffing(type.Poison,type.Poison,new int[]{340,40,65,95,60,45,35}), 
        Weezing(type.Poison,type.Poison,new int[]{490,65,90,120,85,70,60}), 
        Rhyhorn(type.Ground,type.Rock,new int[]{345,80,85,95,30,30,25}), 
        Rhydon(type.Ground,type.Rock,new int[]{485,105,130,120,45,45,40}), 
        Chansey(type.Normal,type.Normal,new int[]{450,250,5,5,35,105,50}), 
        Tangela(type.Grass,type.Grass,new int[]{435,65,55,115,100,40,60}), 
        Kangaskhan(type.Normal,type.Normal,new int[]{490,105,95,80,40,80,90}), 
        Horsea(type.Water,type.Water,new int[]{295,30,40,70,70,25,60}), 
        Seadra(type.Water,type.Water,new int[]{440,55,65,95,95,45,85}), 
        Goldeen(type.Water,type.Water,new int[]{320,45,67,60,35,50,63}), 
        Seaking(type.Water,type.Water,new int[]{450,80,92,65,65,80,68}), 
        Staryu(type.Water,type.Water,new int[]{340,30,45,55,70,55,85}), 
        Starmie(type.Water,type.Psychic,new int[]{520,60,75,85,100,85,115}), 
        MrMime(type.Psychic,type.Psychic,new int[]{460,40,45,65,100,120,90}), 
        Scyther(type.Bug,type.Flying,new int[]{500,70,110,80,55,80,105}), 
        Jynx(type.Ice,type.Psychic,new int[]{455,65,50,35,115,95,95}), 
        Electabuzz(type.Electric,type.Electric,new int[]{490,65,83,57,95,85,105}), 
        Magmar(type.Fire,type.Fire,new int[]{495,65,95,57,100,85,93}), 
        Pinsir(type.Bug,type.Bug,new int[]{500,65,125,100,55,70,85}), 
        Tauros(type.Normal,type.Normal,new int[]{490,75,100,95,40,70,110}), 
        Magikarp(type.Water,type.Water,new int[]{200,20,10,55,15,20,80}), 
        Gyarados(type.Water,type.Flying,new int[]{540,95,125,79,60,100,81}), 
        Lapras(type.Water,type.Ice,new int[]{535,130,85,80,85,95,60}), 
        Ditto(type.Normal,type.Normal,new int[]{288,48,48,48,48,48,48}), 
        Eevee(type.Normal,type.Normal,new int[]{325,55,55,50,45,65,55}), 
        Vaporeon(type.Water,type.Water,new int[]{525,130,65,60,110,95,65}), 
        Jolteon(type.Electric,type.Electric,new int[]{525,65,65,60,110,95,130}), 
        Flareon(type.Fire,type.Fire,new int[]{525,65,130,60,95,110,65}), 
        Porygon(type.Normal,type.Normal,new int[]{395,65,60,70,85,75,40}), 
        Omanyte(type.Rock,type.Water,new int[]{355,35,40,100,90,55,35}), 
        Omastar(type.Rock,type.Water,new int[]{495,70,60,125,115,70,55}), 
        Kabuto(type.Rock,type.Water,new int[]{355,30,80,90,55,45,55}), 
        Kabutops(type.Rock,type.Water,new int[]{495,60,115,105,65,70,80}), 
        Aerodactyl(type.Rock,type.Flying,new int[]{515,80,105,65,60,75,130}), 
        Snorlax(type.Normal,type.Normal,new int[]{540,160,110,65,65,110,30}), 
        Articuno(type.Ice,type.Flying,new int[]{580,90,85,100,95,125,85}), 
        Zapdos(type.Electric,type.Flying,new int[]{580,90,90,85,125,90,100}), 
        Moltres(type.Fire,type.Flying,new int[]{580,90,100,90,125,85,90}), 
        Dratini(type.Dragon,type.Dragon,new int[]{300,41,64,45,50,50,50}), 
        Dragonair(type.Dragon,type.Dragon,new int[]{420,61,84,65,70,70,70}), 
        Dragonite(type.Dragon,type.Flying,new int[]{600,91,134,95,100,100,80}), 
        Mewtwo(type.Psychic,type.Psychic,new int[]{680,106,110,90,154,90,130}), 
        Mew(type.Psychic,type.Psychic,new int[]{600,100,100,100,100,100,100});
        
        private final type type1;
        private final type type2;
        private final int[] battleData;
        
        private pokemon(type type1, type type2, int[] battleData) {
            this.type1 = type1;
            this.type2 = type2;
            this.battleData = battleData;
        }
        
        public type getType1() {
            return this.type1;
        }
        
        public type getType2() {
            return this.type2;
        }
        
        public int[] getBattleData() {
            return this.battleData;
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
        
        public double[] getBattleCoefficients() {
            return this.battleCoefficients;
        }
    }
    
    public enum badge {
        Boulder,
        Cascade,
        Thunder,
        Rainbow,
        Soul,
        Marsh,
        Volcano,
        Earth
    }
}