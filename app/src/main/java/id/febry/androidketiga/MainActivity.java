package id.febry.androidketiga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etInput;
    private Button btnSave;
    private TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInput = findViewById(R.id.et_input);
        btnSave = findViewById(R.id.btn_save);
        tvShow = findViewById(R.id.tv_show);


        SharedPreferences sharedPreferences = getSharedPreferences(getString(R.string.shared_preferences_key), Context.MODE_PRIVATE);

        if(!sharedPreferences.getString(getString(R.string.input_key), "").equals("")){
            tvShow.setText(sharedPreferences.getString(getString(R.string.input_key), ""));
        }

        btnSave.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        SharedPreferences.Editor editor = sharedPreferences.edit();

                        String hasilInput = etInput.getText().toString();

                        editor.putString(getString(R.string.input_key), hasilInput);
                        editor.apply();

                        tvShow.setText(hasilInput);
                    }
                }
        );
    }
}