package ex_11_oct_encapsulation;

public class IciciBank {

    private String name;
    private int bal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal,boolean Isadmin)
    {
        if(Isadmin)
        {
            System.out.println("allowed ");
        }
        else

            System.out.println("not allowed");

        this.bal = bal;
    }

    public IciciBank(String name, int bal) {
        this.name = name;
        this.bal = bal;
    }
}
