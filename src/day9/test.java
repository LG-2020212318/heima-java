package day9;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Phone> list=new ArrayList<>();
        Phone phone1=new Phone("华为",4999);
        Phone phone2=new Phone("小米",2999);
        Phone phone3=new Phone("锤子",1999);

        list.add(phone1);
        list.add(phone2);
        list.add(phone3);

        ArrayList<Phone> Phoneaccept=compare(list);

        for (int i = 0; i < Phoneaccept.size(); i++) {
            Phone phoneout=Phoneaccept.get(i);
            System.out.println(phoneout.getName()+","+phoneout.getPrice());
        }
    }

    public static ArrayList<Phone> compare(ArrayList<Phone> list){
        ArrayList<Phone> list2=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone ph=list.get(i);
            int money=ph.getPrice();
            if(money<3000){
                list2.add(ph);
            }
        }
        return list2;
    }
}
