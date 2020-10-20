import java.util.Scanner;

public class Car {

    private String password;
    private int intPassword;
    private boolean airOn = false;
    private boolean buttonPressed = false;
    private boolean belte = false;
    private String beltepass;
    private int LightsOn;
    public String currentlight;


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


}
