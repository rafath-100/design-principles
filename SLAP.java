//SLAP - Single Level of Abstraction Principle

public class SLAP 
{
    public static void main(String args[])
    {
        getDetailsAndMail();
    }   
    public static void getDetailsAndMail()
    {
        //code to fetch details from database
        System.out.println("Fetching details from database");
        String details="Details";
        emailTheUser(details);
        
    } 
    public static void emailTheUser(String details)
    {
        //code to email the user
        System.out.println("sending mail to user");
    }
}
