package A01_SearchDemo1;
//块查找

public class BlockSearchDemo {
    public static void main(String[] args) {

        //每个块中的最大值要比后面的块的最小值小,分多少块的数量等于数据长度开根号这里是18开根号=4.24,即4块
        //为了让数据均匀，将21,18合并到第一块中
        int[] Arr={ 27,22,30,40,36,//分块条件要求，块与块之间不能有交集
                    13,19,16,20,
                    7,10,
                    43,50,48};

        Block b1=new Block(22,40,0,4);
        Block b2=new Block(13,20,5,8);
        Block b3=new Block(7,10,9,10);
        Block b4=new Block(43,50,11,13);

        //定义一个数组用来管理四个块的对象（索引表）
        Block[] blockArr={b1,b2,b3,b4};

        //定义要查找的元素
        int num=100;

        //调用方法传递索引表，数组，要查找的元素
        int index= getIndex(blockArr,Arr,num);
        int result=getIndex(blockArr,Arr,num);
        System.out.println(result);
    }

    private static int getIndex(Block[] blockArr, int[] Arr, int num) {//定义方法获得查找数在数组中的索引

        //1、获取要查找的元素所在的块号
        int blockIndex=findIndexBlock(blockArr,num);

        //2、如findIndex返回值为-1则代表不存在
        if(blockIndex==-1){
            return -1;
        }

        //3、获取这一个块的开始索引和结束索引
        int StartIndex=blockArr[blockIndex].getStartIndex();
        int EndIndex=blockArr[blockIndex].getEndIndex();

        for (int i = StartIndex; i <= EndIndex; i++) {
            if(num==Arr[i]){//原数组中已经被切好块了，所以可以直接在原数组中从获取的开始索引到结束索引之间查找
                return i;
            }
        }
        return -1;
    }

    //定义一个方法，用来确定number在哪一个块中
    public static int findIndexBlock(Block[] blockArr,int num){//定义方法确定所要查找的数所在的块号

        for (int i = 0; i < blockArr.length; i++) {
            if(num>=blockArr[i].getMin() && num<=blockArr[i].getMax()){//数小于块中的最大值，并且大于块中的最大值则代表在这一个块中
                return i;//返回块号
            }
        }
        return -1;//没找到对应的块
    }
}

class Block{//定义块类
    private int min;//新增min属性
    private int max;//每块的最大值
    private int startIndex;//块的开始索引
    private int endIndex;//块的结束索引

    public Block() {
    }
    public Block(int min,int max, int startIndex, int endIndex) {
        this.min=min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    /**
     * 获取
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}