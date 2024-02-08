import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a3dmodel_try.R
import org.rajawali3d.surface.RajawaliSurfaceView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val surfaceView = findViewById<RajawaliSurfaceView>(R.id.rajawali_surface)
        val renderer = MyRenderer(this)
        surfaceView.setSurfaceRenderer(renderer)
    }
}
