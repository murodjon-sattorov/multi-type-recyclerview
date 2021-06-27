package uz.murodjon_sattorov.simplerecyclerviewapp.model

import uz.murodjon_sattorov.simplerecyclerviewapp.model.BaseModel.Companion.TYPE_ONE

/**
 *Created by <a href="mailto:sattorovmurodjon43@gmail.com">Murodjon Sattorov</a>
 *
 *@author Murodjon
 *@date 27.06.2021
 *@project Simple RecyclerView app
 **/
class RecyclerData1(var img: String, var title: String): BaseModel {
    override fun getType(): Int {
        return TYPE_ONE
    }
}