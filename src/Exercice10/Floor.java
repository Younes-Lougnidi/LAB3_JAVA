package Exercice10;

public class Floor {
    private double width;
    private double length;
    public Floor(double w, double l){
        if(w < 0){
            width = 0;
        }
        else{
            width = w;
        }
        if(l < 0){
            length = 0;
        }
        else {
            length = l;
        }
    }
    public double getArea(){
        return  width * length;
    }

}
