package teacher.zeb.amelie;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity
{

   // TODO: fixa emulatorn :)
    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Clothes clot = new Clothes(); //Instantiera ett objekt

        Shirt shirt = new Shirt(); //Skapa en tröja

        List<Clothes> clothes = new ArrayList<>(  ); //Skapa en lista med kläder

        clothes.add(shirt); // Lägg till ny tröja

        clothes.add(new Pants()); //Lägg till nya byxor

        for( Clothes thing : clothes )
        {
          //  Shirt shirt2 = (Shirt) thing; //typecasting
        }

        Palette palette = Palette.generate(BitmapFactory.decodeResource(getResources(), R.drawable.black_skirt));
        palette.getSwatches();

        //TODO: Hitta den vanligaste färgen
        for(Palette.Swatch swatch : palette.getSwatches()){
            Log.d("Swatch", swatch + ": " + Integer.toHexString(swatch.getRgb()));

        }

        //TODO: Hitta den färgen (Color) som är närmst den vanligaste färgen
        palette = Palette.generate(BitmapFactory.decodeResource(getResources(), R.drawable.black_skirt));


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
