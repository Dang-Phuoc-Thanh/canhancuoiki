package com.example.canhancuoiki;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(Menu item) {
        // Handle item selection using if-else
        int id = item.getItem();

        if (id == R.id.menu_home) {
            // Xử lý khi menu_home được chọn
            replaceFragment(new HomeFragment());
            break;
        } else if (id == R.id.menu_setting) {
            // Xử lý khi menu_setting được chọn
            replaceFragment(new SettingFragment());
            break;
        } else if (id == R.id.menu_profile) {
            // Xử lý khi menu_profile được chọn
            replaceFragment(new ProfileFragment());
            break;
        }
    }

}


}