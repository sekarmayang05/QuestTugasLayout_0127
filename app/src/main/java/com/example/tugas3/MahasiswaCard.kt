package com.example.tugas3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.draw.clip

@Composable
fun MahasiswaCard(
    mahasiswa: Mahasiswa,
    modifier: Modifier = Modifier
) {
    val logo = painterResource(id = R.drawable.logo_umy)

    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(dimensionResource(R.dimen.card_height))
            .clip(
                RoundedCornerShape(
                    dimensionResource(R.dimen.card_corner_radius)
                )
            )
            .background(colorResource(mahasiswa.warnaCard))
            .padding(dimensionResource(R.dimen.card_padding)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Image(
            painter = logo,
            contentDescription = stringResource(R.string.logo_description),
            modifier = Modifier.size(
                dimensionResource(R.dimen.logo_size)
            )
        )

        androidx.compose.foundation.layout.Column(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 12.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = mahasiswa.nama,
                color = colorResource(R.color.text_white),
                fontSize = dimensionResource(R.dimen.name_size).value.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 1
            )

            Text(
                text = mahasiswa.telepon,
                color = colorResource(mahasiswa.warnaTelepon),
                fontSize = dimensionResource(R.dimen.detail_size).value.sp,
                maxLines = 1
            )

            Text(
                text = mahasiswa.alamat,
                color = colorResource(mahasiswa.warnaAlamat),
                fontSize = dimensionResource(R.dimen.detail_size).value.sp,
                maxLines = 1
            )
        }
    }
