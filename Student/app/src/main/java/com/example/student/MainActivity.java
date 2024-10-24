package com.example.student;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4;
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

    public void Click(View view) {
        EditText value=findViewById(R.id.et1);
        String id=value.getText().toString();
         value=findViewById(R.id.et2);
        String name=value.getText().toString();
         value=findViewById(R.id.et3);
        String class=value.getText().toString();
         value=findViewById(R.id.et4);
        String id=value.getText().toString();
        RadioGroup rg=findViewById(R.id.rg_gender);
        int opt=getCheckedRadioButtonId();
        RadioButton rb=findViewById(opt);
        String gender=rb.getText().toString();
        SharedPreferences sp=getSharedPreferences("Data",MODE_PRIVATE);
        SharedPreferences.Editor editor= sp.edit();
        editor.getText("id",et1 );
        editor.getText("name",et2 );
        editor.getText("class",et3 );
        editor.getText("dob",et4 );
        editor.getText("gender",et5 );
        editor.apply();
        intent pass=new Intent(Mainactivity.this,after_login.class);
        startactivity(pass);




    }
}