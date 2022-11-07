package Sort_code;

public class A05_QuickSortDemo {
    public static void main(String[] args) {
        int[] arr={6,1,2,7,9,3,4,5,10,8};

        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    /*参数一：我们要排序的数组
    * 参数二：要排序数组的起始索引
    * 参数三：要排序数组的结束索引
    * */
    public static void quickSort(int[] arr,int i,int j){
        //start，找比0索引大的
        int start=i;
        //end,找比0索引小的
        int end=j;

        if(start>end){//递归的出口,要写在basenum的前面
            return;
        }

        //basenum表示arr[0]基准数
        int basenum=arr[i];

        //利用循环找到要交换的数字，注意最外层的大循环是start!=end
        while(start!=end){
            while(true){
                //利用end从后往前找比基准数小的，注意要先移动end再移动start
                if(end<=start||arr[end]<basenum){
                break;
                    }
                    end--;
                }

            while(true){
                //利用start，从前往后开始找，找比基准数大的
                if(end<=start||arr[start]>basenum){
                break;
                    }
                start++;
                }

        //两个循环都结束了，说明到这里start和end已经找到，这里进行交换
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        }

        //最外层循环结束说明end==start，此时基准元素归位
        int temp2=arr[i];
        //i是传进来的参数，表示要排序数组的起始索引,
        // 注意此处arr[i]不能用bsenum替代，因为basenum仅表示一个数，不表示数组中的元素
        arr[i]=arr[start];
        arr[start]=temp2;

        //确定6左边的范围，重复刚刚所做的所有事
        quickSort(arr,i,start-1);

        //确定6右边的范围，重复刚刚所做的所有事
        quickSort(arr,start+1,j);
    }
}
