class Box1<T> {    private T value;    public T getValue() {        return value;    }    public void setValue(T value) {        this.value = value;    }}public class Q4 {    public static void main(String[] args) {        Box1<String> stringBox = new Box1<>();        stringBox.setValue("Hello");        stringBox.setValue("World");        System.out.println("String in stringBox: " + stringBox.getValue());        Box1<Integer> integerBox = new Box1<>();        integerBox.setValue(10);        integerBox.setValue(20);        System.out.println("Integer in integerBox: " + integerBox.getValue());        Box1<Object> objectBox = new Box1<>();        objectBox.setValue("String value");        System.out.println("Object box containing string: " + objectBox.getValue());        objectBox.setValue(30);        System.out.println("Object box containing integer: " + objectBox.getValue());    }}