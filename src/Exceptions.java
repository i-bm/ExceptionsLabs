public class Exceptions {

    static void arrayBoundException(){
        // create array of 5 size
        int[] a = new int[] { 1, 2, 3, 4, 5 };
    try{
        // execute for loop
        for (int i = 0; i < 6; i++) {

            // print the value of array
            System.out.println(a[i]);
        }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.err.println("Array length has been exceeded.");
        }

    }

    public static void illegalTypeCast() {
        try {
            Object obj = 100;
            System.out.println((String) obj);

        } catch (ClassCastException ex) {
            System.err.println("Illegal exception.");
        }
    }

    public static void nullPointer(){
        try {
            String str = null;
            System.out.println((str.equals("Isaac") ? "Yes" : "No"));
        }catch(NullPointerException ex){
            System.err.println("Null Pointer Exception Detected.");
        }
    }

    public static void integerDividedByZero(){
        try {
            int a = 3, b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e){
            System.err.println("Arithmetic Exception Detected.");
        }
    }
    public static void main(String args[]){

//             arrayBoundException();
//            illegalTypeCast();
//             nullPointer();
        integerDividedByZero();
    }

}
