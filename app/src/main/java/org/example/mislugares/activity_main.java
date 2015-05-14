package org.example.mislugares;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class activity_main extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void sePulsa(View view) {
        Toast.makeText(this, "Pulsado", Toast.LENGTH_SHORT).show();
    }

    public void lanzarAcercaDe(View view) {
        Intent i = new Intent(this, AcercaDe.class);
        startActivity(i);
    }

    public void salir(View view) {
        finish();
    }

   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.menu_main, menu);
        return true; /** true -> el menú ya está visible */
  }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { switch (item.getItemId()) {

        case R.id.action_settings:
            return true;

        case R.id.menu_buscar:
            return true;

        case R.id.acercaDe:
            lanzarAcercaDe(null);
            return true;
    }
        return false;
    }

}
