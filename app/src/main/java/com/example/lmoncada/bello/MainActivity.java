package com.example.lmoncada.bello;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.maps.OnMapReadyCallback;

public class MainActivity extends AppCompatActivity {

    Button bCuidad, bTurismo, bHotel, bInfo, bAcerca, bBares;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bCuidad = (Button) findViewById(R.id.bCiudad);
        bTurismo = (Button) findViewById(R.id.bTurismo);
        bHotel = (Button) findViewById(R.id.bHotel);
        bInfo = (Button) findViewById(R.id.bInfo);
        bAcerca = (Button) findViewById(R.id.bAcerca);
        bBares = (Button) findViewById(R.id.bBares);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getGroupId();

        if (id == R.id.menu_configurar) {
            Toast.makeText(this, "Presiono Configurar", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    public void AbrirAcuidad(View view) {
        Intent i = new Intent(this, Acuidad.class);
        startActivity(i);
    }

    public void Abrirahotel(View view) {
        Intent i = new Intent(this, ahotel.class);
        startActivity(i);
    }

    public void Abriraturismo(View view) {
        Intent i = new Intent(this, aturismo.class);
        startActivity(i);
    }

    public void AbrirAinformacion(View view) {
        Intent i = new Intent(this, Ainformacion.class);
        startActivity(i);
    }

    public void AbrirAbares(View view) {
        Intent i = new Intent(this, Abares.class);
        startActivity(i);
    }

    public void AbrirAacerca(View view) {
        Intent i = new Intent(this, Aacerca.class);
        startActivity(i);
    }

    public void Abrirmenu(View view) {
        Intent i = new Intent(this, Menu.class);
        startActivity(i);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.lmoncada.bello/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.lmoncada.bello/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
