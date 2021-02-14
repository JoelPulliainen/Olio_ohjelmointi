package Mainclass;

/**
 *
 * @author joelp
 */
public class Character {
    
    
    public String Name;
    WeaponBehavior weapon;
    
    public Character(int w) {
        this.weapon = new WeaponBehavior(w);


    
    }
    
    void fight() {
        System.out.println(Name + " fights with weapon " + weapon.WeaponName);
    }



    public class WeaponBehavior {
        
        public String WeaponName;
        
        public WeaponBehavior(int w) {
            if (w == 1) {
                KnifeBehavior knife = new KnifeBehavior();    
            }
            if (w == 2) {
                AxeBehavior axe = new AxeBehavior();
            }
            if (w == 3) {
                SwordBehavior sword = new SwordBehavior();
            }
            if (w == 4) {
                ClubBehavior club = new ClubBehavior();
            }
        }

                
        void useWeapon() {
            System.out.print("with " + WeaponName);  
        }

        class AxeBehavior {
            AxeBehavior() {
                WeaponName = "Axe";
            }

        }

        class SwordBehavior {
            SwordBehavior() {
                WeaponName  = "Sword";
            }
        }

        class KnifeBehavior {
            KnifeBehavior() {
                WeaponName = "Knife";
            }

        }

        class ClubBehavior {
            ClubBehavior() {
                WeaponName = "Club";
            }

        }
    
    }  
}


        
    class King extends Character {

        public King(int w) {
            super(w);
            Name = "King";
        }
        

    }      
                
    class Knight extends Character {

        public Knight(int w) {
            super(w);
            Name = "Knight";
        }

    }            

    class Queen extends Character {  

        public Queen(int w) {
            super(w);
            Name = "Queen";
        }

    }
    
    class Troll extends Character {

        public Troll(int w) {
            super(w);
            Name = "Troll";
        }

    }    
