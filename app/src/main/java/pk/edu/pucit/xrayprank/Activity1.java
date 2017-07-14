package pk.edu.pucit.xrayprank;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Activity1 extends AppCompatActivity {

    int [] buttonIds = {R.id.start, R.id.instructions, R.id.exit};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        for(int i = 0 ; i < buttonIds.length ; i++) {
            ImageView img = (ImageView) findViewById(buttonIds[i]);
            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    intentStarter(view);
                }

            });
        }
    }

    public void intentStarter(View view) {

        if(view.getId() == buttonIds[0] && HelperClass.doMobileHasCamera(this)) {
            Intent i = new Intent(this, Activity2.class);
            startActivity(i);

        }else if(view.getId() == buttonIds[1]){
            Intent i = new Intent(this, Activity4.class);
            startActivity(i);
        }else if(view.getId() == buttonIds[2]){
            onBackPressed();
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
