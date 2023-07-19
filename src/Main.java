import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int []a={8, 4, 7, 1};
        System.out.println(isGuthrieSequence(a));
    }
    static int isGuthrieSequence(int[] a){
   int current,perv=a[0],i;
   if (a.length<2||a[a.length-1]!=1)return 0;
       for (i=1;i<a.length;i++){
           if(perv%2==0) current=perv/2;
           else current=(perv*3)+1;
          if (current!=a[i])return 0;
          else perv=a[i];
       }
return 1;
    }
}




