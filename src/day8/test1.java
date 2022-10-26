package day8;

public class test1 {
    public static void main(String[] args) {
        String strA="abcde";
        String strB="ABC";
        boolean flag=check(strA,strB);
        if(flag){
            System.out.println("True");
        }
        else{
            System.out.println("flase");
        }
    }
    //定义一个方法检查字符串是否相等
    public static boolean check(String strA,String strB){
        for (int i = 0; i < strB.length(); i++) {
            state(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        return false;
    }

    //定义一个方法，旋转字符串
    public static String state(String str){
        char[] arr=str.toCharArray();//将字符串转化为字符数组
        char c=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=c;
        String str1=arr.toString();
        return str1;
    }
}