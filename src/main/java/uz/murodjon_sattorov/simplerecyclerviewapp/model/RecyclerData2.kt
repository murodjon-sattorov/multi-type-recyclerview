package uz.murodjon_sattorov.simplerecyclerviewapp.model

import uz.murodjon_sattorov.simplerecyclerviewapp.model.BaseModel.Companion.TYPE_TWO

/**
 *Created by <a href="mailto:sattorovmurodjon43@gmail.com">Murodjon Sattorov</a>
 *
 *@author Murodjon
 *@date 27.06.2021
 *@project Simple RecyclerView app
 **/
class RecyclerData2(var img: String, var text1: String, var text2: String, var text3: String, var text4: String): BaseModel {
    override fun getType(): Int {
        return TYPE_TWO
    }
}