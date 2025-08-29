public class hello {
     public static void main(String[] args){

          //premitive datatype
        char letter='a';
        byte b=12;
        float c=3.2f;
        int r=123456789;
        long s=14556778L;

        //non premitive datatype
        String name="shreya";
        String n=new String("Priya");
        //string is immutable in java


        //length function
        System.out.println(n.length());
        //concatenation
        System.out.println(name+" and " +n);
        //charAt
        System.out.println(n.charAt(0));
        //replace (do not change in original string ,create new changed string )
        String z=n.replace("iy","m");
        System.out.println(z);
        //substring (include beginindex but exclude endindex given in parameter)
        System.out.println(n.substring(0,3));

     }
     
}
