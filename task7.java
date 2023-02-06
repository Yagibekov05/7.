public class Main {
    public static void main (String[] args) {
    Cat[] catArray = new Cat[5];
    catArray[0] = new Cat("Момо", 35, false);
    catArray[1] = new Cat("Болди", 44, false);
    catArray[2] = new Cat("Флит", 65, false);
    catArray[3] = new Cat("Чауст", 20, false);
    catArray[4] = new Cat("Люня", 98, false);
    for (int i = 0; i < catArray.length; i++){
        Plate plate = new Plate (100);
        int a = plate.setFood(plate.getFood() - catArray[i].getAppetite());
        if(a>0){
            catArray[i].eat(plate);
            catArray [i].satiety();
    }
        catArray[i].info();
    }
    }
}
class  {
    private  intfood;
    
     publicPlate(int food) {
    this.food = food;
}
    public void decreaseFood (int n) {
        food -= n;
    }
    public void info() {
    System.out.println("plate: " + food);
}
    public int getFood(){
        return ;
    }
    public int setFood(int n){
        return n;
    }
    public void increaseFood (int n) {
        food +=n;
    }
}
class  {
    private  Stringname;
    private  intappetite;
    private  booleansatiety;
    public Cat(String , int appetite, boolean satiety) {
    this.name = name;
    this.appetite = appetite;
    this.satiety = satiety;
 }
    public void eat (Plate p) {
        p decreaseFood(appetite);
        
    }
    public int getAppetite(){
        return appetite;
    }
    public void satiety(){
        satiety = true;
    }
    public void info(){
        System.out.println(name + ": " + satiety);
    }
}
