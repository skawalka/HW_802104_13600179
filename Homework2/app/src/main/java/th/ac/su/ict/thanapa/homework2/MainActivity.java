package th.ac.su.ict.thanapa.homework2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int[] idArray = {R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6};
    private Button[] btn = new Button[idArray.length];
    private TextView colorView;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorView = findViewById(R.id.colorView);

        for (i=0; i<idArray.length; i++){

            btn[i] = findViewById(idArray[i]);

            btn[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()){
                        case R.id.btn1:
                        case R.id.btn2:
                            colorView.setTextColor(Color.parseColor("#ffffff"));
                            break;
                        case R.id.btn3:
                        case R.id.btn4:
                        case R.id.btn5:
                        case R.id.btn6:
                            colorView.setTextColor(Color.parseColor("#000000"));
                            break;
                    }
                    switch (v.getId()){
                        case R.id.btn1:
                            colorView.setBackgroundColor(Color.parseColor("#5F708D"));
                            colorView.setText("95\n112\n141");
                            break;
                        case R.id.btn2:
                            colorView.setBackgroundColor(Color.parseColor("#7E8EA8"));
                            colorView.setText("126\n142\n168");
                            break;
                        case R.id.btn3:
                            colorView.setBackgroundColor(Color.parseColor("#A7B1C0"));
                            colorView.setText("167\n177\n192");
                            break;
                        case R.id.btn4:
                            colorView.setBackgroundColor(Color.parseColor("#EDE6D7"));
                            colorView.setText("237\n230\n215");
                            break;
                        case R.id.btn5:
                            colorView.setBackgroundColor(Color.parseColor("#EFCFC6"));
                            colorView.setText("239\n207\n198");
                            break;
                        case R.id.btn6:
                            colorView.setBackgroundColor(Color.parseColor("#EFC2BB"));
                            colorView.setText("239\n194\n187");
                            break;
                    }
                }
            });
        }
    }
}

