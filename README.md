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
                 int i = 0, j = 0;
                 while (i < aChars.length) {
                     if (aChars[i] == bChars[j]) {
                        j++;
                      } else {
                        j=0;
                      }
                     if(j == bChars.length) {
                       break;
                     }
                     i++;
                 }
                 return bChars.length == j;
              }
             return false;
        }

###### 3. Given sorted array in such a way that all 1's place in begning and 0's placed in the last. Find 1's count in O(longn) complexity.
       input: int[] a= {1,1,1,0,0,0,0};
       public int findZeroCount(int[] a, int i, int n){

                   int pivot = (i+n)/2;
                   System.out.println("pivot  = "+pivot+", index i,j= "+i+","+n);
                   if(a[pivot] == 1 && a[pivot+1]==0){
                       return pivot+1;
                   }else if(a[pivot] == 1 && a[pivot+1]==1){
                        return findZeroCount(a, pivot+1, n);
                   }else{
                       return findZeroCount(a, i, pivot);
                   }
         }

###### 4. Given sorted array in such a way that all 1's place in begning and 0's placed in the last. Find 0's count in O(longn) complexity.
         input: int[] a= {1,1,1,0,0,0,0};
         public int findZeroCount(int[] a, int i, int n){

                     int pivot = (i+n)/2;
                     System.out.println("pivot  = "+pivot+", index i,j= "+i+","+n);
                     if(a[pivot] == 1 && a[pivot+1]==0){
                         return a.length-(pivot+1);
                     }else if(a[pivot] == 1 && a[pivot+1]==1){
                          return findZeroCount(a, pivot+1, n);
                     }else{
                         return findZeroCount(a, i, pivot);
                     }
           }


###### 5. Given dynamic price trends of stock market find when to buy and sell for maximum profit. example input[10,20,55,30, 60,100,70,50,150,200,170]. output is: {0,2}, {3,5}, {7,9}

         public void maxProfitStockMoarket(int[] a){
                 int buyAt = 0, sellAt = 0;
                 boolean toBuy = false, toSell = false;
                 for(int i=1; i<a.length; i++){
                     if(a[i] < a[buyAt]){
                         buyAt = i;
                         sellAt = i;
                         continue;
                     }else{
                         toBuy = true;
                     }

                     if(a[i] > a[sellAt]){
                         sellAt = i;
                     }else{
                         toSell = true;
                     }

                     if(toBuy && toSell){
                         System.out.println("BuyAt: "+buyAt+" sellAt: "+sellAt);
                         sellAt++;
                         buyAt = sellAt;
                         toBuy = false;
                         toSell = false;
                     }
                 }
             }
