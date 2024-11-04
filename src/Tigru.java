public class Tigru extends Animal{
    private double lungimeGheare;
    private int vitezaMaxima;
    public Tigru(String name, int age, double lungimeGheare, int vitezaMaxima) {
        super(name, age);
        this.lungimeGheare = lungimeGheare;
        this.vitezaMaxima = vitezaMaxima;
    }
    public double getLungimeGheare() {
        return lungimeGheare;
    }
    public int getVitezaMaxima() {
        return vitezaMaxima;
    }
    @Override
    public String toString(){
        return "Tigru: "+getName()+", varsta: "+getAge()+", lungime trompa: "+lungimeGheare+", lungime colti: " + vitezaMaxima;
    }
}
