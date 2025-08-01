interface Calling{
    // creating methods for calling Interface
    void voiceCall();
    void videoCall();
}

interface Chating{
    // creating methods for calling Interface
    void email();
    void sms();
}


class Redmi implements Calling, Chating{
    
    public void voiceCall(){
        System.out.println("Implemented Voice call for Redmi");
    }

    public void videoCall(){
        System.out.println("Implemented Video call for Redmi");
    }

    public void email(){
        System.out.println("email sent from Redmi");
    }

    public void sms(){
        System.out.println("SMS sent from Redmi");
    }

    // Redmi class ka own method
    public void camera(){
        System.out.println("Camera started");
    }
}

public class phoneInterface {
    public static void main(String[] args){
        Redmi R1= new Redmi();
        
        R1.voiceCall();
        R1.sms();
        R1.camera();
    }
}
