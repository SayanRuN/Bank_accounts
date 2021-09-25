public class VegetableBox<T, K extends Vegetable> {
    T obj;
    K obj2;

    public VegetableBox(T obj, K obj2) {
        this.obj = obj;
        this.obj2 = obj2;
    }

    public K getObj() {
        return obj2;
    }
}