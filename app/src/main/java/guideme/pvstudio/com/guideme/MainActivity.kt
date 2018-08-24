package guideme.pvstudio.com.guideme

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.design.widget.Snackbar
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Toast", Toast.LENGTH_LONG ).show() // Mensaje en pantalla

        val layout = findViewById<ConstraintLayout>(R.id.mainView)
        //Snackbar.make(layout, "SnackBar", Snackbar.LENGTH_LONG).show()
        Snackbar.make(layout, "SnackBar", Snackbar.LENGTH_LONG).setAction("buttom"){
            Snackbar.make(layout,"Clicked",Snackbar.LENGTH_LONG).show()
        }.show()
    }
}
