package ExcetionHandling;

public class exceptions {
/*in case we want to throw the exception this is what has to be done*/


   // public static void main(String args[]) throws DivideByZeroException{
    //  divide(10,0);
  //  }

    public static int divide(int a,int b) throws DivideByZeroException{
        if(b==0){
            throw new DivideByZeroException();//this has to be thrown somewhere maily from where it is called or needed to be caught
        }
        return a/b;
    }

    /*In case we want to catch the exception*/

    public static void main(String[] args) {
        try{
            divide(10,0);
      //      System.out.println("Within Try");//for b not equal to zero this will be executed
        }
        catch(DivideByZeroException e){
            System.out.println("Divide by zero exception raised");
        }
        //this statement gets executed only when the ecxception is caught
        System.out.print("Main");
    }
}
//if we want to pass it throws is the keyword otherwise try catch is used to deal with it