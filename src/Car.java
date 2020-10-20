import java.util.Scanner;

enum GearStatus {
    GearOne,
    GearTwo,
    GearThree,
    GearFour,
    GearFive,
    GearSix
};

enum Lights {
    TopLeftLight,
    TopRightLight,
    BotLeftLight,
    BotRightLight
}
enum WeatherStatus {
    Off,
    Slow,
    Fast
}
public class Car {

    private String password;
    private int intPassword;
    private boolean airOn = false;
    private boolean buttonPressed = false;
    private boolean belte = false;
    private String beltepass;
    private int LightsOn;
    public String currentlight;
    private String stoptires;
    public String currentgear;
    public String washerStatus;


    public int degrees = 20;
    public boolean engineOn = false;
    //Scanner input = new Scanner(System.in);
    //int keyStop = input.nextInt();

    public Car() {
        this.password = "password1234";
        this.engineOn = false;
        this.intPassword = 1234;
        this.airOn = false;
        this.buttonPressed = false;
        this.belte = false;
        this.beltepass = "Belton";
        this.LightsOn = 0;
        this.currentlight = null;
        this.stoptires = "Stop!";
        this.currentgear = null;
        this.washerStatus = null;
    }

    public void turnEngineOn(CarKey key) {
        if (key.password.equals(password)) {
            System.out.println("Bilen er tændt");
            this.engineOn = true;

        } else {
            System.out.println("Bilen er ikke tændt");
        }
    }

    public void turnEngineOff(int keyStop) {
        if (keyStop == intPassword) {
            System.out.println("Bilen er slukket");
        } else {
            System.out.println("Bilen er ikke slukket, forkert password");
        }
        if (keyStop != intPassword) {
        }
    }

    public void turnAirConOn() {
        if (this.engineOn = true) {
            buttonPressed = true;
            this.airOn = true;
        }
    }

    public void turnAirConOff() {
        if (this.engineOn = false) {
            this.airOn = false;
        }
    }

    public void setDegrees(int newDegree) {
        degrees = newDegree;

    }

    public void belteOn(String belteon) {
        if (belteon.equals(beltepass)) {
            System.out.println("Your seatbelt is on!");
        } else {
            System.out.println("Your belt is not on");
        }
    }

    public void backlightsAndFrontLightsOn() {
        if (this.engineOn = true) {
            this.LightsOn = 4;
            System.out.println("All lights are operating and the lights active are now: " + this.LightsOn);
        }
    }

    public void backlightsAndFrontLightsOff() {
        if (this.engineOn) {
            this.LightsOn = 0;
        }
        System.out.println("The lights are now not operating and are now: " + this.LightsOn);
    }

    public void BlinkingLights(int lights) {

        switch (lights) {
            case 1:
                currentlight = "Top left light";
                break;
            case 2:
                currentlight = "Top right light";
                break;
            case 3:
                currentlight = "Bottom left light";
                break;
            case 4:
                currentlight = "Bottom right light";
                break;
        }
    }

    public void breaktires(String tires) {
        if (!this.engineOn) {
            if (tires.equals(this.stoptires)) {
                System.out.println("Breaking the tires, commence impact");
            }
        }
    }

    public void changeGear(int Gear) {
        switch (Gear) {
            case 1:
                currentgear = "Gear 1";
                break;
            case 2:
                currentgear = "Gear 2";
                break;
            case 3:
                currentgear = "Gear 3";
                break;
            case 4:
                currentgear = "Gear 4";
                break;
            case 5:
                currentgear = "Gear 5";
                break;
            case 6:
                currentgear = "Gear 6";
                break;

        }
    }

    public void windowWasher(int washer) {
        switch (washer) {
            case 1:
                washerStatus = "Off";
                break;
            case 2:
                washerStatus = "On: SLOW";
                break;
            case 3:
                washerStatus = "On: FAST";
                break;
        }

    }
    public void enumWindowWasher() {
        WeatherStatus status = WeatherStatus.Fast;
        switch (status) {
            case Off:
                washerStatus = "Off";
                break;
            case Slow:
                washerStatus = "On: SLOW";
                break;
            case Fast:
                washerStatus = "On: FAST";
                break;
        }
        System.out.println(washerStatus);
    }
    public void enumchangeGear() {
        GearStatus status = GearStatus.GearFour;
        switch (status) {
            case GearOne:
                currentgear = "Gear 1";
                break;
            case GearTwo:
                currentgear = "Gear 2";
                break;
            case GearThree:
                currentgear = "Gear 3";
                break;
            case GearFour:
                currentgear = "Gear 4";
                break;
            case GearFive:
                currentgear = "Gear 5";
                break;
            case GearSix:
                currentgear = "Gear 6";
                break;
        }
        System.out.println(currentgear);
    }
    public void enumBlinkingLights() {
        Lights enumlights = Lights.BotLeftLight;

        switch (enumlights) {
            case TopLeftLight:
                currentlight = "Top left light";
                break;
            case TopRightLight:
                currentlight = "Top right light";
                break;
            case BotLeftLight:
                currentlight = "Bottom left light";
                break;
            case BotRightLight:
                currentlight = "Bottom right light";
                break;
        }
        System.out.println(currentlight);
    }
}

