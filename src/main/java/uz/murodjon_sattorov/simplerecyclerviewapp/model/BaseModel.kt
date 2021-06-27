package uz.murodjon_sattorov.simplerecyclerviewapp.model

/**
 *Created by <a href="mailto:sattorovmurodjon43@gmail.com">Murodjon Sattorov</a>
 *
 *@author Murodjon
 *@date 27.06.2021
 *@project Simple RecyclerView app
 **/
interface BaseModel {

    companion object {

        var TYPE_ONE: Int
            set(value) {

            }
            get() = 0

        var TYPE_TWO: Int
            set(value) {

            }
            get() = 1

        var TYPE_THREE: Int
            set(value) {

            }
            get() = 2

    }

    fun getType(): Int

}