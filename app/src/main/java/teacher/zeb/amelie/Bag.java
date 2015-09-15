package teacher.zeb.amelie;

/**
 * Created by amelie on 15-09-09.
 */
public class Bag extends Clothes implements ClothingAttribute{

    private String size;
    private int price;
    private String color;
    private String material;
    private boolean gender;


    public Bag (String size, int price, String color,
                String material, boolean gender){

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

}
