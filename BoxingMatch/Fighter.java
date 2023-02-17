package BoxingMatch;

public class Fighter {
    int dodge;
    String name;
    int damage,health,weight;

    Fighter(int damage,int health,int weight,String name,int dodge){
        this.name=name;
        this.health=health;
        this.weight=weight;
        this.damage=damage;
        if(dodge<=100&&dodge>=0){
            this.dodge=dodge;
        }else{
            this.dodge=0;
        }

    }

    int hit(Fighter foe){
        if(foe.isDodge()){
            System.out.println(foe.name+" gelen hasarı dodgeladı");
            return foe.health;
        }
        System.out.println(this.name+"=>"+" "+this.damage+" kadar hasar verdi");
        foe.health-=this.damage;
        if(foe.health-this.damage<0)
            return 0;
        return foe.health;
    }
    boolean isDodge(){
        double randomNumber=Math.random()*100;
        boolean change;
        return randomNumber<=this.dodge;
    }
}
