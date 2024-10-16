package Access_modifiers.police;

import javax.crypto.spec.PSource;

public class cop {

    private int gun;
    private String idcard;

    public cop(int gun) {
        this.gun = gun;
    }


    protected void Shoot()
    {
        System.out.println("yes u can");
    }
}
