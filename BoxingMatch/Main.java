package BoxingMatch;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new  Fighter(10,120,100,"MuhammedAli",80);
        Fighter f2 = new  Fighter(20,85,85,"ErenKahveci",60);

        Match match = new Match(f1,f2,80,100);
        match.run();
    }

}
