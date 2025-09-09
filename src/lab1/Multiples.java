package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples());
    }

    public static int multiples(int n, int a, int b) {
        int count = 0;
        for(int j=1;j<n;j++){
            if(j%a == 0 || j%b == 0) {
                count++;
            }
        }

        return count;
    }

    public static int multiples() {
        int count = 0;
        for(int j=1;j<1000;j++){
            if(j%3 == 0 || j%5 == 0) {
                count++;
            }
        }

        return count;
    }
}
