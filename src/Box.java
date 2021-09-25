public class Box<T, K extends Fruit> {
    T obj;
    K obj2;

    public Box(T obj, K obj2) {
        this.obj = obj;
        this.obj2 = obj2;
    }

    public K getObj() {
        return obj2;
    }
}