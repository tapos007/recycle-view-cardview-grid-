package com.example.tapos.recyclercardviewgrid.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.tapos.recyclercardviewgrid.R;
import com.example.tapos.recyclercardviewgrid.adapter.RecycleAdapter;
import com.example.tapos.recyclercardviewgrid.model.Animal;

public class MainActivity extends AppCompatActivity {

    Toolbar toolber;
    RecyclerView recyclerView;
    private RecycleAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(null);
        toolber = (Toolbar)findViewById(R.id.toolbar);
        toolber.setTitle("my app");
        toolber.setSubtitle("another");
        setSupportActionBar(toolber);
        setUpRecycleView();
    }


    private void setUpRecycleView() {
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new RecycleAdapter(this, Animal.getData());
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.search_menu_id) {
//            Toast.makeText(MainActivity.this, "search App", Toast.LENGTH_LONG).show();
//        }
//        if(id == R.id.cart_menu_id){
//            Toast.makeText(MainActivity.this, "cart App", Toast.LENGTH_LONG).show();
//        }

        return super.onOptionsItemSelected(item);
    }
}
