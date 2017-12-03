package by.itacademy.task1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Patient[] myPatient = new Patient[3];
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
        System.out.print("\nCreating a new patient:\n");
        Main.enterName(enterPatient);
        Main.enterAge(enterPatient);
        Main.enterInsurance(enterPatient);
        enterPatient.printInfo();
    }

    public static void enterInsurance(Patient enterPatient)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Does this patient have an insurance? (true/false)");
        enterPatient.insurance = myScanner.nextBoolean();
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
        System.out.print("\n");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Searching by name. Enter name.");
        String searchName = myScanner.nextLine();
        for(int myCounter = 0; myCounter < searchPatientArray.length; myCounter++)
        {
            if(searchName.equals(searchPatientArray[myCounter].name))
            {
                searchPatientArray[myCounter].printInfo();
            }
        }
    }

    public static void searchByAge(Patient[] searchPatientArray)
    {
        System.out.print("\n");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Searching by age. Enter age.");
        int searchAge = myScanner.nextInt();
        for(int myCounter = 0; myCounter < searchPatientArray.length; myCounter++)
        {
            if(searchAge == searchPatientArray[myCounter].age)
            {
                searchPatientArray[myCounter].printInfo();
            }
        }
    }


}
