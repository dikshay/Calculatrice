package com.androidprojects.dikshay.calculator2;


import android.app.Fragment;
import android.app.FragmentManager;
import android.content.res.Configuration;
import android.os.Bundle;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;

import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.androidprojects.dikshay.calculator2.R;


import com.gc.materialdesign.views.ButtonFlat;
import com.gc.materialdesign.views.ButtonRectangle;



/**
 * Created by Dikshay on 3/1/2015.
 */
public class Calculator extends ActionBarActivity {
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;
    private ListView leftDrawerList;
    //private ArrayAdapter<String> navigationDrawerAdapter;
    private String[] leftSliderData = {"Calculator","Github","About Us"};

    @Override
    public void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.calculator_layout);

        /*
        * code for actionbar drawer
        * */
        createView();
        if(toolbar !=null)
        {
            toolbar.setTitle("Calculator");
            setSupportActionBar(toolbar);
        }
        initDrawer();
        /*
        *end code for actionbar drawer
         */
        Fragment fragment = new CalculatorFragment();
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frame_container,fragment).commit();
            }
    private void createView()
    {
        leftDrawerList = (ListView)findViewById(R.id.left_drawer);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
       // navigationDrawerAdapter = new ArrayAdapter<String>(Calculator.this,android.R.layout.simple_list_item_1,leftSliderData);
       MyArrayAdapter navigationDrawerAdapter  =  new MyArrayAdapter(Calculator.this,leftSliderData);
        leftDrawerList.setAdapter(navigationDrawerAdapter);
        leftDrawerList.setOnItemClickListener(new SlideMenuClickListener());
    }
    public class SlideMenuClickListener implements ListView.OnItemClickListener
    {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id)
        {
            Log.e("ListView item clicked","clicked");
            displayView(position);
        }
    }
    public void displayView(int position)
    {
        Fragment fragment = null;
        switch(position)
        {
            case 0:
                fragment = new CalculatorFragment();
                break;
            case 1:
                fragment = new GithubFragment();
                break;
            case 2:
                fragment = new AboutUsFragment();
                break;


            default: break;
        }
        if(fragment!=null)
        {
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.frame_container,fragment).commit();
            RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.left_drawer_relative_layout);
           // drawerLayout.closeDrawer(leftDrawerList);
            drawerLayout.closeDrawer(relativeLayout);
        }
        else
        {
            Log.e("Calculator","error");
        }


    }

    private void initDrawer()
    {
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close){
          @Override
        public void onDrawerClosed(View drawerView)
          {
              super.onDrawerClosed(drawerView);
          }
            @Override
        public void onDrawerOpened(View drawerView)
            {
                super.onDrawerOpened(drawerView);
            }
        };
        drawerLayout.setDrawerListener(drawerToggle);
    }
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      //  getMenuInflater().inflate(R.menu.menu_splash_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        if (drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    }

