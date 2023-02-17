package ramazan.gurpinar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ramazan.gurpinar.databinding.ActivityDetailsBinding
import ramazan.gurpinar.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}