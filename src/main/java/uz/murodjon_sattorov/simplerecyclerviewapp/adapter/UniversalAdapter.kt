package uz.murodjon_sattorov.simplerecyclerviewapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import uz.murodjon_sattorov.simplerecyclerviewapp.databinding.RecyclerItem2Binding
import uz.murodjon_sattorov.simplerecyclerviewapp.databinding.RecyclerItemBinding
import uz.murodjon_sattorov.simplerecyclerviewapp.model.BaseModel
import uz.murodjon_sattorov.simplerecyclerviewapp.model.RecyclerData1
import uz.murodjon_sattorov.simplerecyclerviewapp.model.RecyclerData2

/**
 *Created by <a href="mailto:sattorovmurodjon43@gmail.com">Murodjon Sattorov</a>
 *
 *@author Murodjon
 *@date 27.06.2021
 *@project Simple RecyclerView app
 **/
class UniversalAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var data: ArrayList<BaseModel>? = null
        set(value) {
            data?.let {
                field = value
                notifyDataSetChanged()
            }
        }

    override fun getItemViewType(position: Int): Int {
        data?.let {
            return it[position].getType()
        }
        return 0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var vh: RecyclerView.ViewHolder
        when (viewType) {
            BaseModel.TYPE_ONE -> {
                vh = Item1(RecyclerItemBinding.inflate(LayoutInflater.from(parent.context)))
            }
            BaseModel.TYPE_TWO -> {
                vh = Item2(RecyclerItem2Binding.inflate(LayoutInflater.from(parent.context)))
            }
            else -> {
                vh = Item2(RecyclerItem2Binding.inflate(LayoutInflater.from(parent.context)))
            }
        }
        return vh
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var viewType = getItemViewType(position)
        when (viewType) {
            BaseModel.TYPE_ONE -> {
                (holder as Item1).bindData(data!![position] as RecyclerData1)
            }
            BaseModel.TYPE_TWO -> {
                (holder as Item2).bindData(data!![position] as RecyclerData2)
            }
            else -> {
                (holder as Item1).bindData(data!![position] as RecyclerData1)
            }
        }
    }

    override fun getItemCount(): Int {
        data?.let {
            return it.size
        }
        return 0
    }

    inner class Item1(var binding: RecyclerItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindData(d: RecyclerData1) {
            Glide.with(binding.image).load(d.img).into(binding.image)
            binding.title.text = d.title
        }
    }

    inner class Item2(var binding: RecyclerItem2Binding) : RecyclerView.ViewHolder(binding.root) {
        fun bindData(d: RecyclerData2) {
            Glide.with(binding.image).load(d.img).into(binding.image)
            binding.text1.text = d.text1
            binding.text2.text = d.text2
            binding.text3.text = d.text3
            binding.text4.text = d.text4
        }
    }

}