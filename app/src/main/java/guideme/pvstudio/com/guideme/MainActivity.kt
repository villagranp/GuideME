package guideme.pvstudio.com.guideme

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpToolBar()

        Toast.makeText(this, "Toast", Toast.LENGTH_LONG).show() // Mensaje en pantalla


//        val layout = mainView
        //Snackbar.make(layout, "SnackBar", Snackbar.LENGTH_LONG).show()
        Snackbar.make(mainContainer, "SnackBar", Snackbar.LENGTH_LONG).setAction("buttom") {
            Snackbar.make(mainContainer, "Clicked", Snackbar.LENGTH_LONG).show()
        }.show()
    }

    fun setUpToolBar() {
        setSupportActionBar(toolbar)
//        supportActionBar.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title="Menu Kotlin"
    }
}
