package com.imooc.spcache;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.zhy.cache.SpCache;


public class MainActivity extends ActionBarActivity
{

    private static String ACTIVITY_CREATE_COUNT = "ACTIVITY_CREATE_COUNT";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int count = SpCache.getInt(ACTIVITY_CREATE_COUNT, 0) + 1;
        SpCache.putInt(ACTIVITY_CREATE_COUNT, count);

        ((TextView) findViewById(R.id.id_count)).setText("" + count);


    }


    @Override
    protected void onResume()
    {
        super.onResume();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
