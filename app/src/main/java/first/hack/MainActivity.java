package first.hack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defineButtons();
    }

    public void defineButtons() {
        findViewById(R.id.button).setOnClickListener(buttonClockListener);
        findViewById(R.id.button2).setOnClickListener(buttonClockListener);
    }

    View.OnClickListener buttonClockListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button:
                    startActivity(new Intent(MainActivity.this, Emergency.class));
                    break;
                case R.id.button2:
                    startActivity(new Intent(MainActivity.this, Location.class));
                    break;
            }
        }
    };
}
