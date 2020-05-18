
package fibonacicalculator;

public class FibonaciCalculator {
    public static int fc(int no1){
       if (no1 <= 1){
           return no1;
       }
       return fc(no1-1)+fc(no1-2);
    }
    public static int fc2(int a, int b, int n){
        System.out.println("-----------------");
        int c = 0;
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < n; i++) {
            if(a == 0 || b == 0 || n == 0){
                break;
            }
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
        return 0;
    }
    public static void main1(String[] args) {
        for (int i = 0; i < 14; i++) {  
        System.out.println(fc(i));
        }
        System.out.println(fc2(1, 1, 11));
    }

}
