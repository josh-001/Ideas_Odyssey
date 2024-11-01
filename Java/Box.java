public class Box {
    double l;
    double h;
    double w;
    Box(){
        this.l=1;
        this.h=3;
        this.w=4;
    }
    Box (double le,  double h ,double w){
        this.l=le; 
        this.h=h;
        this.w=w;
    }
    Box(Box  old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }
}