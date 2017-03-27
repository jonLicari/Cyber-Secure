package first.hack;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v4.content.ContextCompat;
import android.Manifest;

public class Emergency extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        defineButtons();
    }

    public void defineButtons() {
        findViewById(R.id.button3).setOnClickListener(buttonClockListener);
        findViewById(R.id.button4).setOnClickListener(buttonClockListener);
        findViewById(R.id.button5).setOnClickListener(buttonClockListener);
    }

    View.OnClickListener buttonClockListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String num;
            Intent callIntent;
            switch (v.getId()) {
                case R.id.button4: //rudy
                    num = "6477604720";
                    callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:" + num));

                    startActivity(callIntent);

                case R.id.button5: //rye security
                    num = "4169795040";
                    callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:" + num));

                    startActivity(callIntent);

                case R.id.button3: //EMS
                    num = "9052712848";
                    callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:" + num));

                    startActivity(callIntent);
            }

        }
    };

}
