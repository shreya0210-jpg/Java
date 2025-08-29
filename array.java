import java.util.Arrays;
public class array {
     public static void main(String[] args){
          
          int[] marks=new int[3];
          marks[0]=97;  //if we don't initialise values by default it take 0
          marks[1]=88;
          marks[2]=99;
          System.out.println(marks[0]);
          System.out.println(marks.length); //length is property here not function.
          Arrays.sort(marks);  //sorting 
          System.out.println(marks[0]);

          int[] mark={97,87,88}; // without using new keyword
          int[][] miss={{ 77,65,78 }, {87,98,67} }; //2D array
          System.out.println(miss[0][0]);
     }
     
}
