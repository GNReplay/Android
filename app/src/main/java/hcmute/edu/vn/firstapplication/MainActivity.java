package hcmute.edu.vn.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab2_week2);
    }

    public void calculate(View view) {
        EditText inputA = (EditText)findViewById(R.id.InputA);
        EditText inputB = (EditText)findViewById(R.id.InputB);
        EditText output = (EditText)findViewById(R.id.Output);
        Button btnCal = (Button)findViewById(R.id.calculate);
        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(inputA.getText().toString());
                int b = Integer.parseInt(inputB.getText().toString());
                String c = String.valueOf(a+b);
                output.setText(c);
            }
        });
    }
}