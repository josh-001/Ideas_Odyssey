public class Boxweight extends Box {
    double weight;

    Boxweight(){
        this.weight=30;
    }
    Boxweight(double l,double h,double w,double weight){
        super(l,w,h);
        this.weight=weight;

    }
}
