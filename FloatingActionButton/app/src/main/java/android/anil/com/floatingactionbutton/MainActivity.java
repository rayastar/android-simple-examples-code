package android.anil.com.floatingactionbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    FloatingActionButton fb1, fb2, fb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        final FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frame_layout);
//        frameLayout.getBackground().setAlpha(0);
        final FloatingActionsMenu fabMenu = (FloatingActionsMenu) findViewById(R.id.fab_menu);
        fb1 = (FloatingActionButton) findViewById(R.id.fab_event);
        fb2 = (FloatingActionButton) findViewById(R.id.fab_photo);
        fb3 = (FloatingActionButton) findViewById(R.id.fab_others);
        fabMenu.setOnFloatingActionsMenuUpdateListener(new FloatingActionsMenu.OnFloatingActionsMenuUpdateListener() {
            @Override
            public void onMenuExpanded() {
                frameLayout.getBackground().setAlpha(240);
                frameLayout.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        fabMenu.collapse();
                        return true;
                    }
                });
            }

            @Override
            public void onMenuCollapsed() {
                frameLayout.getBackground().setAlpha(0);
                frameLayout.setOnTouchListener(null);
            }
        });
        fb1.setOnClickListener(this);
        fb2.setOnClickListener(this);
        fb3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab_event:
                Snackbar.make(v, "Event Clicked", Snackbar.LENGTH_LONG).show();
                break;
            case R.id.fab_photo:
                Snackbar.make(v, "Photo Clicked", Snackbar.LENGTH_LONG).show();

                break;
            case R.id.fab_others:
                Snackbar.make(v, "Others Clicked", Snackbar.LENGTH_LONG).show();

                break;


        }
    }
}
