package Exercice9;

public class Point{
    private int x;
    private int y;

    public Point(){}
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double distance(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }
    public double distance(Point p){
        return Math.sqrt(Math.pow((p.getX() - this.x),2) + Math.pow((p.getY() - this.y),2));
    }
    public double distance(int x , int y){
        return Math.sqrt(Math.pow((this.x - x),2) + Math.pow((this.y - y),2));
    }
    public static void main(String[] args){
        Point A = new Point(5,6);
        Point B = new Point(9,25);
        System.out.println("A.distance() = " + A.distance());
        System.out.println("A.distance(B) = " + A.distance(B));
        System.out.println("A.distance(9,25) = " + A.distance(9,25));
    }
}