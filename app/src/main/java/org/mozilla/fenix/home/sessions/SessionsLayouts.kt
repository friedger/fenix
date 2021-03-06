/* This Source Code Form is subject to the terms of the Mozilla Public
   License, v. 2.0. If a copy of the MPL was not distributed with this
   file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.fenix.home.sessions

import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.PARENT_ID
import kotlinx.android.synthetic.main.component_sessions.*
import kotlinx.android.synthetic.main.fragment_home.*
import org.jetbrains.anko.constraint.layout.ConstraintSetBuilder.Side.BOTTOM
import org.jetbrains.anko.constraint.layout.ConstraintSetBuilder.Side.END
import org.jetbrains.anko.constraint.layout.ConstraintSetBuilder.Side.START
import org.jetbrains.anko.constraint.layout.ConstraintSetBuilder.Side.TOP
import org.jetbrains.anko.constraint.layout.applyConstraintSet
import org.mozilla.fenix.home.HomeFragment

fun HomeFragment.layoutComponents(layout: ConstraintLayout) {
    layout.applyConstraintSet {
        session_list {
            connect(
                BOTTOM to BOTTOM of PARENT_ID,
                START to START of PARENT_ID,
                END to END of PARENT_ID,
                TOP to BOTTOM of toolbar_wrapper
            )
        }
    }
}
