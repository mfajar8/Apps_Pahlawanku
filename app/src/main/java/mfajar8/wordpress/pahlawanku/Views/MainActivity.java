package mfajar8.wordpress.pahlawanku.Views;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import mfajar8.wordpress.pahlawanku.R;
import mfajar8.wordpress.pahlawanku.Views.Explore.FragmentFavorite;
import mfajar8.wordpress.pahlawanku.Views.Explore.FragmentHero;
import mfajar8.wordpress.pahlawanku.Views.Explore.FragmentHome;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        BottomNavigationView butNav = findViewById(R.id.buttom_nav);
        butNav.setOnNavigationItemSelectedListener(this);
        String source;
        if(savedInstanceState==null){
            Bundle extras=getIntent().getExtras();
            if(extras==null){
                source=null;
            }else{
                source=extras.getString("source");
            }
        }else{
            source=(String) savedInstanceState.getSerializable("source");
        }
        if(source!=null){
            loadFragment(new FragmentHero());
        }else{
            loadFragment(new FragmentHome());

        }
    }

    void loadFragment(Fragment fragment){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container_frame, fragment);
        ft.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()){
            case R.id.menu_home:
                loadFragment(new FragmentHome());
                return true;
            case R.id.menu_pahlawan:
                loadFragment(new FragmentHero());
                return true;
            case R.id.menu_fav:
                loadFragment(new FragmentFavorite());
                return true;
        }
        return false;
    }
}
