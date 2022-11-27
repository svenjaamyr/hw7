package de.uni.koeln.sse.se;

public interface Visitor {
    public void visitElectronic(Electronic e);
    public void visitFurniture(Furniture f);
    public void visitGlass(Glass g);
}
