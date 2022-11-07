package Sort_code;
//冒泡排序
public class A01_BubbleDemo1 {
    public static void main(String[] args) {
        //1、定义数组
        int[] arr={2,4,5,3,1};

        //利用冒泡排序将数组中的元素变成1 2 3 4 5
        //第一轮结束之后，最大值在数组的最右边 .....5
        //外循环：表示我要执行多少轮，如果有n个数据那么执行n-1轮
        for (int i = 0; i < arr.length-1; i++) {
            //内循环：每一轮中我如何比较数据并找到当前的最大值
            //-1：为防止索引越界
            //-i:提高效率，每一轮执行的次数应该比上一轮少一次
            for(int j=0;j<arr.length-1-i;j++){//选中j，按shift+f6即可替换循环中所有用到j的地方
                //i依次表示数组中的每一个索引0 1 2 3 4
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
