package ArrayClass;
// import java.util.Scanner;



class Var{
    int min;
    int max;
}


public class minMax {
    

    static Var maxmin(int[]arr){
        Var MinMax=new Var();

        int len =arr.length;
        if (len==1){
            MinMax.min=arr[0];
            MinMax.max=arr[0];
            return MinMax;   
        }
       

        if (arr[0]>arr[1]) {
            MinMax.max=arr[0];
            MinMax.min=arr[1];
        }else{
            MinMax.max=arr[1];
            MinMax.min=arr[0];
        }


        
        for(int i=2; i<len; i++){
            if (MinMax.min>arr[i]) {
                MinMax.min=arr[i];   
            }
            if(MinMax.max<arr[i]){
                MinMax.max=arr[i];
            }

        }
        return MinMax;
    }

   
    public static void main(String[] args) {
         // Scanner sc=new Scanner(System.in);
        int[]arr={3,5};
        
       Var pr=maxmin(arr);
       System.out.printf("Maximum Number in Array %d", pr.max);
       System.out.printf("Minimum Number in Array %d", pr.min);
    
    }



    
}