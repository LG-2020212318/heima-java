package A01_SearchDemo1;

import java.util.ArrayList;
//test

public class BasicSearchDemo {
    public static void main(String[] args) {
        int[] Arr={131,127,147,81,103,23,7,79,81};

        ArrayList<Integer> list1=BasicSearch(81,Arr);
        for (int i = 0; i < list1.size(); i++) {
            Integer index=list1.get(i);
            System.out.println(index);
        }
    }

    public static ArrayList<Integer> BasicSearch(int i, int[] arr){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i1 = 0; i1 < arr.length; i1++) {
            if(i==arr[i1]){
                list.add(i1);
            }
        }
        return list;
    }
}
