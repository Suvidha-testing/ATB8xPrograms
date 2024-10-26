package Arrays;

import java.util.Arrays;

public class lab1 {

    public static void main(String[] args) {


        //method 1 for declaring array
        int[] marks={30,20,45,70};

        /*
        System.out.println(marks.length);
        System.out.println(marks[1]);
        System.out.println(marks[3]);
        System.out.println(marks[2]);

        //method 2 for declaring array

        int[] marks1=new int[5];

         */
        Arrays.sort(marks);



        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);


        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }



        //binary search

        int s=Arrays.binarySearch(marks,30);
        System.out.println(s);








    }


}
