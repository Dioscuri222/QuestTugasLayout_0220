package com.example.composelayout

import androidx.compose.runtime.Composable


@Composable
fun UserCardWidget(
    bgColorRes: Int,
    namaRes: Int,
    alamatRes: Int,
    noTelpRes: Int? = null,
    isCursiveFont: Boolean = false,
    namaColorRes: Int = R.color.white,
    telpColorRes: Int = R.color.text_cyan,
    alamatColorRes: Int = R.color.white
)