/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geni;
import geni.data.*;

/**
 *
 * @author PCuser
 */
public class attack {
    public enum move {
        //Move Name, Power Points, Base Power, Accuracy, Type, TM#, Target(0 self, 1 enemy),Move Effect(0 Attack, 1 Buff, 2 Debuff) Description
        Absorb("Absord",20,20,100,type.Grass,0,1,0,"A GRASS-type attack. It adds half the HP it drained from the target to the attacker's HP."),
        Acid("Acid",30,40,100,type.Poison,0,1,0,"A Poison-type attack. Has one-in-three chance of lowering the target's DEFENSE."),
        AcidArmor("Acid Armor",40,0,100,type.Poison,0,0,1,"Melts the user's body for protection. A move that sharply raises DEFENSE."),
        Agility("Agility",30,0,100,type.Psychic,0,0,1,"A special technique that greatly boosts the user's SPEED. Can normally be used up to three times."),
        Amnesia("Amnesia",20,0,100,type.Psychic,0,0,1,"Sharply raises the user's SPECIAL stat. Also increases protection against special attacks."),
        AuroraBeam("Aurora Beam",20,65,100,type.Ice,0,1,0,"An Ice-type attack. Has a one-in-three chance of reducing the target's ATTACK power."),
        Barrage("Barrage",20,15,85,type.Normal,0,1,0,"Several spheres are thrown consecutively at the target to inflict damage."),
        Barrier("Barrier",30,0,100,type.Psychic,0,0,1,"Instantly forms a barrier between the user and the opponent. DEFENSE is sharply increased."),
        Bide("Bide",10,0,100,type.Normal,34,0,2,"The user waits for several turns. At the end, it returns double the damage it received."),
        Bind("Bind",20,15,74.6,type.Normal,0,1,2,"Traps and squeezes the target over several turns. The target cannot move while under attack."),
        Bite("Bite",25,60,100,type.Normal,0,1,0,"A bite made using sharp fangs. This may cause the opponent to flinch, and it might not attack."),
        Blizzard("Blizzard",5,120,90,type.Ice,14,1,0,"The strongest ICE-type attack. Has a one-in-ten chance of freezing the target solid.");
        
        private final String name;
        private final int powerPoints;
        private final double basePower;
        private final double accuracy;
        private final type moveType;
        private final int TM;
        private final int target;
        private final int moveEffect;
        private final String description;
        
        private move(String name, int powerPoints, double basePower, double accuracy, type moveType, int TM, int target, int moveEffect, String description) {
           this.name = name;
           this.powerPoints = powerPoints;
           this.basePower = basePower;
           this.accuracy = accuracy;
           this.moveType = moveType;
           this.TM = TM;
           this.target = target;
           this.moveEffect = moveEffect;
           this.description = description;
        }
        
        public String getName() {
            return this.name;
        }
        
        public int getPowerPoints() {
            return this.powerPoints;
        }
        
        public double getBasePower() {
            return this.basePower;
        }
        
        public double getAccuracy() {
            return this.accuracy;
        }
        
        public type getMoveType() {
            return this.moveType;
        }
        
        public int getTM() {
            return this.TM;
        }
        
        public int getTarget() {
            return this.target;
        }
        
        public int getMoveEffect() {
            return this.moveEffect;
        }
        
        public String getDescription() {
            return description;
        }
    }
}
