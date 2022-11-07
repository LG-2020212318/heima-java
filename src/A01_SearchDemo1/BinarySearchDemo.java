package A01_SearchDemo1;
//二分查找
public class BinarySearchDemo {
    public static void main(String[] args) {

        int[] Arr={1,2,3,4,5,6,7,8,9,10};//注意差值查找适用于数组中的元素是均匀分布的
        int result=BinarySearch(Arr,3);
        System.out.println(result);
    }

    public static int BinarySearch(int[] arr,int num){
        int min=0;
        int max=arr.length-1;

        while(true){
            if(min>max){//循环结束写在最上面，因为循环开头min和max才被更新
                return -1;
            }

            int mid=min+(num-arr[min])/(arr[max]-arr[min])*(max-min);//差值查找的主要公式
            if(arr[mid]==num){
                return mid;
            }
            else if(arr[mid]<num){
                min=mid+1;
            }
            else if(arr[mid]>num){
                max=mid-1;
            }
        }
    }
}
