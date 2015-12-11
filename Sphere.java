public class Sphere extends Circle implements Volumeable{

    public Sphere(double radius, String name){
	super(radius,name);
    }

    public double getVolume(){
	return (4./3)*Math.PI*Math.pow(getRadius(),3);
    }

    public String toString(){
	return "Sphere "+ getName() + "with radius of " + getRadius();
    }

}
