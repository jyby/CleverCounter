package cl.lejyby.clevercounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;


public class ActiveCounter extends ActionBarActivity {

    double counter_variable = 0;
    double counter_increment = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active_counter);

        Button button_reset = (Button) findViewById(R.id.reset_button);
        Button button_decrement = (Button) findViewById(R.id.decrement_button);
        final TextView text_counter = (TextView) findViewById(R.id.increment_button);

        counter_variable = 0;

        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter_variable = 0;
                text_counter.setText("0");
            }
        });

        button_decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter_variable -= counter_increment;
                text_counter.setText(Double.toString(counter_variable));
            }
        });
        text_counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter_variable += counter_increment;
                text_counter.setText(Double.toString(counter_variable));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_active_counter, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
