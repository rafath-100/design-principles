// DRY : Dont Repeat Yourself

class Laundry {
    public void washColorFullClothes()
    {
        System.out.println("Washing Color Full clothes ");
        commonMethod();
    }
    public void washWhiteColorClothes()
    {
        System.out.println("Washing White color clothes");
        commonMethod();
    }
    public void commonMethod()
    {
        System.out.println("Soaking the clothes");
    }
}
public class DRY {
    public static void main(String ...args){
        Laundry obj = new Laundry();
        obj.washColorFullClothes();
        obj.washWhiteColorClothes();
    }
}