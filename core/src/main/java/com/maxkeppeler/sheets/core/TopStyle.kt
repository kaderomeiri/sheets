/*
 *  Copyright (C) 2020. Maximilian Keppeler (https://www.maxkeppeler.com)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.maxkeppeler.sheets.core

/**
 * Available top styles.
 */
enum class TopStyle {

    /**
     * Components are displayed above the cover.
     */
    ABOVE_COVER,

    /**
     * Close and additional icon buttons are within the cover image aligned to the top
     * while the title is positioned below the image cover.
     */
    MIXED,

    /**
     * Components are displayed below the cover.
     */
    BELOW_COVER
}