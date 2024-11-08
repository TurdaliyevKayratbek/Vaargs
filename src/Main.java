public class Main {
    public static void main(String[] args) {
        System.out.println(Delay(45, 4,6,7));
    }

    static boolean Delay(int a, int ... varargs) {
        for (int num : varargs) {
            if (num == a) {
                return true;
            }
        }
        return false;
    }
}
