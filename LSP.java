//LSP- Liskov Substitution Principle
//It prescribes substitutablility of a class by its subclass.

class Bird
{
    //base functionality related to bird
    public void info()
    {
        System.out.println("I am a bird");
    }
}

class FlyingBird extends Bird 
{
    public void fly()
    {
        System.out.println("I am a flying bird");
    }
}

class Sparrow extends FlyingBird 
{
    // public void fly()
    // {
    //     System.out.println("I can fly");   
    // }
}

class Ostrich extends Bird 
{
    // public void fly()
    // {
    //     System.out.println("I cannot fly");
    // }

}

public class LSP 
{
    public static void main(String args[])
    {
        Ostrich bird=new Ostrich();
        bird.info();
    }
}
