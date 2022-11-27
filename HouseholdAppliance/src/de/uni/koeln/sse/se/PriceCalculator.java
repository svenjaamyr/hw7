package de.uni.koeln.sse.se;

public class PriceCalculator implements Visitor{
    private double tmpPrice;

    public void visitElectronic(Electronic e){
        if (e.getFragile() == true){
            tmpPrice = (double)e.getWeight()/10 * 5;
        } else {
            tmpPrice = (double)e.getWeight()/15 * 5;
        }
    }

    public void visitFurniture(Furniture f){
        tmpPrice = (double)f.weight / 20 * 5;

    }

    public void visitGlass(Glass g){
        if(g.getTickness()==1){
            tmpPrice = (double)g.lenght/100 *2;
        }
        if (g.getTickness() == 2){
            tmpPrice = (double)g.lenght/100 * 1.2;
        }
        if(g.getTickness() == 3){
            tmpPrice= (double)g.getTickness()/100*0.7;
        }

    }
    public double getPrice(HouseholdItem h){
        tmpPrice = 0;
        h.accept(this);
        return tmpPrice;
    }
}
