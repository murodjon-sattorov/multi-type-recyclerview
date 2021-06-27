package uz.murodjon_sattorov.simplerecyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import uz.murodjon_sattorov.simplerecyclerviewapp.adapter.UniversalAdapter
import uz.murodjon_sattorov.simplerecyclerviewapp.databinding.ActivityMainBinding
import uz.murodjon_sattorov.simplerecyclerviewapp.model.BaseModel
import uz.murodjon_sattorov.simplerecyclerviewapp.model.RecyclerData1

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    private var adapter = UniversalAdapter()

    private var addData = ArrayList<BaseModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(mainBinding.root)

        mainBinding.recyclerView.adapter = adapter
        mainBinding.recyclerView.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        loadData();

        addData.shuffle()

        adapter.data = addData


    }

    private fun loadData() {
        for (i in 0..10) {
            addData.add(RecyclerData1("https://zira.uz/wp-content/uploads/2018/05/grecheskiy-salat-1.jpg", "Grekcha salat"))
            addData.add(RecyclerData1("https://images11.domashnyochag.ru/upload/img_cache/312/3123269a9355f5f6ea524244827fb066_cropped_690x464.jpg", "Самый настоящий гамбургер"))
            addData.add(RecyclerData1("https://internationaltaxreview.com/Media/images/international-tax-review/anjana-haines/october-2020/AdobeStock_301659373_Editorial_Use_Only_Coca-Cola.jpg", "Coca-Cola"))
        }
    }
}