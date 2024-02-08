import android.content.Context
import android.view.MotionEvent
import com.example.a3dmodel_try.R
import org.rajawali3d.loader.LoaderOBJ
import org.rajawali3d.renderer.Renderer

class MyRenderer(context: Context) : Renderer(context) {
    override fun onOffsetsChanged(
        xOffset: Float,
        yOffset: Float,
        xOffsetStep: Float,
        yOffsetStep: Float,
        xPixelOffset: Int,
        yPixelOffset: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun onTouchEvent(event: MotionEvent?) {
        TODO("Not yet implemented")
    }

    override fun initScene() {
        val objParser = LoaderOBJ(mContext.resources, mTextureManager, R.raw.Touareg)
        try {
            objParser.parse()
            currentScene.addChild(objParser.parsedObject)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
