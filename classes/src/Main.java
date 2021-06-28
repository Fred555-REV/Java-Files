import java.sql.SQLOutput;

class Dog {
    private int legs = 4;
    public String hair;

    public Dog(String hair) {

        this.hair = hair;
    }

    public Dog () {}
    public void speak() {

        System.out.println("A-woof");
    }

    public int getLegs() {return legs;}
}

class Poodle extends Dog {
    public Poodle(String hair){
//        //This uses the Contructor from Dog and passing the hair to the Dog constructor on line 11
        super(hair);
    }
    public void speak() {
        System.out.println("Yip");
    }

    public void speak(String bark) {
        System.out.println(bark);
    }
    public String toString(){
        return "This poodle has " + getLegs() + " legs with " + hair + " fur";
    }
}

public class Main {

    public static void main(String[] args) {
	    Dog Jackson = new Dog( "red");
	    Jackson.speak();
	    Poodle Jackdaughter = new Poodle("White");
        Jackdaughter.speak();
	    Jackdaughter.speak("Hello World");
	    System.out.println(Jackdaughter.toString());
    }
}

//Joel help with code


////Poodle inherits the properties/methods of Dog (child class of Dog)
//class Poodle extends Dog{
//    public Poodle(String hair){
//        //This uses the Contructor from Dog and passing the hair to the Dog constructor on line 11
//        super(hair);
//    }
//    //overriding the speak in Dog class
//    public void speak(){
//        System.out.println("a-woof");
//    }
//    //overloading the speak in Poodle class
//    public void speak(String bark){
//        System.out.println(bark);
//    }
//    public String toString(){
//        return "This poodle has " + getLegs() + " legs with " + fur + " fur";
//    }
//}
//public class Main {
//    //need to have a "main" function because your program will not run without it
//    public static void main(String[] args) {
//        Dog firstDog = new Dog("white");
//        Poodle floofy = new Poodle("black");
//        firstDog.speak();
//        floofy.speak("Hello world");
//        System.out.println(floofy.toString());
//    }
