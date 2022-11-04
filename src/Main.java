import java.util.Random;

public class Main {
    public static void main(String[] args) {
        checkAgeAndTemperature(genereteRandomAge(),20);
        checkAgeAndTemperature(genereteRandomAge(),30);
        checkAgeAndTemperature(genereteRandomAge(),50);
        checkAgeAndTemperature(genereteRandomAge(),80);
        checkAgeAndTemperature(genereteRandomAge(),20);

    }

    public static void
    checkAgeAndTemperature(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            ;
            System.out.println("Можно идти гулять");
        } else if (age > 20 && temperature >= 0 && temperature <= 28) {
            System.out.println("Можно идти гулять");
        } else if (age > 45 && temperature >= -10 && temperature <= 25){
            System.out.println("Можно идти гулять");
        }else
            System.out.println("Остовайтесь дома");
    }
    public static int genereteRandomAge(){
        Random random = new Random();
       return random.nextInt(55);
    }
}