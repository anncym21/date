import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.date.R
import java.text.SimpleDateFormat
import java.util.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
        val textView: TextView = findViewById(R.id.textView)
        val calendar: Calendar = Calendar.getInstance()
        val simpleDateFormat = SimpleDateFormat("EEEE, dd-MMM-yyyy hh-mm-ss a")
        val dateTime = simpleDateFormat.format(calendar.time)
        textView.text = dateTime
    }
}