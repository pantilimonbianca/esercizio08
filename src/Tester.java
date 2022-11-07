public class Tester {
    public static void main(String[] args) {
        SmartphonePrice p1=new SmartphonePrice("Euro",600.0);
        SmartphonePrice p2=new SmartphonePrice("Euro", 450.0);
        SmartphonePrice p3=new SmartphonePrice("Dollaro", 700.0);
        SmartphonePrice p4=new SmartphonePrice("Dollaro", 300.0);

        Smartphone iphone=new Smartphone("Iphone","XR",5000, p1, p3);
        Smartphone samsung= new Smartphone("Samsung","S20",4000,p2, p4);

        System.out.println(samsung + "\n" + iphone);

        if(iphone.equals(samsung)){
            System.out.println("Sono uguali");
        }else{
            System.out.println("Non sono uguali");
        }

        Smartphone clone= null;

        try{
            clone= (Smartphone)samsung.clone();
        }catch(CloneNotSupportedException exception) {
            exception.printStackTrace();
            System.out.println("Questo cellulare non si può clonare");
        }

        System.out.println(clone);

        if(samsung.equals(clone)){
            System.out.println("Il secondo smartphone è uguale al clone");
        }


    }
}
