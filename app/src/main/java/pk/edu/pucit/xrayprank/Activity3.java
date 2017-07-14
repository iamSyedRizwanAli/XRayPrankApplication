package pk.edu.pucit.xrayprank;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Activity3 extends AppCompatActivity {

    private int msgPics[] = {R.drawable.prank_message_1, R.drawable.prank_message_2, R.drawable.prank_message_3, R.drawable.prank_message_4, R.drawable.prank_message_6, R.drawable.prank_message_7, R.drawable.prank_message_5, R.drawable.prank_message_8};

    private ImageView backButton, prankMessage, gotIt, reloadButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        reloadButton = (ImageView) findViewById(R.id.reloadButton);
        reloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val = (int) (Math.random() * 6);
                prankMessage.setImageResource(msgPics[val]);
            }
        });

        gotIt = (ImageView) findViewById(R.id.got_it);
        gotIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackButtonPressed();
            }
        });

        backButton = (ImageView) findViewById(R.id.act3_backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackButtonPressed();
            }
        });

        prankMessage = (ImageView) findViewById(R.id.prankMessage);
        int value = (int) (Math.random() * 6);
        prankMessage.setImageResource(msgPics[value]);

    }

    private void onBackButtonPressed() {
        Intent i = new Intent(this, Activity1.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        onBackButtonPressed();
    }
}
