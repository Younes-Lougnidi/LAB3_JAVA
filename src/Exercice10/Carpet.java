package Exercice10;

public class Carpet {
    private double cost;
    public Carpet(double c){
        if (c < 0){
            cost = 0;
        }
        else{
            cost = c;
        }
    }
    public double getCost(){
        return cost;
    }
}
