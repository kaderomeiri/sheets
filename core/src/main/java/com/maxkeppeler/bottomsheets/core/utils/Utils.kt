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

package com.maxkeppeler.bottomsheets.core.utils

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import androidx.annotation.RestrictTo

/** Save a text into the clipboard. */
@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
fun copyIntoClipboard(ctx: Context, label: String, value: String) {
    val clipboard = ctx.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
    val clip = ClipData.newPlainText(label, value)
    clipboard.setPrimaryClip(clip)
}

/** Receive the clipboard data. */
@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
fun pasteFromClipboard(ctx: Context): String? {
    val clipboard = ctx.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
    val item = clipboard.primaryClip?.getItemAt(0)
    return item?.text?.toString()
}