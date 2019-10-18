# DS
 
 
 ###### 1. Find pair of sum in given Sorted array
     input: int[] array = {1,2,3,4,5,6,7}; findPairOf(array, 6);
    private static void findPairOf(int[] array, int x){
          int i=0;
          int j=array.length-1;
           while(i<j){
               if(array[i]+array[j]>x){
                   j--;
               }else if(array[i]+array[j]<x){
                   i++;
               }else{
                   System.out.println("pair{"+array[i]+","+array[j]+"}");
                   i++; j--;
               }
           }
      }
   
###### 2. Find substring in given string without using library method
    intput: String(a): asdcdeef, SubString(b) : sdc 
    private boolean isSubString(String a, String b){
            if(a!= null&& !a.isEmpty() && b!= null && !b.isEmpty() && b.length()<a.length()) {
                char[] aChars = a.toCharArray();
                char[] bChars = b.toCharArray();
                int i = 0, j = 0, count = 0;
                while (i < aChars.length) {
                    if (aChars[i] == bChars[j]) {
                        i++;
                        j++;
                        count++;
                    } else {
                        i++;
                        count = 0;
                    }
                }
                return count == j;
            }
            return false;
        }
