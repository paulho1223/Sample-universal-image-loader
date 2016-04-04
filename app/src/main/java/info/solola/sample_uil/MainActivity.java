package info.solola.sample_uil;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_assets, btn_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Create global configuration and initialize ImageLoader with this config
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this)

                .build();

        ImageLoader.getInstance().init(config);

        btn_assets = (Button) findViewById(R.id.btnAssets);

        btn_assets.setOnClickListener(this);

        btn_url = (Button) findViewById(R.id.btn_Url);

        btn_url.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAssets:
                this.startActivity(new Intent(this, AssetsActivity.class));
                break;
            case R.id.btn_Url:
                this.startActivity(new Intent(this, URLActivity.class));
                break;
        }
    }
}
