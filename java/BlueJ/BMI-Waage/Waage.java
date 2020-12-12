// import static java.lang.System.out;
// Menschen wiegen, messen & BMI errechnen
public class Waage {

    // Gewicht einer Person
    private double mass;

    // Höhe einer Person
    private double height;

    // BMI der Person
    private double bmi;

    // Geschlecht der Person
    public char gender;



    // Constructor sets height and mass == 0
    public Waage() {
      mass = 0;
      height = 0;
    }

    /**
    * Masse in Kilogramm,
    * Höhe in Metern,
    * Geschlecht entweder 'm' oder 'f'
    */
    public Waage(double pMass, double pHeight, char pGender) {
      mass = pMass;
      height = pHeight;
      gender = pGender;
    }




    // Methods to make System.out.printn() easier

    public void printString(String printStringText) {
      System.out.println(printStringText);
    }

    public void printInt(int printIntNumber) {
      System.out.println(printIntNumber);
    }

    public void printChar(char printCharLetter) {
      System.out.println(printCharLetter);
    }

    public void printFl(float printFloatNumber) {
      System.out.println(printFloatNumber);
    }

    public void printVar(float printVarVar) {
      System.out.println(printVarVar);
    }



    // Get mass of Person
    public double getMass() {
      return mass;
    }

    // Get height of Person
    public double getHeight() {
      return height;
    }

    // Get gender of Person
    public char getGender() {
      return gender;
    }


    // Set mass of Person
    public void setMass(double newMass) {
      mass = newMass;
    }

    // Set height of Person
    public void setHeight(double newHeight) {
      height = newHeight;
    }

    // Set gender of Person
    public void setGender(char newGender) {
      gender = newGender;
    }



    // Displays all variables
    public void detailAusgabe() {
      printString("##################");
      System.out.println("Mass: " + mass);
      System.out.println("Height: " + height);
      calculateBMI();
      printString("##################");
    }



    // Calculate BMI
    public void calculateBMI() {

      if (height == 0) {
        printString("Berechnung unmoeglich: \"height\" = 0");
      } else {

        double tmpHeight = height * height;
        bmi = mass / tmpHeight;
        System.out.println("BMI: " + bmi);

        if (gender == 'm') {

          if (bmi > 0 &&  bmi < 20) {
            printString("Du bist untergewichtig.");
          } else if (bmi >= 20 && bmi <= 25) {
            printString("Du bist normalgewichtig.");
          } else {
            printString("Du bist uebergewichtig.");
          }

        } else if (gender == 'f') {

          if (bmi > 0 && bmi < 19) {
            printString("Du bist untergewichtig.");
          } else if (bmi >= 19 && bmi <= 24) {
            printString("Du bist normalgewichtig.");
          } else {
            printString("Du bist uebergewichtig.");
          }

        }
      }
    }
}
