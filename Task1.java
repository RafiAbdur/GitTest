public class Task1{
public static void main(String []args){

Human h = new Human("Tanzil");
h.sayName();
getNewHuman().sayName();
h.sadFace();
}

public static String feature1(int id){
return "" + id;
}

public static String feature2(String s){
return s;
}

public static Human getNewHuman(){
return new Human("Alien");
}

}
