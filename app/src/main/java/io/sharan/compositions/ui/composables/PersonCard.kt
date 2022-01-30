package io.sharan.compositions.ui.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.sharan.compositions.business.domain.model.Person
import io.sharan.compositions.ui.theme.DraftTheme
import io.sharan.compositions.ui.theme.Purple40
import io.sharan.compositions.ui.theme.grey200


/**
 * Created by sharan on 30/01/22.
 */


/**
 * Composable to create a person card 1 box
 */
@Composable
fun PersonCard(person: Person) {
    var details by remember { mutableStateOf(person.name) }
    val user = mutableStateOf(true)
    val dob = mutableStateOf(true)
    val loc = mutableStateOf(true)
    val phone = mutableStateOf(true)
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(16.dp)) {
        Surface(shape = RoundedCornerShape(4.dp), color = grey200) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(16.dp)
            ) {
                Text(text = details.toString(), color = Purple40, )
            }
        }

    }
}

@Preview
@Composable
fun Preview() {
    DraftTheme() {
        PersonCard(
            Person(id = 0,
                "Elliot Alderson", "12-12-2012", "Embassy Village, Gurgaon, adiuasiduiudhiasduhaisdhiasd", "+91 12334"
            )
        )
    }
}