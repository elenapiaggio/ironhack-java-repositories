package Assesment_4;

public class Main {

  public static void main(String[] args) {

    int[] firstInput = {4, 1, 3, 2, 5};
    int[] secondInput = {4, 1, 3, 2, 5};
    int[] thirdInput = {4, 1, 3, 2, 5};

    int[] result = balancer(firstInput, 52);

    for (int i= 0; i < result.length; i++){
      System.out.print(result[i] + " ");
    }
  }

 public static int[] balancer(int[] numList, int sum){
   int totalSumArray = 0;
   int smallest = numList[0];
   int index = 0;

   while(totalSumArray < sum){
     totalSumArray = 0;
     smallest = numList[0];

     for (int i = 0; i < numList.length; i++){

       totalSumArray+= numList[i];
       numList[i]++;

       if(numList[i] < smallest){
         smallest = numList[i];
         index = i;
       }

     }

     System.out.println("El menor es: => " + smallest);

     System.out.println("la suma es más baja, hay que balancear");
     numList[index]++;
   }

    return numList;
 }


}
