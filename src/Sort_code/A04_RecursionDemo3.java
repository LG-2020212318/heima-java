package Sort_code;
//递归求5的阶乘
public class A04_RecursionDemo3 {
    public static void main(String[] args) {
        System.out.println(getFactorialRecursion(5));
    }

    public static int getFactorialRecursion(int num){
        if(num==1){//出口
            return 1;
        }

        return num * getFactorialRecursion(num-1);
    }
}
