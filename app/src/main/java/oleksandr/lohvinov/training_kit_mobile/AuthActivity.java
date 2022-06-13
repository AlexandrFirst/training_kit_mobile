package oleksandr.lohvinov.training_kit_mobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import oleksandr.lohvinov.training_kit_mobile.adapters.AuthItemAdapter;
import oleksandr.lohvinov.training_kit_mobile.auth_models.AuthMenuModel;
import oleksandr.lohvinov.training_kit_mobile.auth_models.AuthMode;
import oleksandr.lohvinov.training_kit_mobile.fragments.AuthFragment;
import oleksandr.lohvinov.training_kit_mobile.fragments.RegisterFragment;
import oleksandr.lohvinov.training_kit_mobile.fragments.StartFragment;

public class AuthActivity extends AppCompatActivity {

    public static final String AUTH_MODE_KEY = "mode";

    private String[] mNavigationDrawerItemTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    Toolbar toolbar;
    private CharSequence mDrawerTitle;
    private CharSequence mTitle;
    ActionBarDrawerToggle mDrawerToggle;

    ImageView sportLogo;

    Button switchToLoginBtn;
    Button switchToRegisterBtn;

    AuthMode authMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        if (savedInstanceState != null) {
            if (savedInstanceState.containsKey(AUTH_MODE_KEY)) {
                authMode = AuthMode.values()[savedInstanceState.getInt(AUTH_MODE_KEY)];
                selectItem(authMode.getValue());
            }
        }

        sportLogo = findViewById(R.id.start_image);

        mTitle = mDrawerTitle = getTitle();

        mNavigationDrawerItemTitles = getResources().getStringArray(R.array.navigation_drawer_items_array);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);



        setupToolbar();

        AuthMenuModel[] drawerItem = new AuthMenuModel[2];

        drawerItem[0] = new AuthMenuModel(R.drawable.login, "Login");
        drawerItem[1] = new AuthMenuModel(R.drawable.registration, "Register");

        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(true);

        AuthItemAdapter adapter = new AuthItemAdapter(this, R.layout.list_view_item_row, drawerItem);
        mDrawerList.setAdapter(adapter);
        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectItem(position);
            }
        });
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        setupDrawerToggle();

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame, new StartFragment()).commit();
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void checkIfUserLoggedIn() {
        //TODO: if user is already logged in, go to main page
    }

    private void selectItem(int position) {

        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new AuthFragment();
                authMode = AuthMode.LOGIN;

                switchToRegisterBtn.setVisibility(View.VISIBLE);
                switchToLoginBtn.setVisibility(View.GONE);
                break;
            case 1:
                fragment = new RegisterFragment();
                authMode = AuthMode.REGISTRATION;

                switchToRegisterBtn.setVisibility(View.GONE);
                switchToLoginBtn.setVisibility(View.VISIBLE);
                break;

            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();

            mDrawerList.setItemChecked(position, true);
            mDrawerList.setSelection(position);
            setTitle(mNavigationDrawerItemTitles[position]);
            mDrawerLayout.closeDrawer(mDrawerList);

        } else {
            Log.e("MainActivity", "Error in creating fragment");
        }
    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(AUTH_MODE_KEY, authMode.getValue());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void setTitle(CharSequence title) {
        mTitle = title;
        getSupportActionBar().setTitle(mTitle);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    void setupToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        switchToLoginBtn = (Button) toolbar.findViewById(R.id.switchToLoginBtn);
        switchToRegisterBtn = (Button) toolbar.findViewById(R.id.switchToRegistrationBtn);

        switchToLoginBtn.setOnClickListener(v -> selectItem(AuthMode.LOGIN.getValue()));

        switchToRegisterBtn.setOnClickListener(v -> selectItem(AuthMode.REGISTRATION.getValue()));
    }

    void setupDrawerToggle() {
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.app_name, R.string.app_name);
        mDrawerToggle.syncState();
    }
}