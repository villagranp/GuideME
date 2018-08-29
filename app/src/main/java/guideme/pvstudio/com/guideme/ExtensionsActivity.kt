package guideme.pvstudio.com.guideme

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_extensions.*

class ExtensionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extensions)

        val btnById = findViewById<Button>(R.id.buttonByID)
        btnById.setOnClickListener { Toast.makeText(this, "Click to the button finding ID", Toast.LENGTH_LONG).show() }

        buttonByKAT.setOnClickListener { Toast.makeText(this, "Click button by KAT", Toast.LENGTH_LONG).show() }

    }
}
