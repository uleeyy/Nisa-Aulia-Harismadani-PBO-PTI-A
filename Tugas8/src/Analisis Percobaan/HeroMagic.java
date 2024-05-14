public class HeroMagic extends Hero {

    private String type;

    HeroMagic(String name, double health) {
        super(name, health);
        this.type = "Intel";
        //TODO Auto-generated constructor stub
    }

    public void display() {
        System.out.println(this.getName() + " is a " + this.type + " Hero. ");
        System.out.println("------------------------------ \n Output dari Magic ");
    }
}