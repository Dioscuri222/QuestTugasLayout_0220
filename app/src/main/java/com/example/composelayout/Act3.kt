package com.example.composelayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp


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
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 6.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = bgColorRes)
        )
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            // Logo Kiri
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = stringResource(id = R.string.logo_desc),
                modifier = Modifier.size(65.dp)
            )
        }
    }


}