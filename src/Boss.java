public class Boss extends GameEnity {
    Weapon weapon = new Weapon();


    public  String printInfo(){
        return "Health"+gethEalth() + " урон" + gethIt();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
