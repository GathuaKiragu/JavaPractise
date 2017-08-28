public class App{
  public static void main(String[] args){
    Animal zebra = new Animal();
    zebra.mName= "Zebra";
    zebra.mGender = "Female";
    zebra.mAge = 15;
    zebra.mColor = "Black";

    Animal monkey = new Animal();
    monkey.mName= "Baboon";
    monkey.mGender = "Female";
    monkey.mAge = 25;
    monkey.mColor = "white";

    Animal leopard = new Animal();
    leopard.mName= "Jaguar";
    leopard.mGender = "Male";
    leopard.mAge = 9;
    leopard.mColor = "black";

    Animal wolve = new Animal();
    wolve.mName= "wolve";
    wolve.mGender = "Male";
    wolve.mAge = 7;
    wolve.mColor = "White";

    Animal[] singleAnimal = {zebra, monkey, leopard, wolve};

    for(Animal individualAnimal : singleAnimal){
      System.out.println("#################################### \n");
      System.out.println(individualAnimal.mName);
      System.out.println(individualAnimal.mAge);
      System.out.println(individualAnimal.mColor);
      System.out.println(individualAnimal.mGender);
    }
  }
}
