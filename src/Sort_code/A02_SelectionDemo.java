package Sort_code;
//选择排序
public class A02_SelectionDemo {
    public static void main(String[] args) {
        //1、定义数组
        int[] arr={2,4,5,3,1};

        //外循环:循环几轮
        //i:表示这一轮中，我拿着哪个索引上的数据跟后面的数据进行比较并交换
        for (int i = 0; i < arr.length-1; i++) {
            //内循环：每一轮我要干什么事？
            //拿着i跟i后面的数据进行比较交换
            for (int j = i+1; j < arr.length; j++){ //内循环中的索引是从i+1开始的
                if(arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}
