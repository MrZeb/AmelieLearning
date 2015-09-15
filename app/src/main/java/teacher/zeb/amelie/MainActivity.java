package teacher.zeb.amelie;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import teacher.zeb.amelie.model.Clothes;
import teacher.zeb.amelie.model.Pants;
import teacher.zeb.amelie.model.Shirt;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate( Bundle savedInstanceState )
    {

        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        //  Clothes clot = new Clothes(); //Instantiera ett objekt // ta bort instansen eftersom vi gör Clothes abstract.

        Shirt shirt = new Shirt(); //Skapa en tröja

        List<Clothes> clothes = new ArrayList<>(  ); //Skapa en lista med kläder

        clothes.add(shirt); // Lägg till ny tröja

        clothes.add(new Pants()); //Lägg till nya byxor

        for( Clothes thing : clothes )
        {
          //  Shirt shirt2 = (Shirt) thing; //typecasting
        }

        Palette palette = Palette.generate(BitmapFactory.decodeResource(getResources(), R.drawable.green_dress));
        List<Palette.Swatch> swatches = palette.getSwatches();


        //TODO: importera Eclipse shortcommand library.

        //TODO: Hitta den vanligaste färgen
      Palette.Swatch mostPopular = swatches.get(0);
        for( Palette.Swatch swatch : swatches){
                    if (swatch.getPopulation() > mostPopular.getPopulation()){
                        mostPopular = swatch;
                    }

        }

        //TODO: Hitta den färgen (Color) som är närmst den vanligaste färgen

        ImageView imageView = (ImageView) findViewById(R.id.main_picture);
        imageView.setImageResource(R.drawable.green_dress);
        TextView textView = (TextView) findViewById(R.id.common_color);

        textView.setText(Integer.toHexString(mostPopular.getRgb())
        );
        textView.setTextColor( mostPopular.getBodyTextColor());
        textView.setBackgroundColor(mostPopular.getRgb());



        //TODO: Visa en popup för användaren där hen får välja om den färgen som hittats är rätt eller om hen
        // vill använda en egen
        //is it right color? Yes or no...
    }


    @Override
    public boolean onCreateOptionsMenu( Menu menu )
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.menu_main, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item )
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if( id == R.id.action_settings )
        {
            return true;
        }

        return super.onOptionsItemSelected( item );
    }
}
