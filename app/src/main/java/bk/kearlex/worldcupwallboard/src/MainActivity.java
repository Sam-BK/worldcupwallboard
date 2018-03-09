package bk.kearlex.worldcupwallboard.src;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import bk.kearlex.worldcupwallboard.R;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "bk.kearlex.wcwb.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // if (saved state flag) ? Collect saved state : Create all Groups, Matches and Teams.
    }

    public void openGroupActivity(View view, R.string resString){
        Intent intent = new Intent(this, GroupActivity.class);
        String groupString = resString.toString();
        intent.putExtra(EXTRA_MESSAGE, groupString);
        startActivity(intent);
    }
}
