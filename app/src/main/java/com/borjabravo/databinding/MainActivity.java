package com.borjabravo.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.borjabravo.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User("Borja", "Bravo", 24);
        binding.setUser(user);
    }

    public void onClickMe(View view) {
        user.setFirstName("Juan");
        user.setLastName("García");
        user.setAge(35);
    }
}
