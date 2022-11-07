package Sort_code;
//插入排序
public class A03_insertDemo {
    public static void main(String[] args) {
        int[] arr={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};

        //1.找到无序的哪一组数组是从哪个索引开始的。这里要找到2
        int startIndex=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[i+1]){
                startIndex=i+1;
                break;
            }
        }

        //2.遍历从startIndex开始到最后一个元素，依次得到无序的哪一组数据中的每一个元素
        for (int i= startIndex; i < arr.length; i++) {
            //问题：如何把遍历到的数据，插入到前面有序的这一组中

            //记录当前要插入数据的索引
            int j=i;

            while(j>0 && arr[j]<arr[j-1]){//这里实现将无序数组中的元素与有序数组中的元素进行比较，并插入有序数组中的指定位置
                //交换位置
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        printarr(arr);
    }

    public static void printarr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
