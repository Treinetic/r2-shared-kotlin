/*
 * Module: r2-shared-kotlin
 * Developers: Aferdita Muriqi, Clément Baumann
 *
 * Copyright (c) 2018. Readium Foundation. All rights reserved.
 * Use of this source code is governed by a BSD-style license which is detailed in the
 * LICENSE file present in the project repository where this source code is maintained.
 */

package org.readium.r2.shared.metadata

import androidx.annotation.Keep
import org.readium.r2.shared.Collection
import java.io.Serializable


@Keep
class BelongsTo: Serializable {

    var series: MutableList<Collection> = mutableListOf()
    var collection: MutableList<Collection> = mutableListOf()

}
