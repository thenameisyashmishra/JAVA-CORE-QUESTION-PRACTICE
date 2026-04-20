// Q66: Call by Value vs. Call by Reference demonstration.
public class Q66 {
    public static void modifyPrimitive(int value) {
        value = value + 5;
    }

    public static void modifyArray(int[] arr) {
        if (arr.length > 0) {
            arr[0] = arr[0] + 5;
        }
    }

    public static void main(String[] args) {
        int primitive = 10;
        int[] array = {10};
        modifyPrimitive(primitive);
        modifyArray(array);
        System.out.println("Primitive after method: " + primitive);
        System.out.println("Array after method: " + array[0]);
    }
}
