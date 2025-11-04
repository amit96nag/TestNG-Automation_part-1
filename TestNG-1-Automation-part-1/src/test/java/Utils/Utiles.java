package Utils;

public class Utiles {
    public  static int generateRandomNumber(int min, int max){
        double randomNumber=Math.random()*(max-min)+min; // ei khan a random number niche ar seta amra data bananor jonno use kortace
        return (int)randomNumber;
    }

    public static void main(String[] args) {
        int id=generateRandomNumber(1000,9999);
        System.out.println(id);
    }
}
