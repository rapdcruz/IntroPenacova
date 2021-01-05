package com.example.intropenacova;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;


import com.google.android.material.navigation.NavigationView;



public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    Toolbar toolbar;
    NavigationView navigationView;
    Button btn_inscricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //metodo para iniciar com o search fragment
        fragmentManager = getSupportFragmentManager();

        if(findViewById(R.id.frame)!=null)
           if(savedInstanceState!=null)
             return;

           FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            PaginaInicialFragment PaginaInicialFragment = new PaginaInicialFragment();
            fragmentTransaction.add(R.id.frame,PaginaInicialFragment,null);
            fragmentTransaction.commit();

        //    }


        drawerLayout=findViewById(R.id.drawer);
        toolbar=findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id=menuItem.getItemId();
                Fragment fragment = null;
                switch (id)
                {
                    case R.id.id_Menu_PaginaInicial:
                        fragment=new PaginaInicialFragment();
                        loadFragment(fragment);
                        break;
                    case R.id.id_Menu_EventosAnteriores:
                        fragment=new EventosAnterioresFragment();
                        loadFragment(fragment);
                        break;
                    case R.id.id_Menu_SobreNos:
                        fragment=new SobreNosFragment();
                        loadFragment(fragment);
                        break;
                    case R.id.id_Menu_Contactos:
                        fragment=new ContactosFragment();
                        loadFragment(fragment);
                        break;
                    case R.id.id_Menu_Faqs:
                        fragment=new FaqsFragment();
                        loadFragment(fragment);
                        break;
                    case R.id.setting:
                        fragment=new SettingFragment();
                        loadFragment(fragment);
                        break;
                    case R.id.id_PoliticaPrivacidade:
                        fragment=new PoliticaPrivacidadeFragment();
                        loadFragment(fragment);
                        break;
                    default:
                        return true;
                }
                return true;
            }
        });









    }
    private void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame,fragment).commit();
        drawerLayout.closeDrawer(GravityCompat.START);
        fragmentTransaction.addToBackStack(null);
    }





}
