public class Calculator {
    int cube(int a){
        return a*a*a;
    }

    /**
     * calculates power of a number
     * @param number
     * @param power
     * @return a^b
     */
    int pow(int number, int power){
        int res=1;
        for(int i=0;i<power;i++){
            res=res*number;

        }
        return res;
    }
    int areaofSquare(int a){
        return pow(a,2);
    }
    int volumeofCube(int a){
        return areaofSquare(a)*a;
    }
    Integer evenorodd(int number){
        if(number%2==0)
            return 1;
        else
            return 0;

    }
    int countDigits(int n){
        if(n%10==n){
            System.out.println("Called " + n);
            return 1;
        }

        return 1+countDigits(n/10);
    }

}