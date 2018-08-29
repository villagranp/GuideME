package guideme.pvstudio.com.guideme

import android.content.Intent
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
        showToast()
        showSnackBar()

        val btnLifeCycle = btnCycle
        val btnEvents = btnEvent

        btnLifeCycle.setOnClickListener { goToLifeCycle() }
        btnEvents.setOnClickListener { goToEvents() }
        btnExtension.setOnClickListener{ goToExtensions() }
    }

    fun showToast() {
        Toast.makeText(this, "Toast", Toast.LENGTH_LONG).show() // Mensaje en pantalla
    }

    fun showSnackBar() {
//        val layout = mainView
//        Snackbar.make(layout, "SnackBar", Snackbar.LENGTH_LONG).show()
        Snackbar.make(mainContainer, "SnackBar", Snackbar.LENGTH_LONG).setAction("buttom") {
            Snackbar.make(mainContainer, "Clicked", Snackbar.LENGTH_LONG).show()
        }.show()
    }

    fun setUpToolBar() {
        setSupportActionBar(toolbar)
//        supportActionBar.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Menu Kotlin"
    }

    private fun goToLifeCycle() {
        val intent = Intent(this, lifeCycle::class.java)
        startActivity(intent)

    }

    //LineFun
    private fun goToEvents() = startActivity(Intent(this, Events::class.java))
    private fun goToExtensions() = startActivity(Intent(this, ExtensionsActivity::class.java))


}
