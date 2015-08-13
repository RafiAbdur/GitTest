public class Task1{
public static void main(String []args){

Human h = new Human("Abdur");
h.sayName();
getNewHuman().sayName();
h.cry();
h.nag();
h.sleep();
System.out.println(addNewHand());
}

public static String feature2(String s){
return s;
}

public static Human getNewHuman(){
return new Human("Alien");
}

public static String addNewHand(){
return "Hands addded";
}

}
