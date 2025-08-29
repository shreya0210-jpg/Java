public class Casting {
     public static void main(String[] args){
          //implicit casting
          double price=70.0F;
          double ruppee=80.0F;
          System.out.println(price+ruppee);

         int a=6;
         int b=7;
         float c=a+b;
         System.out.println(c);

          // explicit casting
          float s= 34 +(int)98.8F;
         System.out.println(s);

         //Constants (final keyword)
          final float PI=3.14F;
          //float PI=98.6F; // gives error
          System.out.println(PI);


          //Operators

          //arithmetic
          int d=5;
          int e=7;
          int f=d%e;
          System.out.println(f);

          //assignment
          int g=7;
          g++;
          System.out.println(g); //8
          System.out.println(g++); //8 value get 9 after printing 8
          System.out.println(++g); //10 pre increment 9 get increment

          //maths
          System.out.println(Math.max(9,8)); //max
          System.out.println(Math.min(5,6)); //min
          System.out.println((int)Math.random());  //random
          System.out.println((int)(Math.random()*100)); // random values between 0 to 100

          //casting,operators,constants(final),maths.

        
     }
     
}
