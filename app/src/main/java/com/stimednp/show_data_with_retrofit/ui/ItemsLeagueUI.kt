package com.stimednp.show_data_with_retrofit.ui

import android.graphics.Typeface
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.content.ContextCompat.getColor
import com.stimednp.show_data_with_retrofit.R
import org.jetbrains.anko.*
import com.stimednp.show_data_with_retrofit.R.color.*

/**
 * Created by rivaldy on 11/10/2019.
 */

class ItemsLeagueUI : AnkoComponent<ViewGroup> {
    override fun createView(ui: AnkoContext<ViewGroup>): View {
        return with(ui) {
            verticalLayout {
                lparams(matchParent, wrapContent)
                orientation = LinearLayout.VERTICAL

                textView {
                    id = R.id.tv_name
                    textSize = 12f
                    textColor = getColor(context, colorAccent)
                    typeface = Typeface.DEFAULT_BOLD
                }.lparams(matchParent, wrapContent){
                    margin = dip(16)
                }
            }
        }
    }
}