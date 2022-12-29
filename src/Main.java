public class Main {
    public static void main(String[] args) {
        calcX(1);
        calcY(1);
    }

    private static void calcX(int inData){
        int num, i;
        num =  inData;
        System.out.println(num);
        for(i = 1 ; i <= 3 ; i++){
            num = num + 2 * i;
            System.out.println(num);
        }
    }

    private static void calcY(int inData){
        int num, i;
        num =  inData;
        System.out.println(num);
        for(i = 2 ; i <= 6 ; i = i + 2){
            num = num + 2 * i;
            System.out.println(num);
        }
    }
}