import java.util.ArrayList;
import java.util.List;

public class Box <T>{
    private List<T> list = new ArrayList<>();

    public Box() {
    }
    public void addBox(T t){
        list.add(t);
    }
    public float getWeight(){
        float weight = 0;
        for (int i = 0; i < list.size(); i++) {
            weight += weight;

        }
        return weight;
    }
    public void boxInfo(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1)+" "+list.get(i));
        }

    }
    public void addFruitInBox(Box<T> someBox ) {
        someBox.list.addAll(this.list);
        this.list.clear();// коробка не очищается ?
    }

    public void addFruit(T someFruit){
        list.add(someFruit);


    }


}
