package singleLayer;

public class ShapeFactory {
    // can have Shape object
    public Shape getShape(String name){
        switch(name){
            case "Square":
                return new Square();
            case "Rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
