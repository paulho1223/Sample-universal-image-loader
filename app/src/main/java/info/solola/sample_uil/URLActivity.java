package info.solola.sample_uil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;

public class URLActivity extends AppCompatActivity {

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asset);

        imageView = (ImageView) findViewById(R.id.imageView);
    }

    @Override
    protected void onResume() {
        super.onResume();

        ImageLoader imageLoader = ImageLoader.getInstance(); // Get singleton instance


        String imageUri =  "https://scontent.xx.fbcdn.net/hprofile-xfa1/v/t1.0-1/c29.0.100.100/p100x100/10354686_10150004552801856_220367501106153455_n.jpg?oh=09da9f2112efa0cb1df7cfd423bea575&oe=5789F877";

        // Load image, decode it to Bitmap and display Bitmap in ImageView (or any other view
        //  which implements ImageAware interface)
        imageLoader.displayImage(imageUri, imageView);
    }
}
