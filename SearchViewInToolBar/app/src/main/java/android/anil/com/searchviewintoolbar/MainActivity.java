package android.anil.com.searchviewintoolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    MyRecAdapter myRecAdapter;
    RecyclerView recyclerView;
    List<Post> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.myrec);
        createdata();
        myRecAdapter = new MyRecAdapter(list, MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(myRecAdapter);

    }

    void createdata() {
//        myRecAdapter.notifyDataSetChanged();
        list = new ArrayList<>();
        list.add(new Post("Anil", "Tadipatri,RaylaSeema"));
        list.add(new Post("Aswartha", "Jammalamadugu,RaylaSeema"));
        list.add(new Post("Jayachandra", "Konnali,RaylaSeema"));
        list.add(new Post("Mohan", "Pileru,RaylaSeema"));
        list.add(new Post("TulasiRam", "Pulivendula,RaylaSeema"));
        list.add(new Post("Ashraff", "Rayachoti,RaylaSeema"));
        list.add(new Post("Kishore", "Rajampeta,RaylaSeema"));
        list.add(new Post("Mahendra", "Porumamilla,RaylaSeema"));
        list.add(new Post("Veera", "Ananthapur,RaylaSeema"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);

        MenuItem search = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) search.getActionView();

        searchView.setOnQueryTextListener(this);

        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onQueryTextSubmit(String query) {
//        Toast.makeText(MainActivity.this, "Name is : "+query, Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {

        final List<Post> filteredModelList = filter(list, newText);
        if (filteredModelList.size() > 0) {
            myRecAdapter.setFilter(filteredModelList);
            return true;
        } else {
            Toast.makeText(MainActivity.this, "Not Found", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private List<Post> filter(List<Post> models, String query) {
        query = query.toLowerCase();

        final List<Post> filteredModelList = new ArrayList<>();
        for (Post model : models) {
            final String text = model.getPostTitle().toLowerCase();
            if (text.contains(query)) {
                filteredModelList.add(model);

            }
        }
        createdata();
        myRecAdapter = new MyRecAdapter(filteredModelList, MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(myRecAdapter);
        myRecAdapter.notifyDataSetChanged();
        return filteredModelList;
    }
}
