public class Elefant extends Animal{
    private double lungimeTrompa;
    private double lungimeColti;
    public Elefant(String name, int age, double lungimeTrompa, double lungimeColti) {
        super(name, age);
        this.lungimeTrompa = lungimeTrompa;
        this.lungimeColti = lungimeColti;
    }

    public double getLungimeColti() {
        return lungimeColti;
    }
    public double getLungimeTrompa() {
        return lungimeTrompa;
    }
    @Override
    public String toString(){
        return "Elefant: "+getName()+", varsta: "+getAge()+", lungime trompa: "+lungimeTrompa+", lungime colti: " + lungimeColti;
    }
}
