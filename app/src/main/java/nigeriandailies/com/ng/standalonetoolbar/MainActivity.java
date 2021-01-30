package nigeriandailies.com.ng.standalonetoolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar =  findViewById(R.id.toolbar);
        toolbar.setTitle("Welcome !");
        toolbar.setSubtitle("Folks !");

        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                String msg = "";

                switch (item.getItemId()) {

                    case R.id.discard:
                        msg = getString(R.string.delete);
                        break;

                    case R.id.search:
                        msg = getString(R.string.search);
                        break;

                    case R.id.edit:
                        msg = getString(R.string.edit);
                        break;

                    case R.id.settings:
                        msg = getString(R.string.settings);
                        break;

                    case R.id.Exit:
                        msg = getString(R.string.exit);
                        break;
                }

                Toast.makeText(MainActivity.this, msg + " clicked !", Toast.LENGTH_SHORT).show();

                return true;
            }
        });
    }
}