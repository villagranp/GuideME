package guideme.pvstudio.com.guideme

import android.os.Bundle
import android.os.Handler
import android.widget.Toast

class lifeCycle : lifeCycleEventActivity() {

    var backEnable = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
    }

    override fun onBackPressed() {
        if (backEnable) {
            super.onBackPressed()
        }
        backEnable = true
        Toast.makeText(this, "Press back again to exit this activity.", Toast.LENGTH_LONG).show()
        Handler().postDelayed(Runnable{ backEnable = false }, 2000)
    }
}
