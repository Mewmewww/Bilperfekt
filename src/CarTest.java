import java.util.Scanner;

public class CarTest {

    public static void main(String[] args) {
        testSuite();
    }

    private static void testSuite() {
        System.out.println("Testen kører");
        System.out.println("Bilernes temperatur er sat til 20 grader");
        System.out.print("Test 1 (bilen skal være tændt): ");
        testStartCarWithCorrectKey();
        System.out.print("Test 2 (bilen skal ikke være tændt): ");
        testStartCarWithWrongKey();
        System.out.println("Test 3 (bilen skal ikke være tændt): Bilen skal slukkes");
        testStopCarWithCorrectInput();
        System.out.println("Test 4 - temperaturen skal sættes til en vilkårlig værdi");
        testSetDegrees();
        System.out.println("Test 5: Bilens aircondition skal tændes");
        testAirConOn();
        System.out.println("Test 6: Bilens aircondition skal slukkes");
        testAirConOff();
        System.out.println("Test 7: Bilisten har sin belte på");
        belteTest();
        System.out.println("Test 8: Blinking a light");
        lightsTest();

    }

    private static void testStartCarWithCorrectKey() {
        Car denizCar = new Car();
        CarKey key = new CarKey("password1234");
        denizCar.turnEngineOn(key);
        denizCar.backlightsAndFrontLightsOn();

    }
    private static void testStartCarWithWrongKey() {
        Car denizCar = new Car();
        CarKey key = new CarKey("hest");
        denizCar.turnEngineOn(key);
        denizCar.backlightsAndFrontLightsOff();

    }
    public static void testStopCarWithCorrectInput() {

        System.out.println("Indtast en variable");
        Car denizCar = new Car();
        Scanner input = new Scanner(System.in);
        int keyFromUser = input.nextInt();
        denizCar.turnEngineOff(keyFromUser);
        denizCar.backlightsAndFrontLightsOff();
    }
    public static void testSetDegrees() {
        System.out.println("Indtast en variable");
        Car denizCar = new Car();
        Scanner input = new Scanner(System.in);
        int wantedDegrees = input.nextInt();
        denizCar.setDegrees(wantedDegrees);
        System.out.println("The temperature of the car is now: " + wantedDegrees + " degrees");
    }
    public static void testAirConOn() {
        Car denizCar = new Car();
        System.out.println("Bilens aircon er tændt");
        denizCar.turnAirConOn();
    }
    public static void testAirConOff() {
        Car denizCar = new Car();
        System.out.println("Bilens aircon er slukket");
        denizCar.turnAirConOff();
        // Der skulle egentligt bruges 4 fuckingm etoder, men det er ikke spændende. yderligere kunne vi bruge scanner
        // for at få personen til selv at slukke den via en kommando, men det har vi gjort før.
    }
    public static void belteTest() {
        System.out.println("Indtast kodeordet for at kunne tage dit belte på"); // Belton
        Car denizCar = new Car();
        Scanner input = new Scanner(System.in);
        String belteon = input.next();
        denizCar.belteOn(belteon);
    }
    public static void lightsTest() {
        Car denizCar = new Car();
        Scanner input = new Scanner(System.in);

        int lights = input.nextInt();
        denizCar.BlinkingLights(lights);
        System.out.println("Blinking: " + denizCar.currentlight);
    }



}
