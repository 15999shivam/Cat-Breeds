package brreds.cat.catbreeds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CatDetails extends AppCompatActivity {


    TextView Name;
    TextView description;
    TextView weight;
    TextView Temprament;
    TextView Origin;
    TextView LifeSpan;
    TextView WikipediaLink;
    TextView DogFriendnessLevel;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_details);
        Name = findViewById(R.id.name_of_cat);
        description = findViewById(R.id.description_of_cat);
        weight = findViewById(R.id.weight_of_cat);
        Temprament = findViewById(R.id.temprament_of_cat);
        Origin = findViewById(R.id.origin_of_cat);
        LifeSpan = findViewById(R.id.lifespan_of_cat);
        WikipediaLink = findViewById(R.id.Wikipedia_of_cat);
        DogFriendnessLevel = findViewById(R.id.Dog_friendness_of_cat);
        image = findViewById(R.id.cat_image);
        getIncomingIntent();
    }
    private void getIncomingIntent(){
        if(getIntent().hasExtra("name")){

            Name.setText(getIntent().getStringExtra("name"));

        }
        if(getIntent().hasExtra("description")){

            description.setText(getIntent().getStringExtra("description"));


        }
        if(getIntent().hasExtra("dogfriend")){
//            Log.i("dog friendness",getIntent().getStringExtra("dogfriend"));
            DogFriendnessLevel.setText(getIntent().getStringExtra("dogfriend"));
        }
        if(getIntent().hasExtra("weight")){

            weight.setText(getIntent().getStringExtra("weight"));

        }
        if(getIntent().hasExtra("temprament")){

            Temprament.setText(getIntent().getStringExtra("temprament"));

        }
        if(getIntent().hasExtra("origin")){

            Origin.setText(getIntent().getStringExtra("origin"));

        }
        if(getIntent().hasExtra("lifespan")){

            LifeSpan.setText(getIntent().getStringExtra("lifespan"));


        }
        if(getIntent().hasExtra("wikipedia")){

            WikipediaLink.setText(getIntent().getStringExtra("wikipedia"));


        }
        if(getIntent().hasExtra("imgurl")){
           String url =  getIntent().getStringExtra("imgurl");
           if(url != "no")
            Glide.with(this).load(url).into(image);
        }
    }
}







