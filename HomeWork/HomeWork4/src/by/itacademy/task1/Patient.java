package by.itacademy.task1;

public class Patient
{
    int age;
    String name;
    boolean insurance;

    void setAge(int thisAge)
    {
        age = thisAge;
    }

    void setName(String thisName)
    {
        name = thisName;
    }

    void setInsurance(boolean thisInsurance)
    {
        insurance = thisInsurance;
    }

    void printInfo()
    {
        System.out.print("Name: " + name + "\nAge: " + age);
        if(insurance)
        {
            System.out.print("\nHas insurance");
        }
        else
        {
            System.out.print("\nHas no insurance");
        }
    }

}
