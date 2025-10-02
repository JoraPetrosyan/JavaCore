package homework.homeworke6;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(13);
        da.add(13);
        da.add(13);
        da.add(13);
        da.add(13);
        da.add(13);
        da.add(13);
        da.add(13);
        da.add(13);
        da.add(13);
        da.add(13);
        System.out.println(da.getByIndex(18));
        da.print();
    }
}