package com.mikesh.hp.codetutorial;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.mikesh.hp.codetutorial.R.id.username;

public class LoginPage extends AppCompatActivity implements View.OnClickListener{

    EditText userName,passWord;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        userName = (EditText) findViewById(username);

        passWord = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(this);

        //resize icons
//        final LinearLayout layout = (LinearLayout)findViewById(R.id.layout_root);
        final float density = getResources().getDisplayMetrics().density;
        final Drawable drawable_username = getResources().getDrawable(R.mipmap.username_icon);
        final Drawable drawable_password = getResources().getDrawable(R.mipmap.password_icon);

        final int width = Math.round(30 * density);
        final int height = Math.round(30*density);

        drawable_username.setBounds(0,0,width,height);
        drawable_password.setBounds(0,0,width,height);
        userName.setCompoundDrawables(drawable_username,null,null,null);
        passWord.setCompoundDrawables(drawable_password,null,null,null);



    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.login)
        {
            String un = userName.getText().toString();
            String pd = passWord.getText().toString();
            if (un.equals("admin")&& pd.equals("admin"))
            {
                Toast.makeText(getApplicationContext(),"Loadin...g",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(LoginPage.this,MainActivity.class);
                startActivity(i);
                finish();
            }
            else {
                Toast.makeText(getApplicationContext(),"Error.......",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
