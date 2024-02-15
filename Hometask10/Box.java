package Hometask10;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {
    private final List<T> fruits=new ArrayList<>();

       public void addFruit(T fruit) {
        fruits.add(fruit);
    }


    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruits) {
            if(fruit instanceof Apple){
                weight+=1.0f;
            } else if (fruit instanceof Orange) {
                weight+=1.5f;
            }
        }
        return weight;
    }
    public boolean compare(Box<?>otherBox){
        return Math.abs(this.getWeight()-otherBox.getWeight())<0.0001;
    }
    public void transferFruitsTo(Box<T>otherBox){
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
