package java19.session5.pack2;

import java19.session5.pack1.Human;

public class HomoSapien extends Human {
    public String getName(){
        return this.name;
    }

    public String getHairColor(){
       // return this.hairColor; //Gọi chỗ này lỗi vì hairColor là default
        return null;
    }
}
