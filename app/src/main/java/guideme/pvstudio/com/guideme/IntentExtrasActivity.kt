package guideme.pvstudio.com.guideme

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent_extras.*

class IntentExtrasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_extras)
        //pasar valores entre activitys
        val name : String? = intent.getStringExtra("name")
        val lastname : String? = intent.getStringExtra("lastname")
        val age : Int = intent.getIntExtra("age", -1)
        val developer : Boolean = intent.getBooleanExtra("developer", false)

        textViewName.text = name
        textViewLastName.text = lastname
        textViewAge.text = age.toString()
        checkBoxDevelop.isChecked = developer
    }
}
