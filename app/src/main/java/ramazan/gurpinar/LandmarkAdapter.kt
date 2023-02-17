package ramazan.gurpinar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ramazan.gurpinar.databinding.RecyclerRowBinding

class LandmarkAdapter(val landmarkList: ArrayList<Landmark>): RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {

    class LandmarkHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarkHolder(binding)
    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        holder.binding.recyclerViewNameText.text = landmarkList[position].name
        holder.binding.recyclerViewCountryText.text = landmarkList[position].country
    }
}