package by.itacademy.task1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Patient[] myPatient = new Patient[5];
        for(int myCounter = 0; myCounter < myPatient.length; myCounter++)
        {
            Patient tempPatient = new Patient();
            Main.enterAll(tempPatient);
            myPatient[myCounter] = tempPatient;
        }
        Main.searchByName(myPatient);
        Main.searchByAge(myPatient);
    }

    public static void enterAll(Patient enterPatient)
    {
        System.out.println("Creating a new patient:");
        Main.enterName(enterPatient);
        Main.enterAge(enterPatient);
        Main.enterInsurance(enterPatient);
        System.out.println("Pacient " + enterPatient.name + " - Age = " + enterPatient.age + "\n");
    }

    public static void enterInsurance(Patient enterPatient)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Does this patient have an insurance? (true/false)");
        enterPatient.insurance = myScanner.hasNextBoolean();
    }

    public static void enterAge(Patient enterPatient)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How old is this patient?");
        enterPatient.age = myScanner.nextInt();
    }

    public static void enterName(Patient enterPatient)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is the name of this patient?");
        enterPatient.name =  myScanner.nextLine();
    }

    public static void searchByName(Patient[] searchPatientArray)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Searching by name. Enter name.");
        String searchName = myScanner.nextLine();
        for(int myCounter = 0; myCounter < searchPatientArray.length; myCounter++)
        {
            if(searchName.equals(searchPatientArray[myCounter].name))
            {
                System.out.println("Pacient " + searchPatientArray[myCounter].name + " - Age = " + searchPatientArray[myCounter].age + "\n");
            }
        }
    }

    public static void searchByAge(Patient[] searchPatientArray)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Searching by age. Enter age.");
        int searchAge = myScanner.nextInt();
        for(int myCounter = 0; myCounter < searchPatientArray.length; myCounter++)
        {
            if(searchAge == searchPatientArray[myCounter].age)
            {
                System.out.println("Pacient " + searchPatientArray[myCounter].name + " - Age = " + searchPatientArray[myCounter].age + "\n");
            }
        }
    }


}
