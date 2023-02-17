package ramazan.gurpinar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ramazan.gurpinar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        // landmark name , country name, landmark image
        val pisa = Landmark("Pisa Kulesi","Italya",R.drawable.pisa)
        val eyfel = Landmark("Eyfel Kulesi","Fransa",R.drawable.eyfel)
        val londonBridge = Landmark("London Bridge","UK",R.drawable.londonbridge)
        val tajmahal = Landmark("Taj Mahal","Hindistan",R.drawable.tajmahal)

        landmarkList.add(pisa)
        landmarkList.add(eyfel)
        landmarkList.add(londonBridge)
        landmarkList.add(tajmahal)

        // Recycler View

        binding.landmarkRecyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = LandmarkAdapter(landmarkList)
        binding.landmarkRecyclerView.adapter = adapter
    }
}