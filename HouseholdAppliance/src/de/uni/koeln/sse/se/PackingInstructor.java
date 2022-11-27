package de.uni.koeln.sse.se;

public class PackingInstructor implements Visitor{
    private String tmpInstructions;
    public void visitElectronic(Electronic e) {
        tmpInstructions = " >should be covered with Polyethylene foam film and packed in a box with dimension " + (e.getHeight() + 1) + "x" + (e.getLenght() + 1) + "x" + (e.getWidth() + 1);
    }
    public void visitFurniture(Furniture f) {
        tmpInstructions = " >should be covered with waterproof covers with area of: " + f.getLenght() + "x" + f.getWidth();
    }
    public void visitGlass(Glass g) {
        tmpInstructions = " >should be wrapped with Bubble wraps and packed in a box with dimension: " + (g.getHeight() + 1) + "x" + (g.getLenght() + 1) + "x" + (g.getWidth() + 1);
    }
    public String getInstructions(HouseholdItem h) {
        tmpInstructions = "";
        h.accept(this);
        return tmpInstructions;
    }
}
