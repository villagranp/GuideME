package guideme.pvstudio.com.guideme

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_intents.*

class intentsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intents)

        buttonIntentEx.setOnClickListener { goIntentExtra() }
        buttonIntentFlags.setOnClickListener { goIntentFlags() }
        buttonIntentObject.setOnClickListener { goIntentObject() }

    }

    private fun goIntentExtra() {
        val intent = Intent(this, IntentExtrasActivity::class.java)
        intent.putExtra("name", "Jose Pablo")
        intent.putExtra("lastname", "Villagran")
        intent.putExtra("age", 26)
        intent.putExtra("developer", true)
        startActivity(intent)
    }

    private fun goIntentFlags() {
        val intent = Intent(this, IntentExtrasActivity::class.java)
        startActivity(intent)
    }

    private fun goIntentObject() {
        val intent = Intent(this, IntentExtrasActivity::class.java)
        startActivity(intent)
    }
}
