public class Main {
    public static void main(String[] args) {
    //casting
    //double angka = 5.4;
    //int angka_int = (int)angka;
    //System.out.println(angka_int);
    
    //Object dengan class HeroIntel
    HeroIntel hero1 = new HeroIntel("Ucup",100); 
    hero1.display();
    
    //upcasting
    Hero heroUp = (Hero)hero1; 
    heroUp.display();
    //System.out.println(heroUp.getType()); //ini error
    
    //Object dgn class Hero
    Hero heroReg = new Hero("Boy",100); 
    heroReg.display();
    
    //downcasting
    //HeroAgility heroDown = (HeroAgility) heroReg; //ini error
    //heroDown.display();
    
    //heroUp dikembalikan ke hero1 
    HeroIntel hero2 = (HeroIntel) heroUp;
    hero2.display(); //ini berhasil downcasting

    //soal nomor 3
    // HeroAgility hero3 = (HeroAgility) heroUp; 
    // hero3.display();

    //soal nomor 4
    HeroIntel hero4 = new HeroIntel("ule", 100);
    System.out.println(hero4.type);
    HeroAgility hero5 = new HeroAgility("ule", 100);
    System.out.println(hero5.type);

    //soal nomor 5
    HeroMagic hero6 = new HeroMagic("ule", 100);
    hero6.display();
    Hero heroUp2 = (Hero) hero6;
    heroUp2.display();
    HeroMagic heroDown = (HeroMagic) heroUp2;
    heroDown.display();

    
    
    }
}