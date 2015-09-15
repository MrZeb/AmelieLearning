package teacher.zeb.amelie.model;

import teacher.zeb.amelie.Color;

/**
 * Created by sebastianfurle on 9/4/15.
 */
public abstract class Clothes
{
    // TODO: Lägg till 10 olika klädestyper (varje klädesplagg ska vara en class som extendar Clothes)

    protected Color color;
    String gender;
    int price;
    String material;
    protected Size size;

    public Clothes(){}

    public Clothes (Size size, int price, Color color,
                String material, String gender){

        this.size = size;
        this.price = price;
        this.color = color;
        this.material = material;
        this.gender = gender;

    }

    public void setSize(){


    }

    public void setPrice(){}

    public void setColor(){}

    public void setMaterial(){}

    public void setGender(){


    }




    // TODO: Lägg till fler attribut för kläder. Vad är gemensamt för alla kläder? Storlek? Kön? Pris?




}
