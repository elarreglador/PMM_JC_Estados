package com.elarreglador.ud2_estados

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun StatelessCounter(
    count: Int,
    // El paramatro onIncrement tiene la tarea que se hara en el onClick del Boton
    onIncrement: () -> Unit,
    modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .padding(16.dp),
        Arrangement.Center,
        Alignment.CenterHorizontally) {
        if (count > 0) {
            Text("Has bebido $count vasos.")
        }
        Button(
            onClick = onIncrement,
            Modifier.padding(top = 8.dp),
            enabled = count < 10) {
            Text("Add one")
        }
    }
}

@Composable
fun StatefulCounter(modifier: Modifier = Modifier) {
    var count by rememberSaveable { mutableStateOf(0) }
    StatelessCounter(
        count = count,
        // le pasamos la tarea que debe hacer en onIncrement
        onIncrement = { count++ },
        modifier = modifier)
}


