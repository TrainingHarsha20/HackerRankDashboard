public class rotateWhileLoop {
    public static void main(String[] args) {
      int[] a = {1,2,3,4,5};
      int d = 4;

      int size = a.length;
      int i =0, rotate_index=d;

      int[] b= new int[size];

      while(rotate_index<size){
          b[i]= a[rotate_index];
          i++;
          rotate_index++;
      }

      rotate_index = 0;

      while(rotate_index<d){
         b[i]= a[rotate_index];
         i++;
         rotate_index++;
      }

//      //output
      for(int i1: b){
          System.out.println(i1);
      }
    }

    static void rotateUsingWhile(int rotate_index, int len,int[] b, int i, int[] a){
        while(rotate_index<len){
            b[i]= a[rotate_index];
            i++;
            rotate_index++;
        }
    }
}
