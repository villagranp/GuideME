package guideme.pvstudio.com.guideme

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_picasso.*
import java.lang.Exception

class PicassoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picasso)

        Picasso.get().load("https://images.pexels.com/photos/1028223/pexels-photo-1028223.jpeg").fetch()
        buttonLoad.setOnClickListener { loadImages() }

    }

    private fun loadImages() {
        Picasso.get()
                .load("https://images.pexels.com/photos/1028223/pexels-photo-1028223.jpeg")
                .fit()
                .transform(CircleTransform())
                .into(imageTop)

//        Picasso.get()
//                .load("https://images.pexels.com/photos/1021808/pexels-photo-1021808.jpeg")
//                .placeholder(R.drawable.logo)
//                .resize(300,300)
//                .centerInside()
//                .into(imageBottom)

        val context: Context = this
        Picasso.get()
                .load("https://images.pexels.com/photos/1021808/pexels-photo-1021808.jpeg")
                .fetch(object : Callback {
                    override fun onSuccess() {
                        imageBottom.alpha = 0f
                        Picasso.get()
                                .load("https://images.pexels.com/photos/1021808/pexels-photo-1021808.jpeg")
                                .fit()
                                .transform(CircleTransform())
                                .into(imageBottom)
                        imageBottom.animate().setDuration(2000).alpha(1f).start()
                    }

                    override fun onError(e: Exception?) {
                        imageBottom.alpha = 0f
                        Picasso.get()
                                .load(R.drawable.logo)
                                .fit()
                                .transform(CircleTransform())
                                .into(imageBottom)
                        imageBottom.animate().setDuration(2000).alpha(1f).start()
                    }

                })
    }
}
