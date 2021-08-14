//Creating a droid class
public class Droid {

  //Droid class's states/attributes
  String name;
  int batteryLevel;

  //Droid constructor
  public Droid(String droidName){
    //assigning the parameter value of droidName to the name instance field
    name = droidName;
    //setting the battery level to a 100 so all instances of Droid class will have the same battery level to begin with
    batteryLevel = 100;
  }

  //toString method to be able to print useful data onto the console
  public String toString(){
    System.out.println("------------------------------------------");
    //introduction to the droid
    return "Hello! My name is " + name + ".\nIt's nice to meet you!";
  }

  //performTask method
  public void performTask(String task){
    System.out.println("\n" + name + " is: " + task);

    //if the droid is eating or sleeping as their task, then the batteryLevel is increased by 10
    if(task.equals("eating") || task.equals("sleeping")) {
      //if the batteryLevel is already at 100, then eating or sleeping won't increase the batteryLevel anymore
      if(batteryLevel == 100) {
        batteryLevel = batteryLevel;
      }
      //if the batteryLevel is not at hundred, then it is increased by 10
      else {
        int newBatteryLevel = batteryLevel + 10;
        batteryLevel = newBatteryLevel;
      }
    }
    else {
      //batteryLevel reduces by 10 if the droid performs a task
      int newBatteryLevel = batteryLevel - 10;
      batteryLevel = newBatteryLevel;
    }

    //printing battery level after performing a task
    System.out.println("After " + task + ", " + name + "'s battery level is " + batteryLevel + "%");
  }

  //main method
  public static void main(String[] args){

    //creating a new instance of Droid class called Codey
    Droid BoyDroid = new Droid("Codey");

    //Introducing Codey
    System.out.println(BoyDroid);
    //making him clean by calling the performTask method
    BoyDroid.performTask("cleaning");
    //making him cook by calling the performTask method
    BoyDroid.performTask("cooking");
    //making him walk the dog by calling the performTask method
    BoyDroid.performTask("walking the dog");

    //creating a new instance of Droid class called Codey
    Droid girlDroid = new Droid("Belle");

    //Introducing Belle
    System.out.println(girlDroid);
    //making her walk by calling the performTask method
    girlDroid.performTask("walking");
    //making her learn by calling the performTask method
    girlDroid.performTask("learning");
    //making her eat by calling the performTask method
    girlDroid.performTask("eating");
    //making her bake by calling the performTask method
    girlDroid.performTask("baking");
    //making her sleep by calling the performTask method
    girlDroid.performTask("sleeping");
    //making her eat by calling the performTask method
    girlDroid.performTask("eating");
    //making her sleep by calling the performTask method
    girlDroid.performTask("sleeping");

  }
}
