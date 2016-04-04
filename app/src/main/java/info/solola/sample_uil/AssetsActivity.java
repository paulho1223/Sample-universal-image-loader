package info.solola.sample_uil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;

public class AssetsActivity extends AppCompatActivity {
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


        String imageUri = "assets://image.png";

        // Load image, decode it to Bitmap and display Bitmap in ImageView (or any other view
        //  which implements ImageAware interface)
        imageLoader.displayImage(imageUri, imageView);
    }
}
