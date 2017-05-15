package com.example.myholivia.restaurantyelp;

import android.content.Intent;
import android.content.res.Configuration;


import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class RestaurantListActivity extends AppCompatActivity
        implements RestaurantGridFragment.OnItemSelectListener,
        RestaurantListFragment.OnItemSelectListener {


    RestaurantListFragment listFragment;
    RestaurantGridFragment gridFragment;

    @Override
    public void onItemSelectedGrid(int position) {
        listFragment.onItemSelected(position);
    }
    @Override
    public void onItemSelected(int position) {
        gridFragment.onItemSelected(position);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_list);

        if (findViewById(R.id.fragment_container) != null) {
            Intent intent = getIntent();
            if (intent.getExtras() != null) {
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.fragment_list_container, new BackendListFragment()).commit();
            } else {
                listFragment = new RestaurantListFragment();
                getSupportFragmentManager().beginTransaction().add(R.id.fragment_list_container, listFragment).commit();
            }
        }

        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                YelpApi yelp = new YelpApi();
                yelp.searchForBusinessesByLocation("dinner", "San Francisco, CA", 20);
                return null;

            }
        }.execute();


    }

    private boolean isTablet() {
        return (getApplicationContext().getResources().getConfiguration().screenLayout &
                Configuration.SCREENLAYOUT_SIZE_MASK) >=
                Configuration.SCREENLAYOUT_SIZE_LARGE;
    }




}
