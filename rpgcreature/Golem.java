package rpgcreature;

import java.util.Random;

public class Golem extends Monster{
    private final static int CRITICAL_RATE = 5;
    public Golem(){
        super("ゴーレム",100,3,50);
    }
    @Override
    public void attack(Creature opponent) {
        if (!this.isThere())
            return;
        Random r = new Random();
        int damage = r.nextInt(5);
        System.out.printf("%sの攻撃！\n",getName());
        if( r.nextInt(100) < CRITICAL_RATE ){
            damage = 30;
            System.out.printf("%sのクリティカルヒット！\n",getName());
        }else{
            damage = r.nextInt(5) + 5;
        }
        opponent.damaged(damage);
        displayMessage(opponent,damage);
    }
}