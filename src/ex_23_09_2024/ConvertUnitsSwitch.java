package ex_23_09_2024;

public class ConvertUnitsSwitch {

    public static void main(String[] args) {

        double km=134.8;
        double mile;
        double fahrenheit;
        double celsius=100.9;
        int user_choice=2;
        switch(user_choice)
        {

            case 1:
                mile=km*0.6214;
                System.out.println(km +" converted in miles is "+ mile);
                break;
            case 2:
                fahrenheit=(celsius)*9/5+32;
                System.out.println(celsius +" celsius converted to fahrenheit value is " +fahrenheit +"f");
                break;
            default:
                System.out.println("invalid input value");
                break;
        }

    }
}
