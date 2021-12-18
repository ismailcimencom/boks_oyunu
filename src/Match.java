public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }
    void start(){
        if(isCheck()){
            while (this.f1.hp > 0 && this.f2.hp > 0){
                System.out.println("=====YENİ ROUND====");
                isWhoStart();
                if (isWin()){
                    break;
                }
                if (isWin()){
                    break;
                }
                System.out.println(this.f1.name + " Sağlık : " + this.f1.hp);
                System.out.println(this.f2.name + " Sağlık : " + this.f2.hp);
            }
        }else {
            System.out.println("Sporcuların sikletleri uymuyor!");
        }
    }
    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
    boolean isWin(){
        if (this.f1.hp == 0){
            System.out.println(this.f2.name + " Kazandı!");
            return true;
        }

        if (this.f2.hp == 0){
            System.out.println(this.f1.name + " Kazandı!");
            return true;
        } else {
            return false;
        }
    }
    void isWhoStart(){
        int who = (int)Math.random() * 2;
        if (who == 1){
            this.f2.hp = this.f1.hit(this.f2);
            this.f1.hp = this.f2.hit(this.f1);
        }  else {
            this.f1.hp = this.f2.hit(this.f1);
            this.f2.hp = this.f1.hit(this.f2);
        }
    }
}
