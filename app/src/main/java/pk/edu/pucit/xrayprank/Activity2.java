package pk.edu.pucit.xrayprank;

import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class Activity2 extends AppCompatActivity {

    private Camera camera;
    private CameraPreview cameraPreview;
    private ImageView xrayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        camera = HelperClass.getCameraInstance();
        camera.setDisplayOrientation(90);
        cameraPreview = new CameraPreview(this, camera);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frameLayout);
        frameLayout.addView(cameraPreview);

        xrayButton = (ImageView) findViewById(R.id.xrayButton);
        xrayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), Activity3.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}