package com.example.tugas3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.weight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

@Composable
fun MahasiswaScreen() {
    val nama = stringArrayResource(R.array.mahasiswa_nama)
    val telepon = stringArrayResource(R.array.mahasiswa_telepon)
    val alamat = stringArrayResource(R.array.mahasiswa_alamat)

    val daftarMahasiswa = listOf(
        Mahasiswa(
            nama = nama[0],
            telepon = telepon[0],
            alamat = alamat[0],
            warnaCard = R.color.card_gray,
            warnaTelepon = R.color.text_yellow,
            warnaAlamat = R.color.text_yellow
        ),
        Mahasiswa(
            nama = nama[1],
            telepon = telepon[1],
            alamat = alamat[1],
            warnaCard = R.color.card_purple,
            warnaTelepon = R.color.text_cyan,
            warnaAlamat = R.color.text_yellow
        ),
        Mahasiswa(
            nama = nama[2],
            telepon = telepon[2],
            alamat = alamat[2],
            warnaCard = R.color.card_blue,
            warnaTelepon = R.color.text_cyan,
            warnaAlamat = R.color.text_blue_light
        ),
        Mahasiswa(
            nama = nama[3],
            telepon = telepon[3],
            alamat = alamat[3],
            warnaCard = R.color.card_green,
            warnaTelepon = R.color.text_cyan,
            warnaAlamat = R.color.text_white
        )
    )
