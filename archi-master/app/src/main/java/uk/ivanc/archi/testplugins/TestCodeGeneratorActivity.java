package uk.ivanc.archi.testplugins;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import uk.ivanc.archi.R;

public class TestCodeGeneratorActivity extends ActionBarActivity {

    Toolbar toolbar;
    EditText edittextusername;
    RelativeLayout layoutsearch;
    ProgressBar progress;
    TextView textinfo;
    RecyclerView reposrecyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_code_generator);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_test_code_generator, menu);
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

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        edittextusername = (EditText) findViewById(R.id.edit_text_username);
        layoutsearch = (RelativeLayout) findViewById(R.id.layout_search);
        progress = (ProgressBar) findViewById(R.id.progress);
        textinfo = (TextView) findViewById(R.id.text_info);
        reposrecyclerview = (RecyclerView) findViewById(R.id.repos_recycler_view);
    }
}
