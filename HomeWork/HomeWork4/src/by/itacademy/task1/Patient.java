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
        System.out.print("Pacient " + name + " - Age = " + age + ", ");
        if(insurance)
        {
            System.out.print("has insurance\n");
        }
        else
        {
            System.out.print("has no insurance\n");
        }
    }

}
