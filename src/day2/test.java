package day2;

public class test {
    public static void main(String[] args) {
        GirlFriend[] arr=new GirlFriend[4];
        GirlFriend g1=new GirlFriend("小芳",29,'女',"唱歌");
        GirlFriend g2=new GirlFriend("小菜",26,'女',"hipop");
        GirlFriend g3=new GirlFriend("圆圆",18,'女',"跳舞");
        GirlFriend g4=new GirlFriend("方方",23,'女',"踢足球");

        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;
        arr[3]=g4;

        int sum=0;
        int average=0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i].getAge();
        }
        average=sum/arr.length;
        System.out.println("女朋友的平均年龄是"+average);
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getAge()<average){
                arr[i].showInfo();
                count++;
            }
        }
        System.out.println("比平均年龄小的共有"+count+"个");
    }

}
