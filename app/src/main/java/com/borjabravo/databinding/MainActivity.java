package com.borjabravo.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import com.borjabravo.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Borja", "Bravo", 24);
        binding.setUser(user);
    }

    public void onClickMe(View view) {
        Toast.makeText(view.getContext(),
                String.format(getString(R.string.click_me_info), binding.getUser().firstName, binding.getUser().age),
                Toast.LENGTH_SHORT).show();
    }
}
