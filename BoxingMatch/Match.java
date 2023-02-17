package BoxingMatch;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2,int minWeight, int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }
    public  void run(){
        if(isCheck()){
            while(this.f1.health>0&&this.f2.health>0){
               while(true){
                   System.out.println("======== YENİ ROUND ===========");
                if((Math.random()*10.0)<5){
                    f2.health=f1.hit(f2);
                    System.out.println("Rakibin sağlığı"+f2.health);
                    break;
                }else{
                    f1.health=f2.hit(f1);
                    System.out.println("Rakibin sağlığı: "+f1.health);
                    break;
                }
               }
            }
        }else{
            System.out.println("Sporcuların sikletleri uymuyor");
        }
    }
    public boolean isCheck(){

        return ((this.f1.weight>=minWeight&&this.f1.weight<=maxWeight)&&(this.f2.weight>=minWeight&&this.f2.weight<=maxWeight) ? true:false);

    }
    public boolean isWin(){
        if(this.f1.health==0){
            System.out.println(f2.name+" Maçı kazandı!!");
            return true;
        }else if(this.f2.health==0){
            System.out.println(f2.name+" Maçı kazandı!!");
            return true;
        }
        return false;
    }
}
