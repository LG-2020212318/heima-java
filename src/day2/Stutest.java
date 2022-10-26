package day2;

import java.util.Scanner;

public class Stutest {
    public static void main(String[] args) {
        Student[] arr=new Student[3];
        Student stu1=new Student("张三",202316,18);
        Student stu2=new Student("李四",202317,19);
        Student stu3=new Student("王五",202318,20);


        //将对象添加到数组当中
        arr[0]=stu1;
        arr[1]=stu2;
        arr[2]=stu3;

        //要添加的对象
        Student stu4=new Student("赵六",202319,35);

        //添加一个学生对象
        //数组已满,需要创建新的数组，将老数组的元素添加到新数组中，数组长度为老数组+1
        //添加的时候要判断学号的唯一性
        Student[] arr2=new Student[arr.length+1];
        if(!Repeat(arr,stu4)){
            if(getCount(arr)<arr.length){//数组中元素个数小于数组长度说明还有空位置
                arr[getCount(arr)]=stu4;
                Check(arr);
            }else{
                arr2=newArr(arr,stu4);
                Check(arr2);
            }
        }
        else{
            System.out.println("Id重复，请修改id后重新添加");
        }
        //通过id删除学生信息
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("请输入你想要学生年龄+1的ID");
        int num=sc.nextInt();
        if(index(num,arr2)>0){
            arr2[index(num,arr2)].setAge(arr2[index(num,arr2)].getAge()+1);
        }
        else{
            System.out.println("没有找到");
        }
        Check(arr2);

    }


    //定义方法：按照指定id返回其数组下标
    public static int index(int idnum,Student[] Arr){
        for (int i = 0; i < Arr.length; i++) {
            if(Arr[i].getId()==idnum){
                return i;
            }
        }
        return -1;

    }



    //要判断遍历老数组还是新数组,代码会重复，所以定义一个方法遍历所有学生信息
    public static void Check(Student[] Arr){
        for (int i = 0; i < Arr.length; i++) {
            if(Arr[i]!=null){//不为空才打印
                System.out.println(Arr[i].getName()+","+Arr[i].getId()+","+Arr[i].getAge());
            }
        }
    }


    //定义方法：创建新的数组，并将老数组中的元素加到新数组中
    public static Student[] newArr(Student[] Arr,Student Stu4){
        Student[] Arr2=new Student[Arr.length+1];
        for (int i = 0; i < Arr.length; i++) {//将老数组的元素添加到新数组中
            Arr2[i]=Arr[i];
        }
        Arr2[Arr.length]=Stu4;
        return Arr2;
    }


    //定义方法获得数组中元素的个数
    public static int getCount(Student[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                count++;
            }
        }
        return count;
    }
    //判断加的元素id是否重复
    public static Boolean Repeat(Student[] arr,Student Stu4){
        for (int i = 0; i < arr.length; i++) {//判断id是否重复，不重复则添加
            if(arr[i]!=null) {//此处要加非空判断
                if (arr[i].getId() == Stu4.getId()) {
                    return true;
                }
            }
        }
        return false;
    }
}
